package baiTap;

import java.util.Scanner;

public class displayPhuongTrinhBacHai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số 1:");
        int a = scanner.nextInt();
        System.out.println("Nhập hệ số 2:");
        int b = scanner.nextInt();
        System.out.println("Nhập hệ số 3:");
        int c = scanner.nextInt();
        phuongTrinhBacHai phuongTrinhBacHai = new phuongTrinhBacHai(a, b, c);
        phuongTrinhBacHai.tinhnghiem();
    }
}

