public class Buku14 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, diskon, hargaBayar;
    
    public Buku14(){

    }
    public Buku14(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang  = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
        System.out.println("============================");
       
       
    }

    void hargaSetelahDiskon(){
        System.out.println("Harga Setelah Diskon:  " + hargaBayar);
    }

    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml  + " Buku Tersisa");
        }else{
            System.out.println("stok tidak valid");
        }
        hitungHargaTotal(jml);
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(int jmlBukuTerjual){
        hargaTotal = harga * jmlBukuTerjual;
        hitungDiskon();
    }

    void hitungDiskon(){
        if (hargaTotal > 150000 ) {
            diskon = (int) (0.12 * hargaTotal);
        }else if(hargaTotal > 75000 || hargaTotal < 150000){
            diskon = (int) (0.05 * hargaTotal);
        }
        hitungHargaBayar();
    }
    
    void hitungHargaBayar(){
        hargaBayar = hargaTotal - diskon;
    }
}