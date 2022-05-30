package strategy2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("taro", 170, 60, 25);
        Human human2 = new Human("bob", 180, 50, 25);
        MyClass myClass = new MyClass(new HeightComparator());
        System.out.println(myClass.comparetor(human1, human2));
        myClass.changeComparator(new WeightComparator());
        System.out.println(myClass.comparetor(human1, human2));
        myClass.changeComparator(new AgeComparator());
        System.out.println(myClass.comparetor(human1, human2));
    }
}
