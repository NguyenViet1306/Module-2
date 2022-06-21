package luyenTap;

import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("ko phải số nguyên tố");
        } else {
            int i = 2;
            boolean flag = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag) {
                System.out.println("là số nguyên tố");
            } else {
                System.out.println("ko là số nguyên tố");
            }
        }
    }
}
