// MainHotel.java
package jobsheet6;

public class MainHotel {

    public static void main(String[] args) {
        HotelService daftar = new HotelService();

        Hotel14 htl1 = new Hotel14("NANIK", "MALANG", 200000, (byte) 2);
        Hotel14 htl2 = new Hotel14("BUDI", "BATU", 300000, (byte) 3);
        Hotel14 htl3 = new Hotel14("MIKASA", "NGANJUK", 400000, (byte) 4);
        Hotel14 htl4 = new Hotel14("TITAN", "PASURUAN", 500000, (byte) 5);

        daftar.tambah(htl1);
        daftar.tambah(htl2);
        daftar.tambah(htl3);
        daftar.tambah(htl4);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("-                        DATA SEBELUM SORTING                      -");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        daftar.tampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-    DAFTAR HARGA SETELAH SORTING (ASC) MENGGUNAKAN BUBBLE SORT    -");
        System.out.println("--------------------------------------------------------------------");
        daftar.bubbleSort();
        daftar.tampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-  DAFTAR HARGA SETELAH SORTING (DSC) MENGGUNAKAN SELECTION SORT   -");
        System.out.println("--------------------------------------------------------------------");
        daftar.selectionSort();
        daftar.tampilAll();
    }
}
