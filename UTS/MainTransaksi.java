import java.util.Scanner;

public class MainTransaksi {
    static Rekening14[] rekenings = {
            new Rekening14("16030927 3084", "Wallace", "Chase Castro", "ligula.Nullam@tacitisociosqu.edu"),
            new Rekening14("16100617 0573", "Darius", "Julian Daniel", "nec@lectusjusto.org"),
            new Rekening14("16240401 2243", "Fuller", "Finn Dunlap", "convallis@Vestibulumanteipsum.org"),
            new Rekening14("16270525 0112", "Malcolm", "Keane Floyd", "porttitor.tellus.non@Curabitur.ca"),
            new Rekening14("16971204 2416", "Geofrey", "Stephen Pratt", "ut.pellentesque@luctusutpellentesque.com"),
            new Rekening14("16100727 8862", "Rudyard", "Charles Morales", "Proin.eget@velitegestaslacinia.ca"),
            new Rekening14("16460329 4259", "Troy", "Damon Guerra", "pede.Suspendisse.dui@a.ca"),
            new Rekening14("16320421 3437", "Alec", "Cooper Lee", "non@mus.com"),
            new Rekening14("16180729 7229", "Walter", "Seth Drake", "Pellentesque.ut.ipsum@neque.ca"),
            new Rekening14("16950313 6823", "Simon", "Burton Gates", "tellus.justo.sit@commodoauctor.net"),
            new Rekening14("16850708 3528", "Kamal", "Odysseus Salas", "dictum@nec.edu"),
            new Rekening14("16080205 9329", "Xenos", "Colin Curry", "vel@ullamcorpermagna.co.uk"),
            new Rekening14("16080628 2695", "Merritt", "Clarke Roman", "Aliquam.gravida@vestibulumMauris.net"),
            new Rekening14("16130909 2979", "Ryder", "Joel Cunningham", "interdum.Curabitur.dictum@rutrumurna.edu"),
            new Rekening14("16890212 8688", "Preston", "Brock Schroeder", "et.ultrices@a.co.uk"),
            new Rekening14("16141008 9963", "Alec", "Baker Barton", "ut@aultriciesadipiscing.ca"),
            new Rekening14("16511222 7763", "Price", "Ashton Burke", "Proin.velit@Duisac.net"),
            new Rekening14("16720623 0943", "Devin", "Slade Flores", "ac@nibhAliquamornare.com"),
            new Rekening14("16771126 7372", "Ignatus", "Lionel Kane", "cubilia.Curae.Phasellus@Duis.com")
    };

    static Transaksi14[] transaksis = {
            new Transaksi14(898214, 494048, 3587, "2021-03-09 07:54:42", ""),
            new Transaksi14(205420, 200162, 775880, "2021-06-25 10:23:00", ""),
            new Transaksi14(838632, 350929, 328316, "2021-09-18 23:00:04", ""),
            new Transaksi14(230659, 204434, 690503, "2022-02-02 19:10:34", ""),
            new Transaksi14(770592, 334245, 444267, "2020-08-11 13:36:56", ""),
            new Transaksi14(685302, 451002, 376442, "2020-05-23 07:34:53", ""),
            new Transaksi14(816129, 851403, 597842, "2021-07-18 19:41:20", ""),
            new Transaksi14(989609, 333823, 802752, "2022-02-01 01:13:11", ""),
            new Transaksi14(297103, 396116, 779589, "2021-07-03 01:09:49", ""),
            new Transaksi14(66190, 259150, 619774, "2021-09-09 03:57:30", ""),
            new Transaksi14(234301, 278309, 547922, "2021-08-24 13:18:39", ""),
            new Transaksi14(243306, 869468, 50283, "2021-03-12 03:40:16", ""),
            new Transaksi14(371045, 991242, 602034, "2021-08-06 11:48:59", ""),
            new Transaksi14(395170, 97058, 472273, "2021-05-02 10:53:31", ""),
            new Transaksi14(862731, 561908, 109431, "2021-07-31 08:11:00", ""),
            new Transaksi14(556798, 31387, 725426, "2021-03-27 06:18:20", ""),
            new Transaksi14(873982, 896213, 846142, "2021-07-18 04:06:30", ""),
            new Transaksi14(774247, 739406, 775848, "2020-10-24 01:39:00", ""),
            new Transaksi14(66987, 823014, 868772, "2020-12-21 05:57:59", "")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" ");
            System.out.println("---------UTS AFIFAH---------");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500.000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.println("----------------------------");
            System.out.print("Pilih(1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tampilDataRekening();
                    break;
                case 2:
                    tampilDataTransaksi();
                    break;
                case 3:
                    mencariSaldoLebihDari500000();
                    break;
                case 4:
                    sortingByName();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (choice != 5);
    }

    static void tampilDataRekening() {
        System.out.println(" ");
        System.out.println("No Rekening\tNama\t\tNama Ibu\tEmail");
        for (Rekening14 rekening : rekenings) {
            System.out.println(rekening.noRekening + "\t" + rekening.nama + "\t\t" + rekening.namaIbu + "\t" + rekening.email);
        }
    }

    static void tampilDataTransaksi() {
        System.out.println(" ");
        System.out.println("Saldo\tSaldo Awal\tSaldo Akhir\tTanggal Transaksi\t\tType");
        for (Transaksi14 transaksi : transaksis) {
            System.out.println(transaksi.saldo + "\t" + transaksi.saldoAwal + "\t" + transaksi.saldoAkhir + "\t\t"
                    + transaksi.tanggalTransaksi + "\t" + transaksi.type);
        }
    }

    static void mencariSaldoLebihDari500000() {
        System.out.println(" ");
        System.out.println("Saldo lebih dari 500000:");
        System.out.println("Saldo\tSaldo Awal\tSaldo Akhir\tTanggal Transaksi\t\tType");
        for (Transaksi14 transaksi : transaksis) {
            if (transaksi.saldo > 500000) {
                System.out.println(transaksi.saldo + "\t" + transaksi.saldoAwal + "\t" + transaksi.saldoAkhir + "\t\t"
                        + transaksi.tanggalTransaksi + "\t" + transaksi.type);
            }
        }
    }

    static void sortingByName() {
       
        for (int i = 0; i < rekenings.length - 1; i++) {
            for (int j = 0; j < rekenings.length - i - 1; j++) {
                if (rekenings[j].nama.compareTo(rekenings[j + 1].nama) > 0) {
              
                    Rekening14 temp = rekenings[j];
                    rekenings[j] = rekenings[j + 1];
                    rekenings[j + 1] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Data rekening setelah diurutkan berdasarkan nama:");
        System.out.println("No Rekening\tNama\t\tNama Ibu\tEmail");
        for (Rekening14 rekening : rekenings) {
            System.out.println(rekening.noRekening + "\t" + rekening.nama + "\t\t" + rekening.namaIbu + "\t" + rekening.email);
        }
    }
}
// Jami'atul Afifah 14