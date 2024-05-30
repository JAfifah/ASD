public class LinkedList14 {
    Node14 head;

    public LinkedList14() {
        head = null;
    }

    // Method isEmpty
    public boolean isEmpty() {
        return (head == null);
    }

    // Method print
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node14 currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Method addFirst
    public void addFirst(int input) {
        Node14 newNode = new Node14(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method addLast
    public void addLast(int input) {
        Node14 newNode = new Node14(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node14 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertBefore(int key, int input) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
    
        if (head.data == key) {
            addFirst(input);
            return;
        }
    
        Node14 newNode = new Node14(input, null);
        Node14 currentNode = head;
        while (currentNode.next != null && currentNode.next.data != key) {
            currentNode = currentNode.next;
        }
    
        if (currentNode.next == null) {
            System.out.println("Node dengan data " + key + " tidak ditemukan");
        } else {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }
    

    // Method insertAfter
    public void insertAfter(int key, int input) {
        Node14 newNode = new Node14(input, null);
        if (!isEmpty()) {
            Node14 currentNode = head;
            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
    
        Node14 newNode = new Node14(input, null);
    
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node14 currentNode = head;
            int currentIndex = 0;
    
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            if (currentNode != null) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            } else {
                System.out.println("Index melebihi panjang linked list");
            }
        }
    }
    

    // Method getData
    public int getData(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Index tidak valid atau linked list kosong");
            return -1; // Atau bisa melempar exception
        }

        Node14 currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode.next == null) {
                System.out.println("Index melebihi panjang linked list");
                return -1; // Atau bisa melempar exception
            }
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    // Method indexOf
    public int indexOf(int key) {
        Node14 currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == key) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1; // Key tidak ditemukan
    }

    // Method removeFirst
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Method removeLast
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node14 currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Index tidak valid atau linked list kosong");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node14 currentNode = head;
        int currentIndex = 0;
    
        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentNode != null && currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        } else {
            System.out.println("Index melebihi panjang linked list");
        }
    }
    

    // Method remove
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node14 currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

}
