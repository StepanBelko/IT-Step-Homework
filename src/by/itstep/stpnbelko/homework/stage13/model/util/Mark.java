package by.itstep.stpnbelko.homework.stage13.model.util;

public class Mark {
    String stringValue;
    int intValue;
    int number;
    double percent;

    public static Mark five = new Mark("Five", 5);
    public static Mark four = new Mark("Four", 4);
    public static Mark three = new Mark("Three", 3);
    public static Mark two = new Mark("Two", 2);
    public static Mark one = new Mark("One", 1);
    public static Mark zero = new Mark("Zero", 0);
    public static Mark unknownMark = new Mark("Unknown mark", -1);

    private Mark(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public int getNumber() {
        return number;
    }

    public double getPercent() {
        return percent;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return String.format("%5s %4.1f%% (%d)\n", stringValue, percent, number);
    }
}
