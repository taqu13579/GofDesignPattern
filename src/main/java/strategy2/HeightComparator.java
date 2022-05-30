package strategy2;

public class HeightComparator implements Comparator {
    @Override
    public int compare(Human human1, Human human2) {
        if (human1.height > human2.height) {
            return 1;
        } else if (human1.height > human2.height) {
            return 0;
        } else {
            return -1;
        }
    }
}
