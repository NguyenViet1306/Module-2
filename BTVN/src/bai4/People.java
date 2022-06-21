package bai4;

public class People extends Family {

    private String name, job;
    private int id;

    public People() {
    }

    public People(int numberPeople, int numberHome, String name, String job, int id) {
        super(numberPeople, numberHome);
        this.name = name;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Family{" + super.toString() +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id=" + id +
                '}';
    }
}
