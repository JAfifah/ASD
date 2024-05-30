import java.util.Scanner;

public class array14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Afifah14
        System.out.println("Program Menghitung IP Semester");
        System.out.print("Masukkan jumlah mata kuliah yang Anda tempuh: ");
        int jumlahMataKuliah = scanner.nextInt();
        
        double totalBobotSKS = 0;
        double totalBobotSKSxNilai = 0;
        
    
        double[] nilaiAngka = new double[jumlahMataKuliah];
        
       
        int[] bobotSKS = new int[jumlahMataKuliah];
        
      
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("\nMasukkan nama Mata Kuliah ke-" + (i + 1) + ": ");
            scanner.nextLine(); // AFIFAH14
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("Masukkan bobot SKS Mata Kuliah ke-" + (i + 1) + ": ");
            bobotSKS[i] = scanner.nextInt();
            System.out.print("Masukkan nilai Angka untuk Mata Kuliah " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }
        
     
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            double nilaiSetara = 0;
            String nilaiHuruf = "";
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiSetara = 4.0;
                nilaiHuruf = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiSetara = 3.5;
                nilaiHuruf = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiSetara = 3.0;
                nilaiHuruf = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiSetara = 2.5;
                nilaiHuruf = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiSetara = 2.0;
                nilaiHuruf = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiSetara = 1.0;
                nilaiHuruf = "D";
            } else {
                nilaiSetara = 0;
                nilaiHuruf = "E";
            }
            System.out.println(namaMataKuliah[i] + "\t" + nilaiAngka[i] + "\t\t" + nilaiHuruf + "\t\t" + nilaiSetara);
            
     
            totalBobotSKS += bobotSKS[i];
            totalBobotSKSxNilai += (nilaiSetara * bobotSKS[i]);
        }
        
 
        double IPSemester = totalBobotSKSxNilai / totalBobotSKS;
        
    
        System.out.println("\nIP: " + String.format("%.2f", IPSemester));
        
        scanner.close();
    }
}
//jamiatul afifah 14 
