package bai2OOP;

public class Managiz extends Library {
    private int day, month;

    public Managiz() {
    }

    public Managiz(int maTaiLieu, String nhaXuatBan, int soPhatHanh, int day, int month) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Managiz{" +
                "day=" + day +
                ", month=" + month +
                '}';
    }
}
