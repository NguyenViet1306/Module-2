package baitap;

import java.util.Scanner;

public class tinhNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm muốn xét : ");
        year = sc.nextInt();
        if ((year % 4==0 && year %100 != 0) || year % 400 == 0 ) {
            System.out.println("Là năm nhuận");
        } else {
            System.out.println("không là năm nhuận");
        }
    }
}
