public class PersegiPanjang14 {
    public int panjang;
    public int lebar;

    public PersegiPanjang14(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public PersegiPanjang14()
    {

    }
    public void cetakInfo(PersegiPanjang14[] arrayOfPersegiPanjang14)
    {
        for (int i = 0; i < arrayOfPersegiPanjang14.length ; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang14[i].panjang, arrayOfPersegiPanjang14[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang14[i].panjang, arrayOfPersegiPanjang14[i].lebar);
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang14[i].panjang + ", lebar: " + arrayOfPersegiPanjang14[i]. lebar+", luas: "+ luas+ ", keliling: "+keliling );
        }
    }

    public int hitungLuas(int p, int l)
    {
        int luas = 0;
        luas = p * l;
        return luas;
    }
    public int hitungKeliling(int p, int l)
    {
        int keliling = 0;
        keliling = 2*(p+l);
        return keliling;
    }
}
