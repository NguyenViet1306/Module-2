package bai3;

public class Studen {
    protected int number;
    protected String name;
    protected String address;
    protected int priority;

    public Studen() {
    }

    public Studen(int number, String name, String address, int priority) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
