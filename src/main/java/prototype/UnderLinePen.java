package prototype;

import java.nio.charset.StandardCharsets;

public class UnderLinePen implements Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println(str);
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }

        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product = null;

        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
