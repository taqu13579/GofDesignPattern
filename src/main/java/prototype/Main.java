package prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen pen = new UnderLinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox pBox = new MessageBox('*');

        manager.register("strong message", pen);
        manager.register("warning box", mBox);
        manager.register("slash box", pBox);

        Product product1 = manager.create("strong message");
        product1.use("Hello world");
        Product product2 = manager.create("warning box");
        product2.use("Hello world");
        Product product3 = manager.create("slash box");
        product3.use("Hello world");
    }
}
