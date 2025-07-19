package ordersmanagment;

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
