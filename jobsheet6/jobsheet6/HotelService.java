// HotelService.java
package jobsheet6;

public class HotelService {
    Hotel14 hotels[] = new Hotel14[4];
    int index;

    void tambah(Hotel14 H){
        if (index < hotels.length) {
            hotels[index] = H;
            index++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampilAll(){
        for (Hotel14 H : hotels) {
            H.tampilAll();
        }
    }

    void bubbleSort(){
        for (int i = 0; i < hotels.length-1; i++) {
            for (int j = 1; j < hotels.length-i; j++) {
                if (hotels[j].harga < hotels[j-1].harga) {
                    Hotel14 tmp = hotels[j];
                    hotels[j] = hotels[j-1];
                    hotels[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < hotels.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < hotels.length; j++) {
                if (hotels[j].harga > hotels[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel14 tmp = hotels[idxMin];
            hotels[idxMin] = hotels[i];
            hotels[i] = tmp;
        }
    }
}
