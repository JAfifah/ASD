public class SLLMain14 {
    public static void main(String[] args) {
        LinkedList14 myLinkedList = new LinkedList14();
        myLinkedList.print();

        myLinkedList.addFirst(800);
        myLinkedList.print();

        myLinkedList.addFirst(700);
        myLinkedList.print();

        myLinkedList.addLast(500);
        myLinkedList.print();

        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        // Mengakses data pada index tertentu
        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));

        // Mengetahui index dari node dengan elemen tertentu
        System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));

        // Menghapus node yang berisi elemen tertentu
        myLinkedList.remove(300);
        myLinkedList.print();

        // Menghapus node pertama
        myLinkedList.removeFirst();
        myLinkedList.print();

        // Menghapus node terakhir
        myLinkedList.removeLast();
        myLinkedList.print();
    }
}
