public class TransaksiBarang {
    Barang[] barangs;

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
    }

    public void tampilkanBarang() {
        System.out.println("===============================");
        System.out.println("======== Mau beli apa? ========");
        System.out.println("===============================");
        System.out.println("kode\tnama\tharga\tstok");
        for (Barang barang : barangs) {
            System.out.println(barang.kode + "\t" + barang.nama + "\t" + barang.harga + "\t" + barang.stok);
        }
    }

    public void tampilkanBarangPembelian(String kode) {
        for (Barang barang : barangs) {
            if (barang.kode.equalsIgnoreCase(kode)) {
                System.out.println("Barang yang dibeli:");
                barang.tampilkanBarang();
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

    public void melakukanPembelian(String kode) {
        for (Barang barang : barangs) {
            if (barang.kode.equalsIgnoreCase(kode)) {
                if (barang.stok > 0) {
                    barang.stok--;
                    System.out.println("Pembelian berhasil dilakukan.");
                } else {
                    System.out.println("Stok barang " + barang.nama + " habis.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }
}
