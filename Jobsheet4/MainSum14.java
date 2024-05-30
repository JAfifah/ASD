import java.util.Scanner;

public class MainSum14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
        
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        
        Sum14[] phs = new Sum14[elm];

        for (int i = 0; i < elm; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            int month = sc.nextInt();
            phs[i] = new Sum14(month);

            System.out.println("Masukkan keuntungan untuk perusahaan ke-" + (i + 1));
            for (int j = 0; j < phs[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " : ");
                phs[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("==============================================================");
        for (int i = 0; i < elm; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + phs[i].elemen + " bulan adalah = " + String.format("%.2f",phs[i].totalBF(phs[i].keuntungan)));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + phs[i].elemen + " bulan adalah = " + String.format("%.2f",phs[i].totalDC(phs[i].keuntungan, 0, phs[i].elemen - 1)));
            System.out.println("==============================================================");
        }
    }
}
