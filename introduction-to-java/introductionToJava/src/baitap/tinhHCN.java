package baitap;

import java.util.Scanner;

public class tinhHCN {
    public static void main(String[] args) {
        double width;
        double hight;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        width = sc.nextFloat();
        System.out.println("nhập chiều cao");
        hight = sc.nextFloat();

        double area= width * hight;
        System.out.println("diện tích là: " + area );
    }
}
