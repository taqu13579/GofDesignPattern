package strategy2;

public class WeightComparator implements Comparator{
    @Override
    public int compare(Human human1, Human human2) {
        if (human1.weight > human2.weight) {
            return 1;
        } else if (human1.weight == human2.weight) {
            return 0;
        } else {
            return 0;
        }
    }
}
