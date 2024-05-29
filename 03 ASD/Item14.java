public class Item14 {

    public String name;
    public double price;
    public int stock;

    public Item14() {

    }

    public Item14(String itemName, double itemPrice, int itemStock) {
        name = itemName;
        price = itemPrice;
        stock = itemStock;
    }

    public void displayInfo() {
        System.out.println("==Canteen Mba apipah==");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("======================");
    }

}