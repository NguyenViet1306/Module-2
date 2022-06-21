package luyenTap;

import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int num1 = sc.nextInt();
        num1 = Math.abs(num1);
        System.out.println("nhập số b");
        int num2 = sc.nextInt();
        num2 = Math.abs(num2);
        if (num1 == 0 || num2 == 0) {
            System.out.println("ko có ước chung lớn nhất");
        }
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println(" ước chung lớn nhất là : " + num1);
    }
}
