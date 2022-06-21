package luyenTap;

import java.util.Scanner;

public class demoBai3 {

    public void checkSNT(int num){
        if (num < 2) {
            System.out.println("đây ko phải số nguyên tố");
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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số cần kiểm tra: ");
        int num = sc.nextInt();

        demoBai3 check = new demoBai3();
        check.checkSNT(num);


    }


}
