import java.util.Scanner;

public class MainPangkat14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        System.out.println("=====================================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat14[] pangkatArr = new Pangkat14[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();

            pangkatArr[i] = new Pangkat14(nilai, pangkat);
        }

        while (true) {
            System.out.println();
            System.out.println("=====================================================================");
            System.out.println("Menu Perhitungan Pangkat");
            System.out.println("=====================================================================");

            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("3. Keluar");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Masukkan pilihan Anda (1/2/3): ");
            pilihan = sc.nextInt();

            // Switch case untuk memilih metode
            switch (pilihan) {
                case 1:
                        System.out.println("=====================================================================");
                        System.out.println("Hasil Pangkat dengan Brute Force");
                        for (int i = 0; i < elemen; i++) {
                            System.out.println("Nilai " + pangkatArr[i].nilai + " pangkat " + pangkatArr[i].pangkat + " adalah : " + pangkatArr[i].pangkatBF(pangkatArr[i].pangkat, pangkatArr[i].nilai));
                        };
                    break;
                case 2:
                        System.out.println("=====================================================================");
                        System.out.println("Hasil Pangkat dengan Divide and Conquer");
                        for (int i = 0; i < elemen; i++) {
                            System.out.println("Nilai " + pangkatArr[i].nilai + " pangkat " + pangkatArr[i].pangkat + " adalah : " + pangkatArr[i].pangkatDC(pangkatArr[i].pangkat, pangkatArr[i].nilai));
                        };
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

if (n % 2 == 1) // bilangan ganjil
    return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
else // bilangan genap
    return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
