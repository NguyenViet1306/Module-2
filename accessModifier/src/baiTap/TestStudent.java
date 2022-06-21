package baiTap;

//import javax.xml.bind.SchemaOutputResolver;3
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("John", "C02");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());

        student1.setName("John1");
        student1.setClasses("Class1");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());

        System.out.println(student1);

    }
}
