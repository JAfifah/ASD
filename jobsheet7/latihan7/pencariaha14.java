public class pencariaha14 {
    maha14 listMhs[] = new maha14[5];
    int idx;

    public void tambah(maha14 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            if (listMhs[i] != null) {
                listMhs[i].tampil();
                System.out.println("------------------------------------------------------");
            }
        }
    }

    public int FindBinarySearchByName(String cari, int left, int right, int count) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparison = listMhs[mid].nama.compareTo(cari);

            if (comparison < 0) {
                return FindBinarySearchByName(cari, mid + 1, right, count);
            } else if (comparison > 0) {
                return FindBinarySearchByName(cari, left, mid - 1, count);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void searchByName(String cari) {
        int pos = FindBinarySearchByName(cari, 0, idx - 1, 0);

        if (pos != -1) {
            // Check if there are multiple results
            int count = 1;
            for (int i = pos - 1; i >= 0 && listMhs[i].nama.equalsIgnoreCase(cari); i--) {
                count++;
            }
            for (int i = pos + 1; i < idx && listMhs[i].nama.equalsIgnoreCase(cari); i++) {
                count++;
            }

            if (count > 1) {
                System.out.println("Data yang ditemukan lebih dari 1");
            }

            Tampilpoisisi(cari, pos);
            TampilData(cari, pos);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    public void Tampilpoisisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t: " + listMhs[pos].nim);
            System.out.println("Nama\t: " + x);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t: " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
