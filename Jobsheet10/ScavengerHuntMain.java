public class ScavengerHuntMain {
    public static void main(String[] args) {
        ScavengerHunt hunt = new ScavengerHunt();
        
        hunt.addPoint("Apa ibu kota Indonesia?", "Jakarta");
        hunt.addPoint("Siapa presiden pertama Indonesia?", "Soekarno");
        hunt.addPoint("Berapa jumlah provinsi di Indonesia?", "34");

        hunt.printPoints();
    }
}
