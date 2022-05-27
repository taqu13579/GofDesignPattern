package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class AccountFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new Account(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((Account)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
