import java.util.Scanner;

public class PesanKamar {//afifah
    private String[] daftarKamar = { "Kamar Standar", "Kamar Deluxe", "Kamar Suite" };
    private double[] hargaKamar = { 200000, 400000, 800000 };
    private int[] ketersediaanKamar = { 5, 3, 2 };

    public void tampilkanDaftarKamar() {
        System.out.println("Daftar Kamar:");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < daftarKamar.length; i++) {
            System.out.println((i + 1) + ". " + daftarKamar[i] + " - Harga: " + hargaKamar[i] + "/malam - Tersedia: " + ketersediaanKamar[i]);
        }
    }

    public void pesanKamar(Scanner input, Saldo saldo) {
        tampilkanDaftarKamar();
        System.out.print("Pilih nomor kamar (1/2/3): ");
        int nomorKamar = input.nextInt() - 1;

        if (nomorKamar >= 0 && nomorKamar < daftarKamar.length) {
            if (ketersediaanKamar[nomorKamar] > 0) {
                System.out.print("Masukkan jumlah hari menginap: ");
                int jumlahHari = input.nextInt();

                double totalBiaya = hargaKamar[nomorKamar] * jumlahHari;
                System.out.println("Total biaya: " + totalBiaya);

                if (totalBiaya <= saldo.getSaldo()) {
                    saldo.kurangiSaldo(totalBiaya);
                    ketersediaanKamar[nomorKamar]--;
                    System.out.println("Pemesanan berhasil!");
                } else {
                    System.out.println("Saldo tidak mencukupi untuk pemesanan ini.");
                }
            } else {
                System.out.println("Kamar tidak tersedia.");
            }
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }
    }
}
//afifah