package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList<String> fruits;

    public int getMoney() {
        return this.money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return (ArrayList<String>)fruits.clone();
    }
}
