package task3;

public class ShoppingCart {
    private CartItem[] items;
    private int itemCount;

    public ShoppingCart(int capacity) {
        this.items = new CartItem[capacity];
        this.itemCount = 0;
    }

    public void addItem(Product product, int quantity) {
        if (itemCount < items.length) {
            CartItem newItem = new CartItem(product, quantity);
            items[itemCount] = newItem;
            itemCount++;
            System.out.println("Added " + quantity + "to " + product.getName());
        } else {
            System.out.println("Cart is full");
        }
    }

    public void removeItem(String productName) {
        int indexToRemove = -1;

        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProduct().getName().equals(productName)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
            }

            items[itemCount - 1] = null;
            itemCount--;
            System.out.println("Removed " + productName);
        } else {
            System.out.println("Cart is empty");
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    public void showCart() {
        for (int i = 0; i < itemCount; i++) {
            CartItem item = items[i];
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName() +
                    " ($" + item.getProduct().getPrice() + ")");
        }
        System.out.println("Total $" + getTotalPrice());
    }
}
