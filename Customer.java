import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String address;
    private String phone;
  //  private List<Order> orders = new ArrayList<>();

    public Customer(int userId, String name, String email, String address, String phone) {
        super(userId, name, email);
        this.address = address;
        this.phone = phone;
    }

    @Override
    public boolean login(String email, String password) {
        // For demo: accept any password; real app would verify credentials.
        boolean ok = this.email.equals(email);
        System.out.println((ok ? "Login success for " : "Login failed for ") + name);
        return ok;
    }
/*
    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }  */
}
