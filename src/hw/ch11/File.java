package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // keyword를 포함되면 리스트, 아니면 빈 리스트 반환
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();
        if (getName().contains(keyword)) {
            result.add(this);
        }
        return result;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
