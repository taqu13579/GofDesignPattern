package bridge2;

public class Sorter {
    private SortImple sortImple;
    public Sorter(SortImple sortImple) {
        this.sortImple = sortImple;
    }

    public void sort(Object[] obj) {
        sortImple.sort(obj);
    }
}
