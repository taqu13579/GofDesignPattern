package composite;

public class SymbolicLink implements DirectoryEntry {
    private String name;

    public SymbolicLink(String name) {
        this.name = name;
    }

    @Override
    public void remove() {
        System.out.println(name + "を削除しました。");
    }
}
