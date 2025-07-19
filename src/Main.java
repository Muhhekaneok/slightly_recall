import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(1, "Sushi", 10, 845));
        allOrders.add(new Order(2, "Beer", 4, 614));
        allOrders.add(new Order(3, "Chips", 2, 96));
        allOrders.add(new OnlineOrder(4, "Pizza Margarita", 2, 2100, 180));
        allOrders.add(new OnlineOrder(5, "Pizza Pepperoni", 1, 1120, 180));

        for (Order order: allOrders) {
            System.out.printf("Detail info: %s", order.printDetails());
            System.out.printf("Total price of the order: %s%n%n", order.getTotalPrice());
        }
    }
}

class Order implements Printable {
    int id;
    String productName;
    int quantity;
    int price;

    public Order(int id, String productName, int quantity, int price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    int getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String printDetails() {
        return String.format(
                "Product id is %s, product name is %s, price is %s, quantity is %s%n",
                id, productName, price, quantity
        );
    }
}

class OnlineOrder extends Order {
    int deliveryFree;

    public OnlineOrder(int id, String productName, int quantity, int price, int deliveryFree) {
        super(id, productName, quantity, price);
        this.deliveryFree = deliveryFree;
    }

    @Override
    public String printDetails() {
        return String.format(
                "Product id is %s, product name is %s, price is %s, quantity is %s, delivery fee is %s%n",
                id, productName, price, quantity, deliveryFree
        );
    }

    @Override
    int getTotalPrice() {
        return super.getTotalPrice() + deliveryFree;
    }
}

interface Printable {
    String printDetails();
}