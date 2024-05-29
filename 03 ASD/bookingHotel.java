import java.util.Scanner;

public class  bookingHotel{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double saldo = 0;
        String[] daftarKamar = { "Kamar Standar", "Kamar Deluxe", "Kamar Suite" };
        double[] hargaKamar = { 200000, 400000, 800000 };
        int pilihanKamar;
        int[] ketersediaanKamar = { 5, 3, 2 };
        String[] kamarTerbooking = new String[10];
        String[] tanggalPemesanan = new String[10];
        int jumlahKamarTerbooking = 0;
        String next, bayar = "";

        System.out.println();
        System.out.println("============================================");
        System.out.println();
        System.out.println("      Selamat datang di Tidurin.Aja!");

        while (true) {
            System.out.println();
            System.out.println("=============== M E N U ====================");
            System.out.println("1. Saldo");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. List Kamar Terbooking");
            System.out.println("4. Keluar");
            System.out.println("--------------------------------------------");
            System.out.print("Pilih nomor (1/2/3/4): ");
            pilihan = input.nextInt();
            System.out.println();

            if (pilihan == 1) {
                System.out.println("============================================");
                System.out.println("Saldo anda sekarang: " + saldo);
                System.out.println();
                System.out.println("=============== M E N U ====================");
                System.out.println("1. Tambah saldo");
                System.out.println("2. Kembali");
                System.out.println("--------------------------------------------");
                System.out.print("Pilih nomor (1/2): ");
                int pilihanSaldo = input.nextInt();

                if (pilihanSaldo == 1) {
                    System.out.print("\nMasukkan nominal saldo yang ditambahkan: ");
                    double tambahanSaldo = input.nextDouble();
                    saldo += tambahanSaldo;
                    System.out.println("Saldo Anda sekarang: " + saldo);
                } else if (pilihanSaldo == 2) {

                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (pilihan == 2) {
                tampilanKamarTersedia(daftarKamar, hargaKamar, ketersediaanKamar);

                System.out.print("Pilih jenis kamar (1/2/3): ");
                pilihanKamar = input.nextInt();
                pilihanKamar--;

                if (pilihanKamar >= 0 && pilihanKamar < daftarKamar.length) {
                    if (ketersediaanKamar[pilihanKamar] > 0) {
                        System.out.print("Jumlah kamar: ");
                        int jumlahKamar = input.nextInt();
                        input.nextLine();

                        System.out.print("Berapa hari anda akan menginap: ");
                        int jumlahHari = input.nextInt();
                        input.nextLine();

                        double totalPembayaran = hargaKamar[pilihanKamar] * jumlahHari * jumlahKamar;

                        if (totalPembayaran > saldo) {
                            System.out.println("Saldo tidak mencukupi untuk pemesanan ini.");
                        } else {
                            System.out.println();
                            System.out.println("Total yang harus anda bayar sebesar: " + totalPembayaran);

                            while (true) {
                                System.out.println("Tekan (y) untuk konfirmasi dan tekan (n) untuk membatalkan");
                                bayar = input.nextLine();

                                if (bayar.equalsIgnoreCase("y") || bayar.equalsIgnoreCase("n")) {
                                    break;
                                } else {
                                    System.out.println("Pilihan tidak valid. Silakan masukkan 'y' atau 'n'.");
                                }
                            }

                            if (bayar.equalsIgnoreCase("y")) {
                                System.out.print("Masukkan tanggal pemesanan (DD/MM/YYYY): ");
                                tanggalPemesanan[jumlahKamarTerbooking] = input.next();
                                input.nextLine();

                                kamarTerbooking[jumlahKamarTerbooking] = daftarKamar[pilihanKamar];
                                jumlahKamarTerbooking++;

                                saldo -= totalPembayaran;
                                ketersediaanKamar[pilihanKamar] -= jumlahKamar;

                                System.out.println("Pembayaran berhasil!");
                                System.out.println("Sisa saldo anda: " + saldo);
                                detailPembayaran(daftarKamar[pilihanKamar], hargaKamar[pilihanKamar], jumlahKamar, jumlahHari, totalPembayaran, tanggalPemesanan[jumlahKamarTerbooking - 1]);
                            } else if (bayar.equalsIgnoreCase("n")) {
                                System.out.println("Pemesanan dibatalkan. Tidak ada saldo yang dikurangkan.");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        }
                    } else {
                        System.out.println("Kamar tidak tersedia.");
                    }
                } else {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }
            } else if (pilihan == 3) {
                System.out.println("Kamar yang sudah terbooking: ");

                if (jumlahKamarTerbooking > 0) {
                    for (int i = 0; i < jumlahKamarTerbooking; i++) {
                        System.out.println(kamarTerbooking[i]);
                    }
                } else {
                    System.out.println("Belum ada kamar yang terbooking.");
                }

                System.out.println("Tekan (y) untuk kembali ke menu.");
                next = input.next();

                if (next.equalsIgnoreCase("y")) {
                    continue;
                }

            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Sampai jumpa.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }

    public static void tampilanKamarTersedia(String[] daftarKamar, double[] hargaKamar, int[] ketersediaanKamar) {
        System.out.println("Daftar Kamar:");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < daftarKamar.length; i++) {
            System.out.println((i + 1) + ". " + daftarKamar[i] + hargaKamar[i] + "/malam - Tersedia: " + ketersediaanKamar[i]);
        }
    }

    public static void detailPembayaran(String jenisKamar, double hargaKamar, int jumlahKamar, int jumlahHari, double totalPembayaran, String tanggalPemesanan) {
        System.out.println(" ");
        System.out.println("Tidurin.aja \nBooking Hotel Mudah dan Aman");
        System.out.println("============================================");
        System.out.println("           DETAIL PEMBAYARAN :");
        System.out.println("============================================");
        System.out.println("Tanggal Pemesanan: " + tanggalPemesanan);
        System.out.println("Jenis Kamar: " + jenisKamar);
        System.out.println("Harga Kamar per Malam: " + hargaKamar);
        System.out.println("Jumlah Kamar: " + jumlahKamar);
        System.out.println("Jumlah Hari: " + jumlahHari);
        System.out.println("Total Pembayaran: " + totalPembayaran);
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("Terimakasih \nSelamat Staycation");
    }
}