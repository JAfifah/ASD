import java.util.Scanner;

public class Main {//AFIFAH
    static Kendaraan[] kendaraanList = {
            new Kendaraan("IS 4567 YV", "CILA", "Mobil", 1200, 2012, 4),
            new Kendaraan("IN 4511 VS", "LOIS", "Mobil", 1500, 2015, 3),
            new Kendaraan("AB 4321 A", "WIKWIK", "Motor", 150, 2010, 2),
            new Kendaraan("B 1234 AG", "VALIN", "Motor", 250, 2020, 1)
    };

    static Node head = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("====================Menu=====================");
            System.out.println("1. Daftar kendaraan");
            System.out.println("2. Bayar pajak");
            System.out.println("3. Tampilkan Seluruh transaksi");
            System.out.println("4. Urutan transaksi berdasar nama pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Pilihan tidak valid. Masukkan angka antara 1-5.");
                scanner.next(); // AFIFAH
                System.out.print("Pilih (1-5): ");
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    daftarKendaraan();
                    break;
                case 2:
                    bayarPajak(scanner);
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    urutkanTransaksiBerdasarNama();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void daftarKendaraan() {
        System.out.println("_____________________________________________");
        System.out.println("            DAFTAR KENDARAAN");
        System.out.println("_____________________________________________");
        System.out.println("Nomor TNKB\t|Nama Pemilik\t|Jenis\t|Tahun\t|Bulan harus Bayar");
        for (Kendaraan k : kendaraanList) {
            System.out.println(k.noTNKB + "\t|" + k.nama + "\t\t|" + k.jenis + "\t|" + k.tahun + "\t|" + k.bulanHarusBayar);
        }
    }

    public static void bayarPajak(Scanner scanner) {
        System.out.println("_____________________________________________");
        System.out.println("        MASUKKAN DATA PEMBAYARAN");
        System.out.println("_____________________________________________");
        System.out.print("Masukkan Nomor TNBK: ");
        scanner.nextLine();  // AFIFAH
        String noTNKB = scanner.nextLine();
        System.out.print("Bulan Bayar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Input tidak valid. Masukkan angka.");
            scanner.next(); // AFIFAH
            System.out.print("Bulan Bayar: ");
        }
        int bulanBayar = scanner.nextInt();

        Kendaraan kendaraan = null;
        for (Kendaraan k : kendaraanList) {
            if (k.noTNKB.equals(noTNKB)) {
                kendaraan = k;
                break;
            }
        }

        if (kendaraan == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        long nominalBayar = 0;
        long denda = 0;

        if (kendaraan.jenis.equals("Motor")) {
            if (kendaraan.cc < 100) {
                nominalBayar = 100000;
            } else if (kendaraan.cc <= 250) {
                nominalBayar = 250000;
            } else {
                nominalBayar = 500000;
            }
        } else if (kendaraan.jenis.equals("Mobil")) {
            if (kendaraan.cc < 1000) {
                nominalBayar = 750000;
            } else if (kendaraan.cc <= 2500) {
                nominalBayar = 1000000;
            } else {
                nominalBayar = 1500000;
            }
        }

        if (bulanBayar > kendaraan.bulanHarusBayar) {
            int selisihBulan = bulanBayar - kendaraan.bulanHarusBayar;
            if (selisihBulan <= 3) {
                denda = 50000 * selisihBulan;
            } else {
                denda = 50000 * selisihBulan;
            }
        }

        TransaksiPajak transaksi = new TransaksiPajak(nominalBayar, denda, bulanBayar, kendaraan);
        Node newNode = new Node(transaksi);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("kode\t|TNKB\t\t|NAMA\t\t|NOMINAL\t|DENDA");
        System.out.println(transaksi.kode + "\t|" + kendaraan.noTNKB + "\t|" + kendaraan.nama + "\t\t|" + nominalBayar + "\t\t|" + denda);
    }

    public static void tampilkanSeluruhTransaksi() {
        System.out.println("_____________________________________________");
        System.out.println("    DAFTAR TRANSAKSI PEMBAYARAN PAJAK");
        System.out.println("_____________________________________________");
        System.out.println("KODE\t|TNKB\t\t|NAMA\t|NOMINAL\t|DENDA");

        Node temp = head;
        long totalPendapatan = 0;
        while (temp != null) {
            TransaksiPajak transaksi = temp.transaksi;
            System.out.println(transaksi.kode + "\t|" + transaksi.kendaraan.noTNKB + "\t|" + transaksi.kendaraan.nama + "\t\t|" + transaksi.nominalBayar + "\t\t|" + transaksi.denda);
            totalPendapatan += transaksi.nominalBayar + transaksi.denda;
            temp = temp.next;
        }
        System.out.println("_____________________________________________");
        System.out.println("            TOTAL PENDAPATAN");
        System.out.println("_____________________________________________");
        System.out.println("Pendapatan hari ini :" + totalPendapatan);
    }

    public static void urutkanTransaksiBerdasarNama() {
        System.out.println("_____________________________________________");
        System.out.println("DAFTAR TRANSAKSI PEMBAYARAN PAJAK (URUT NAMA)");
        System.out.println("_____________________________________________");
    
        if (head == null) {
            System.out.println("Belum ada transaksi yang dilakukan.");
            return;
        }
    
        boolean swapped;
        Node current;
        Node last = null;
    
        do {
            swapped = false;
            current = head;
    
            while (current.next != last) {
                if (current.transaksi.kendaraan.nama.compareTo(current.next.transaksi.kendaraan.nama) > 0) {
                    // INI DI SWAP
                    TransaksiPajak temp = current.transaksi;
                    current.transaksi = current.next.transaksi;
                    current.next.transaksi = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    
        // MENAMPILKAN URUTAN
        Node temp = head;
        System.out.println("KODE\t|TNKB\t\t|NAMA\t\t|NOMINAL\t|DENDA");
        while (temp != null) {
            TransaksiPajak transaksi = temp.transaksi;
            System.out.println(transaksi.kode + "\t|" + transaksi.kendaraan.noTNKB + "\t|" + transaksi.kendaraan.nama + "\t\t|" + transaksi.nominalBayar + "\t\t|" + transaksi.denda);
            temp = temp.next;
        }
    }
    
}
