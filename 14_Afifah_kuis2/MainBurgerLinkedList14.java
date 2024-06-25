import java.util.Scanner;

public class MainBurgerLinkedList14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BurgerLinkedList14 burgerList = new BurgerLinkedList14();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Burger");
            System.out.println("2. Hapus Burger");
            System.out.println("3. Lihat Burger");
            System.out.println("4. Cetak Semua Burger");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID Burger: ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Burger: ");
                    String nama = scanner.nextLine();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();
                    burgerList.tambahBurger(new Burger14(id, nama, harga));
                    break;
                case 2:
                    System.out.print("ID Burger yang dihapus: ");
                    id = scanner.nextLine();
                    burgerList.hapusBurger(id);
                    break;
                case 3:
                    System.out.print("ID Burger yang dicari: ");
                    id = scanner.nextLine();
                    Burger14 burger = burgerList.getBurger(id);
                    if (burger != null) {
                        System.out.println(burger);
                    } else {
                        System.out.println("Burger tidak ditemukan");
                    }
                    break;
                case 4:
                    burgerList.cetakSemuaBurger();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
