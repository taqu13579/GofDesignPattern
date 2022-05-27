package factoryMethod;

public class Account extends Product {
    private String owner;

    Account(String owner) {
        System.out.println("Create account: " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use account: " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
