package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        entry.setParent(this);
        return this;
    }

    // keyword를 포함하는 엔트리들을 검색
    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();
        // 자신의 이름도 검사
        if (getName().contains(keyword)) {
            result.add(this);
        }
        // 모든 자식의 search() 결과를 병합하여 반환
        for (Entry entry : directory) {
            result.addAll(entry.search(keyword));
        }
        return result;
    }
}
