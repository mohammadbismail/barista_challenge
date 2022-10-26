import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // Constructors
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        this.ready = setReady();
    }

    public Order(String myName) {
        this.name = myName;
        this.items = new ArrayList<Item>();
        this.ready = setReady();
    }

    // Methods
    public void addItem(Item myItem) {
        this.items.add(myItem);
    }

    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready!";
        } else {
            return "Thank you for waiting, your order will be ready soon!";
        }
    }

    public void display() {
        System.out.println(this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total price is:" + this.getOrderTotal());
    }

    public double getOrderTotal() {
        double sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public boolean setReady() {
        return this.ready = true;
    }
}