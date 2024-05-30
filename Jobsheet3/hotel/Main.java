import java.util.Scanner;

public class Main {//afifah
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Saldo saldo = new Saldo(1000000);
        PesanKamar pesanKamar = new PesanKamar();

        while (true) {
            System.out.println("\n============== M E N U ==============");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Keluar");
            System.out.println("--------------------------------------");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    saldo.tampilSaldo();
                    break;
                case 2:
                    pesanKamar.pesanKamar(input, saldo);
                    break;
                case 3:
                    System.out.println("Terima kasih! Sampai jumpa.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
//afifah