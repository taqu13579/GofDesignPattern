package factory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private ArrayList<String> owners = new ArrayList<String>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard)product;
        String owner = idCard.getOnwer();
        owner.equals(owner);
    }
}
