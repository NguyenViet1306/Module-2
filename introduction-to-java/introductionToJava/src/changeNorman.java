import java.util.Scanner;

public class changeNorman {
    public static void main(String[] args) {
        System.out.println("nhập giá trị USD");
        Scanner sc = new Scanner(System.in);
        double USD = sc.nextDouble();
        System.out.println("giá trị tiền tệ: " + USD*23000);
    }
}
