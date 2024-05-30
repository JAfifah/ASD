import java.util.Scanner;

public class MainMaha14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        pencariaha14 data = new pencariaha14();

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
            maha14 m = new maha14(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("------------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cari = s.next();
        
        System.out.println("Mencari menggunakan binary Search");
        data.searchByName(cari);
    }
}
