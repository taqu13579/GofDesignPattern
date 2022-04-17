package factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.createProduct("山田");
        Product card2 = factory.createProduct("鈴木");
        Product card3 = factory.createProduct("佐藤");
        card1.use();
        card2.use();
        card3.use();
    }
}
