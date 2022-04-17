package factory;

public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String name);
    protected abstract void registerProduct(Product product);
}
