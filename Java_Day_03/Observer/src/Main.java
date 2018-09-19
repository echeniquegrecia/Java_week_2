import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        Customer customer1 = new Customer("Customer 1");
        Customer customer2 = new Customer("Customer 2");
        Customer customer3 = new Customer("Customer 3");
        Customer customer4 = new Customer("Customer 4");

        ArrayList<Customer> list = new ArrayList();
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);

        order.setObserver(list);
        order.setData("123.5326, 237.9277", "6W 40th Street, New York", 10);
    }
}
