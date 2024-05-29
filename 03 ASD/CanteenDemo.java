public class CanteenDemo {

    public static void main(String[] args) {
        Item14 item1 = new Item14();
        item1.name = "Ceker Bakar";
        item1.price = 10000;
        item1.stock = 15;
        item1.displayInfo();

        Item14 item2 = new Item14();
        item2.name = "Sate Ular";
        item2.price = 50000;
        item2.stock = 1;
        item2.displayInfo();

        Item14 item3 = new Item14();
        item3.name = "Jus Mengkudu";
        item3.price = 5000;
        item3.stock = 20;
        item3.displayInfo();
    }
}