package percobaan2;

public class Stack14 {
    int size;
    int top;
    Pakaian14 data[];

    public Stack14(int size) {
        this.size = size;
        data = new Pakaian14[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Pakaian14 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian14 x = data[top];
            top--;
            System.out.println(
                    "Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas: " + data[top].jenis + " " +
                    data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga + " ");
        }
        System.out.println("");
    };

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMax() {
        if (!isEmpty()) {
            double hargaMax = data[0].harga;
            int indexMax = 0;
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > hargaMax) {
                    hargaMax = data[i].harga;
                    indexMax = i;
                }
            }
            System.out.println("Data dengan harga tertinggi: " + data[indexMax].jenis + " " + data[indexMax].warna +
                    " " + data[indexMax].merk + " " + data[indexMax].ukuran + " " + data[indexMax].harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
