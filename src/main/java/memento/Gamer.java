package memento;

import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<String>();
    private Random random = new Random();
    private static String[] friutName = {
            "りんご",
            "ぶどう",
            "バナナ",
            "みかん"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;

        switch(dice){
            case 1:
                money += 100;
                System.out.println("所持金が増えました");
            case 2:
                money /= 2;
                System.out.println("所持金が半分になりました");
            case 6:
                String givenFruit = getFruits();
                System.out.println("フルーツ(" + givenFruit +  ")をもらいました。");
                fruits.add(givenFruit);
            default:
                System.out.println("何も起こりませんでした。");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator iterator = fruits.iterator();
        while(iterator.hasNext()) {
            String fruit = (String) iterator.next();
            if(fruit.startsWith("おいしい")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void undo(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "";
    }

    private String getFruits() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + friutName[random.nextInt(friutName.length)];
    }

}
