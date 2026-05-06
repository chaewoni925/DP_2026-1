package hw.ch12;

public class NumberedBorder extends Border {

    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // "%2d| " = 4글자 prefix
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 행 번호는 1부터 시작, %2d| 형식 (총 4글자)
        return String.format("%2d|", row + 1) + display.getRowText(row);
    }
}