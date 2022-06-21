package bai2OOP;

public class Newspaper extends Library {
    private int day;

    public Newspaper() {
    }

    public Newspaper(int maTaiLieu, String nhaXuatBan, int soPhatHanh, int day) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "day=" + day +
                '}';
    }
}
