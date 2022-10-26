import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Guest1");
        Order order4 = new Order("Guest2");
        Order order5 = new Order("Guest3");
        Item item1 = new Item("Item1", 2.44);
        Item item2 = new Item("Item2", 5.4);
        Item item3 = new Item("Item3", 6.44);
        Item item4 = new Item("Item4", 7.44);
        order1.addItem(item1);
        order1.addItem(item2);
        order3.addItem(item2);
        order3.addItem(item3);
        order3.addItem(item4);
        order2.addItem(item1);
        // order3.display();
        order3.setReady();
        order2.getStatusMessage();
    }
}
