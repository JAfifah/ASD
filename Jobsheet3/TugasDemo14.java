import java.util.Scanner;

public class TugasDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;//afifah14
        System.out.print("Masukkan berapa mahasiswa yang ingin di data : ");
        length = sc.nextInt();

        Tugas1_14[] mahasiswa = new Tugas1_14[length];
        double ipk;
        String nama, nim, jenisKelamin;

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            mahasiswa[i] = new Tugas1_14(nama, nim, jenisKelamin, ipk);
            System.out.println();
        }
        Tugas1_14 tugas1_14 = new Tugas1_14();
        tugas1_14.cetakInfo(mahasiswa);
    }
}
//afifah14