package thucHanh;

public class car {
    private String name;
    private String engeine;

    public static int numberOfCars;

    public car(String name , String engeine) {
        this.name = name;
        this.engeine = engeine;
        numberOfCars++;
    }



}

