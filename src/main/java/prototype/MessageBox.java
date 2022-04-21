package prototype;

public class MessageBox implements Product{
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;

        for (int i = 0; i < length + 2; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
        System.out.println(decochar + str + decochar);

        for (int i = 0; i < length + 2; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
