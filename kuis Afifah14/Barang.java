public class Barang {
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanBarang() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Stok Barang: " + stok);
    }
}
