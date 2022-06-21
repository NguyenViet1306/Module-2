package bai3;

public class StudenB extends Studen{
    public static final String unitB = "Math, Chemistry, Biology";
//    public StudenB() {
//    }

    public StudenB(int number, String name, String address, int priority) {
        super(number, name, address, priority);
    }

    @Override
    public String toString() {
        return "StudenB{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + "unit='" + unitB +
                '}';
    }
}
