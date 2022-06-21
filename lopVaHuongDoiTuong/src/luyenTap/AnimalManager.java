package luyenTap;

import java.util.Scanner;

public class AnimalManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("nhập độ dài của mảng :");
            x = sc.nextInt();
        } while ( x < 0);
    }

}
