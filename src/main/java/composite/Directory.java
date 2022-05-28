package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory implements DirectoryEntry {
    private List<DirectoryEntry> list;
    private String name;

    public Directory(String name) {
        this.name = name;
        list = new ArrayList<DirectoryEntry>();
    }

    public void add(DirectoryEntry entry) {
        list.add(entry);
    }

    @Override
    public void remove() {
        Iterator<DirectoryEntry> it = list.iterator();

        while(it.hasNext()) {
            DirectoryEntry entry = it.next();
            entry.remove();
        }
        System.out.println(name + "を削除しました。");
    }

}
