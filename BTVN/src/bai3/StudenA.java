package bai3;

public class StudenA extends Studen {
    public static final String unitA = "Math, Physical, Chemistry";
//    public StudenA() {
//    }

    public StudenA(int number, String name, String address, int priority) {
        super(number, name, address, priority);
    }

    @Override
    public String toString() {
        return "StudenA{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + "unit='" + unitA +
                '}';
    }
}
