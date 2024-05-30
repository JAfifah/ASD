import java.util.Scanner;

public class TUGAS_ASD2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih rumus yang akan dihitung (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");

        input.close();
    }

    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak + " meter");

        input.close();
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu + " detik");

        input.close();
    }
}
