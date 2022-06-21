package bai2OOP;

public class Book extends Library {
    private String name;
    private int number;

    public Book() {
    }

    public Book(int maTaiLieu, String nhaXuatBan, int soPhatHanh, String name, int number) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
