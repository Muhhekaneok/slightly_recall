package ordersmanagment;

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