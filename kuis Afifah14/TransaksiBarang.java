public class TransaksiBarang {
    Barang[] barangs;
    int[] stokAwal;

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
        this.stokAwal = new int[barangs.length];
        for (int i = 0; i < barangs.length; i++) {
            stokAwal[i] = barangs[i].stok;
        }
    }

    public void melakukanPembelian(String kode) {
        for (Barang barang : barangs) {
            if (barang.kode.equalsIgnoreCase(kode)) {
                if (barang.stok > 0) {
                    barang.stok--;
                    System.out.println("Pembelian berhasil dilakukan.");
                    return;
                } else {
                    System.out.println("Stok barang " + barang.nama + " habis.");
                    return;
                }
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

    public void tampilkanDaftarPembelian() {
        System.out.println("Daftar Barang yang Telah Dibeli:");
        System.out.println("===============================");
        System.out.println("Kode\tNama\tHarga");
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].stok < stokAwal[i]) {
                System.out.println(barangs[i].kode + "\t" + barangs[i].nama + "\t" + barangs[i].harga);
            }
        }
    }
}
