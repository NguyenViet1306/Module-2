package BaiTap;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu của tam giác: ");
        String colorTriangle = sc.nextLine();
        triangle.setColor(colorTriangle);
        System.out.println( triangle);
    }
}