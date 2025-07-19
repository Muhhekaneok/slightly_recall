package ordersmanagment;

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
