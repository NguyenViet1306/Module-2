package bai3;

public class StudenC extends Studen {

    public static final String unitC = "Môn Văn, Môn Sử, Môn Địa";
//    public StudenC() {
//    }

    public StudenC(int number, String name, String address, int priority) {
        super(number, name, address, priority);
    }

    @Override
    public String toString() {
        return "StudenC{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + "unit='" + unitC +
                '}';
    }
}