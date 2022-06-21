package luyenTap;

import java.util.Scanner;
import java.util.Arrays;

public class demoBai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
       do {
           System.out.println("nhập độ dài của mảng :");
           x = sc.nextInt();
       } while ( x < 0);

       String[] arr = new String[x];

        System.out.println("nhập các phần tử của mảng :");
        System.out.println("nhập phần tử đầu");
        for (int i = 0 ; i < x ; i++){

            arr[i] = sc.next();
            System.out.println("nhập phần tử tiếp theo");
        }
            System.out.print(Arrays.toString(arr));
    }
}
