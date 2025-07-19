import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Sushi", 10, 845);
        Order order2 = new Order(2, "Beer", 4, 614);
        Order order3 = new Order(3, "Chips", 2, 96);

        OnlineOrder onlineOrder1 = new OnlineOrder(1, "Pizza Margarita", 2, 2100, 180);
        OnlineOrder onlineOrder2 = new OnlineOrder(2, "Pizza Pepperoni", 1, 1120, 180);

        List<Order> lstOrders = new ArrayList<>();
        lstOrders.add(order1);
        lstOrders.add(order2);
        lstOrders.add(order3);

        List<OnlineOrder> lstOnlineOrders = new ArrayList<>();
        lstOnlineOrders.add(onlineOrder1);
        lstOnlineOrders.add(onlineOrder2);

        for (Order order : lstOrders) {
            order.printDetails();
            System.out.printf("Total price of the order is %s%n%n", order.getTotalPrice());
        }

        for (OnlineOrder onlineOrder : lstOnlineOrders) {
            onlineOrder.printDetails();
            System.out.printf("Total price if the online order is %s%n%n", onlineOrder.getTotalPrice());
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
    public void printDetails() {
        System.out.printf(
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
    public void printDetails() {
        System.out.printf(
                "Product id is %s, product name is %s, price is %s, quantity is %s, delivery fee is %s%n",
                id, productName, price, quantity, deliveryFree
        );
    }

    @Override
    int getTotalPrice() {
        return quantity * price + deliveryFree;
    }
}

interface Printable {
    void printDetails();
}