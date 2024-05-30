package doublelinkedlists14;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("======================================");

        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("======================================");

        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("======================================");

        try {
            System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");
    }
}
