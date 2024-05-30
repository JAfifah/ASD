package vaksin14;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    dll.addLast(nomorAntrian, nama);
                    break;
                case 2:
                    try {
                        String namaDivaksinasi = dll.removeFirstAndGetData();
                        System.out.println(namaDivaksinasi + " telah divaksinasi");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("No.\t\tNama");
                    dll.print();
                    System.out.println("(tekan enter untuk melanjutkan)");
                    sc.nextLine(); 
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
