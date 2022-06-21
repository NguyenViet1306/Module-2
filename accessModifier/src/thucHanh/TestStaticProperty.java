package thucHanh;


public class TestStaticProperty {
    public static void main(String[] args) {
        car car1 = new car("Mazda", "engeine1");
        System.out.println(car.numberOfCars);
        car car2 = new car("Honda", "engeine2");
        System.out.println(car.numberOfCars);
    }
}


