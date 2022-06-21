package luyenTap;

import java.util.Scanner;

public class demoBai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 số");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( (a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0) ){
            System.out.println("3 số là 3 cạnh của 1 tam giác");
        } else {
            System.out.println("3 số ko phải là cạnh của 1 tam giác");
        }
    }
}
