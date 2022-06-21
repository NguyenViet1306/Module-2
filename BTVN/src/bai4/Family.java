package bai4;

public class Family {
    private int numberPeople;
    private int numberHome;

    public Family() {
    }

    public Family(int numberPeople, int numberHome) {
        this.numberPeople = numberPeople;
        this.numberHome = numberHome;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(int numberHome) {
        this.numberHome = numberHome;
    }

    @Override
    public String toString() {
        return "People{" +
                "numberPeople=" + numberPeople +
                ", numberHome=" + numberHome +
                '}';
    }
}
