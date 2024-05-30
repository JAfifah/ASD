import java.util.Scanner;

public class perulangan14 {
    public static void urutan(int n) {
        if (n < 10) {
            n += 10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    } //afifah14

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        int angkaterakhir = Integer.parseInt(nim.substring(nim.length() - 2));
        urutan(angkaterakhir);
        scanner.close();
    }
}
//Afifah14