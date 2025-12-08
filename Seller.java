import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
  //  private List<FurnitureItem> itemsForSale = new ArrayList<>();

    public Seller(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public boolean login(String email, String password) {
        boolean ok = this.email.equals(email);
        System.out.println((ok ? "Seller login success for " : "Seller login failed for ") + name);
        return ok;
    }
/*
    public void addItemForSale(FurnitureItem item) {
        itemsForSale.add(item);
    }

    public void updatePrice(int itemId, double newPrice) throws ItemNotFoundException {
        for (FurnitureItem i : itemsForSale) {
            if (i.getItemId() == itemId) {
                i.setPrice(newPrice);
                return;
            }
        }
        throw new ItemNotFoundException("Seller does not have item with id: " + itemId);
    }

    public List<FurnitureItem> getItemsForSale() {
        return itemsForSale;
    }*/
}
