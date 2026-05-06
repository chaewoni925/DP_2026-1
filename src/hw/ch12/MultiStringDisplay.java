package hw.ch12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> strings = new ArrayList<>();
    private int maxColumns = 0;

    public void add(String string) {
        strings.add(string);
        if (string.length() > maxColumns) {
            maxColumns = string.length();
        }
    }

    @Override
    public int getColumns() {
        return maxColumns;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        String s = strings.get(row);
        return s + " ".repeat(maxColumns - s.length());
    }
}