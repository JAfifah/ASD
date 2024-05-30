package vaksin14;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int nomorAntrian, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomorAntrian, nama, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nomorAntrian, nama, null);
            current.next = newNode;
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.nomorAntrian + "\t\t" + tmp.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
        System.out.println("-------------------------------");
        System.out.println("Sisa Antrian: " + size);
    }

    public String removeFirstAndGetData() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            String nama = head.nama;
            removeFirst();
            return nama;
        }
    }

    public String removeFirstAndGetData() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            String nama = head.nama; // Simpan nama penerima yang akan dihapus
            if (size == 1) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return nama; // Kembalikan nama penerima yang dihapus
        }
    }
    

    public int getSize() {
        return size;
    }
}
