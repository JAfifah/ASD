import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();

        System.out.println("Masukkan jumlah mahasiswa:");
        int jumMhs = s.nextInt();

        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("------------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.print("NIM: ");
        int cari = s.nextInt();
        
        System.out.println("Mencari menggunakan sequential Search");
        int posisiSeq = data.FindSeqSearch(cari);
        data.Tampilpoisisi(cari, posisiSeq);
        data.TampilData(cari, posisiSeq);

        System.out.println("------------------------------------------------------");
        System.out.println("Mencari menggunakan binary Search");
        int posisiBin = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilpoisisi(cari, posisiBin);
        data.TampilData(cari, posisiBin);
    }
}
