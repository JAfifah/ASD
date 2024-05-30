import java.util.Scanner;

public class PersegiPanjangDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan jumlah persegi panjang yang ingin dihitung : ");
        length = sc.nextInt();

        PersegiPanjang14[] arrayOfPersegiPanjang14 = new PersegiPanjang14[length];
        int panjang, lebar;

        for (int i = 0; i < arrayOfPersegiPanjang14.length; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang(p): ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar(l): ");
            lebar = sc.nextInt();
            //afifah14
            arrayOfPersegiPanjang14[i] = new PersegiPanjang14(panjang, lebar);
            
        }
        PersegiPanjang14 persegiPanjang14 = new PersegiPanjang14();
        persegiPanjang14.cetakInfo(arrayOfPersegiPanjang14);
        
    }
}
