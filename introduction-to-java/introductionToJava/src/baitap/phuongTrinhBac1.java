package baitap;

import java.util.Scanner;

public class phuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("nhập số a:");
        a = sc.nextDouble();
        System.out.println("nhập số b:");
        b = sc.nextDouble();
        System.out.println("nhập số c:");
        c = sc.nextDouble();
        if (a == 0) {
            if (b == c) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            System.out.println("nghiệm của pt:  " + (c - b) / a);
        }
    }
}
