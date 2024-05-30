import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedLists doubleLinkedLists = new DoubleLinkedLists();

        int menu;
        do {
            System.out.println("===============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    int idFirst = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Judul Film: ");
                    String judulFirst = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingFirst = scanner.nextDouble();
                    doubleLinkedLists.addFirst(idFirst, judulFirst, ratingFirst);
                    break;

                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film: ");
                    int idLast = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Judul Film: ");
                    String judulLast = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingLast = scanner.nextDouble();
                    doubleLinkedLists.addLast(idLast, judulLast, ratingLast);
                    break;

                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("Masukkan Data Film di Index Tertentu");
                    System.out.print("ID Film: ");
                    int idIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Judul Film: ");
                    String judulIndex = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingIndex = scanner.nextDouble();
                    System.out.print("Index: ");
                    int index = scanner.nextInt();
                    doubleLinkedLists.addAtIndex(idIndex, judulIndex, ratingIndex, index);
                    break;

                case 4:
                    System.out.println("-------------------------------");
                    System.out.println("Hapus Data Film Pertama");
                    doubleLinkedLists.removeFirst(); // You need to implement this method
                    break;

                case 5:
                    System.out.println("-------------------------------");
                    System.out.println("Hapus Data Film Terakhir");
                    doubleLinkedLists.removeLast(); // You need to implement this method
                    break;

                case 6:
                    System.out.println("-------------------------------");
                    System.out.println("Hapus Data Film di Index Tertentu");
                    System.out.print("Index: ");
                    int removeIndex = scanner.nextInt();
                    doubleLinkedLists.removeAtIndex(removeIndex); // You need to implement this method
                    break;

                case 7:
                    System.out.println("-------------------------------");
                    System.out.println("Cetak Data Film");
                    doubleLinkedLists.print();
                    break;

                case 8:
                    System.out.println("-------------------------------");
                    System.out.println("Cari Film Berdasarkan ID");
                    System.out.print("ID Film: ");
                    int searchId = scanner.nextInt();
                    doubleLinkedLists.searchById(searchId);
                    break;

                case 9:
                    System.out.println("-------------------------------");
                    System.out.println("Urutkan Data Film Berdasarkan Rating - DESC");
                    doubleLinkedLists.sortRatingDesc();
                    System.out.println("Data berhasil diurutkan.");
                    break;

                case 10:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (menu != 10);

        scanner.close();
    }
}
