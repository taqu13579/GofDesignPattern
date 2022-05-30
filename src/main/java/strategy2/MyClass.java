package strategy2;

public class MyClass {
    private Comparator comparator;

    public MyClass(Comparator comparator) {
        this.comparator = comparator;
    }

    public void changeComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public int comparetor(Human human1, Human human2) {
        return comparator.compare(human1, human2);
    }
}
