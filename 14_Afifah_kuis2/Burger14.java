public class Burger14 {
    private String id;
    private String nama;
    private double harga;

    public Burger14(String id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    @Override
    public String toString() {
        return "Burger [ID=" + id + ", Nama=" + nama + ", Harga=Rp" + harga + "]";
    }
}
