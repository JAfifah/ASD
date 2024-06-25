import java.util.LinkedList;

public class BurgerLinkedList14 {
    private LinkedList<Burger14> burgers;

    public BurgerLinkedList14() {
        burgers = new LinkedList<>();
        // Menambahkan data awal
        burgers.add(new Burger14("B001", "Krabby Patty", 59900));
        burgers.add(new Burger14("B002", "Double Krabby Patty", 79900));
        burgers.add(new Burger14("B003", "Krabby Deluxe", 69900));
        burgers.add(new Burger14("B004", "Double Krabby Deluxe", 89900));
    }

    public void tambahBurger(Burger14 burger) {
        burgers.add(burger);
    }

    public void hapusBurger(String id) {
        burgers.removeIf(b -> b.getId().equals(id));
    }

    public Burger14 getBurger(String id) {
        for (Burger14 b : burgers) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null; // Jika tidak ditemukan
    }

    public void cetakSemuaBurger() {
        for (Burger14 b : burgers) {
            System.out.println(b);
        }
    }
}
