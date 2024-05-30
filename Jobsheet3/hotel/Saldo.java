import java.util.Scanner;

public class Saldo {
    private double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tambahSaldo(double tambahan) {
        saldo += tambahan;
    }

    public void kurangiSaldo(double pengurangan) {
        saldo -= pengurangan;
    }

    public void tampilSaldo() {
        System.out.println("Saldo Anda saat ini: " + saldo);
    }
}
//afifah