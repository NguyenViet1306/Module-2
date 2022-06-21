package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admissions admissions = new Admissions();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Tìm kiếm theo số báo danh");
            System.out.println("3. Hiển thị thông tin");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
//                    admissions.createStuden();
                    break;
                case 2:
                    admissions.seachStuden();
                    break;
                case 3:
                    admissions.display();
                    break;
            }
        } while (choice != 0);
    }
}

