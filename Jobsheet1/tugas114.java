import java.util.Scanner;

public class tugas114 {
    public static void main(String[] args) {
        // Array kode plat mobil
        char[] KODE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        // Array nama kota yang berpasangan dengan kode plat mobil
        String[][] KOTA = {
            {"Bandung", "Semarang"},
            {"Jakarta", "Surabaya"},
            {"Makassar", "Malang"},
            {"Tegal", "Tangerang"},
            {"Banda Aceh", "Banjarmasin"}
        };
        
        // Meminta input kode plat nomor dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = scanner.next();
        
        // Mencari nama kota berdasarkan kode plat nomor yang diinputkan
        String kota = null;
        for (int i = 0; i < KODE.length; i++) {
            if (String.valueOf(KODE[i]).equalsIgnoreCase(inputKode)) {
                kota = KOTA[i][0]; // Mengambil nama kota dari indeks ke-0
                break;
            }
        }
        
        // Menampilkan hasil
        if (kota != null) {
            System.out.println("Nama kota untuk kode plat " + inputKode + " adalah " + kota);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan");
        }
        
        scanner.close();
    }
}
