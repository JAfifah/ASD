import java.util.Scanner;
public class pemilihan14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
        float nilaiAkhir, nilaiSetara=0;
        String nilaiHuruf = "";
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukan Nilai Tugas : ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukan Nilai Kuis  : ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukan Nilai UTS   : ");
        nilaiUts = input.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        nilaiUas = input.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        if ((nilaiTugas > 100 || nilaiTugas < 0) || (nilaiKuis > 100 || nilaiKuis < 0) ||
                (nilaiUts > 100 || nilaiUts < 0) || (nilaiUas > 100 || nilaiUas < 0)) {
            System.out.println("Nilai Tidak Valid!");
        } else {
            nilaiAkhir = (float) ((0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.4 * nilaiUas));
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
            if (nilaiAkhir > 80){
                nilaiSetara = 4; nilaiHuruf = "A";
            } else if (nilaiAkhir > 73){
                nilaiSetara = 3.5F; nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65){
                nilaiSetara = 3; nilaiHuruf = "B";
            } else if (nilaiAkhir > 60){
                nilaiSetara = 2.5F; nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50){
                nilaiSetara = 2; nilaiHuruf = "C";
            }else if (nilaiAkhir > 39){
                nilaiSetara = 1; nilaiHuruf = "D";
            }else {  
                nilaiSetara = 0; nilaiHuruf = "E";
            }
        } //Afifah

        System.out.println("Nilai Setara    : " + nilaiSetara);
        System.out.println("Nilai Huruf     : " + nilaiHuruf);
        System.out.println("===============================");
        System.out.println("===============================");
        if (nilaiSetara == 0 || nilaiSetara == 1){
            System.out.println("Maaf Anda TIDAK LULUS!!");
            System.out.println("Tetap semnagat, jangan meyerah!!");
        } else {
            System.out.println("Selamat Anda LULUS!!");
        }
    }
}
//Afifah14