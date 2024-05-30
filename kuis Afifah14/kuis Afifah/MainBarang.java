import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        Barang[] daftarBarang = {
            new Barang("K01", "Sabun", 1000.0, 5),
            new Barang("K02", "Odol", 2000.0, 10),
            new Barang("K03", "Biore", 3000.0, 23),
            new Barang("K04", "Sampo", 4000.0, 55),
            new Barang("K05", "Kapas", 5000.0, 65)
        };

        TransaksiBarang transaksi = new TransaksiBarang(daftarBarang);
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n====== Toko Afifah Jaya ======");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Melakukan Pembelian");
            System.out.println("3. Tampilkan Daftar Pembelian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    do {
                        System.out.print("Masukkan kode barang yang ingin dibeli: ");
                        String kode = scanner.next();
                        transaksi.melakukanPembelian(kode);
                        System.out.print("Apakah ingin membeli barang lagi? (Y/N): ");
                    } while (scanner.next().equalsIgnoreCase("Y"));
                    break;
                case 3:
                    System.out.print("Masukkan kode barang yang dibeli: ");
                    String kode = scanner.next();
                    transaksi.tampilkanBarangPembelian(kode);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
