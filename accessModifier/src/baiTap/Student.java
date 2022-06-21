package baiTap;

public class Student {
    private String name ;
    private String Classes;

    public Student() {
    }

    public Student(String name, String Classes) {
        this.name = name;
        this.Classes = Classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String Classes) {
        this.Classes = Classes;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.Classes ;
    }
}
