class Film {
    int id;
    String judul;
    double rating;
    Film prev;
    Film next;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}

class DoubleLinkedLists {
    private Film head;
    private int size;

    // Constructor
    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    // Method untuk menambah data di awal
    public void addFirst(int id, String judul, double rating) {
        Film newNode = new Film(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Method untuk menambah data di akhir
    public void addLast(int id, String judul, double rating) {
        Film newNode = new Film(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    // Method untuk menambah data di indeks tertentu
    public void addAtIndex(int id, String judul, double rating, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Film newNode = new Film(id, judul, rating);
            Film current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }

    // Method untuk mencetak data film
    public void print() {
        if (isEmpty()) {
            System.out.println("Data film kosong");
            return;
        }
        System.out.println("===============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        Film current = head;
        int count = 1;
        while (current != null) {
            System.out.println("ID: " + current.id);
            System.out.println("Judul Film: " + current.judul);
            System.out.println("Rating: " + current.rating);
            current = current.next;
            count++;
        }
    }

    // Method untuk mencari data berdasarkan ID
    public void searchById(int id) {
        if (isEmpty()) {
            System.out.println("Data film kosong");
            return;
        }
        Film current = head;
        int index = 1;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Data Id Film: " + id + " berada di node ke-" + index);
                System.out.println("IDENTITAS:");
                System.out.println("ID Film: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("IMDB Rating: " + current.rating);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan");
    }

    // Method untuk mengurutkan data berdasarkan rating secara descending
    public void sortRatingDesc() {
        if (isEmpty() || size == 1) {
            return;
        }
        for (Film current = head; current != null; current = current.next) {
            for (Film index = current.next; index != null; index = index.next) {
                if (current.rating < index.rating) {
                    swap(current, index);
                }
            }
        }
    }

    private void swap(Film a, Film b) {
        double tempRating = a.rating;
        int tempId = a.id;
        String tempJudul = a.judul;

        a.rating = b.rating;
        a.id = b.id;
        a.judul = b.judul;

        b.rating = tempRating;
        b.id = tempId;
        b.judul = tempJudul;
    }

    // Method untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Method untuk menghapus data pertama
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Data film kosong");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Method untuk menghapus data terakhir
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Data film kosong");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
        size--;
    }

    // Method untuk menghapus data di index tertentu
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Film current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }
}
