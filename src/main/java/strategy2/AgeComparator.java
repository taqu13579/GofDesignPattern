package strategy2;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Human human1, Human human2) {
        if (human1.age > human2.age) {
            return 1;
        } else if (human1.age == human2.age) {
            return 0;
        } else {
            return 0;
        }
    }
}
