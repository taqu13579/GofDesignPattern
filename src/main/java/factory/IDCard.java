package factory;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作成します");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使用します");
    }

    public String getOnwer() {
        return this.owner;
    }
}
