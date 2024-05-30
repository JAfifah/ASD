import java.util.Scanner;
public class fungsi14 {

    public static final String[] namaBunga = { "Aglonema", "Keladi  ", "Alocasia", "Mawar   " };
    
    public static int[][] stok = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    public static final int[] HARGA = { 75000, 50000, 60000, 10000 };
    public static final int[] KEMATIAN = { 1, 2, 0, 5 };

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        tampilkanPendapatan();
        tampilkanStok(4);
    }

    public static void tampilkanPendapatan() {
        int [] pendapatan = {0, 0, 0, 0};
        System.out.println("========================================");
        System.out.println("              Royal Garden              ");
        System.out.println("========================================");
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan[i] += stok[i][j] * HARGA[j];
            }
            System.out.println("Pendapatan untuk RoyalGarden " + (i + 1) + ": " + pendapatan[i]);
        }
    }

    public static void tampilkanStok(int cabang) {
        System.out.println("========================================");
        System.out.println("Stok untuk RoyalGarden " + cabang + ": ");
        for (int i = 0; i < stok[cabang - 1].length; i++) {
            System.out.print(namaBunga[i]+" : ");
            System.out.println(stok[cabang - 1][i]);
        }
        perbaruiStok(cabang);
    }

    public static void perbaruiStok(int cabang) {
        System.out.println("========================================");
        System.out.println("Stock setelah dikurangi kematian:");
        for (int i = 0; i < stok[cabang - 1].length; i++) {
            System.out.print(namaBunga[i]+" : ");
            System.out.println(stok[cabang - 1][i]-KEMATIAN[i]);
        }
        System.out.println("========================================");
    }
}