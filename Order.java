import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Object> items = new ArrayList<Object>();

    // Constructors
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Object>();
    }

    public Order(String myName) {
        this.name = myName;
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
        System.out.printf(this.name);
        for (int i = 0 ; i < items.size(); i++){
            System.out.printf(item.name - )
        }
    }
}