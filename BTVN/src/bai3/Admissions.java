package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Admissions {
    private ArrayList<Studen> studens = new ArrayList<>();

    public boolean checkNumber(int number) {
        for (Studen studen : studens) {
            if (studen.getNumber() == number)
                return true;
        }
        return false;
    }

    public void createStuden(Scanner input) {
        System.out.println("Nhập thông tin Thí sinh mới:");
        System.out.println("Nhập số báo danh: ");
        int number = input.nextInt();
        if (!checkNumber(number)) {
            System.out.println("nhập tên sinh viên:");
            String name = input.next();
            System.out.println("Nhập địa chỉ sinh viên:");
            String address = input.next();
            System.out.println("Nhập mức độ ưu tiên:");
            int priority = input.nextInt();
            System.out.println("nhập khối thi:");
            System.out.println("A , B , C");
            String unit = input.next();
            Studen studen = null;
            switch (unit) {
                case "A":
                    studen = new StudenA(number, name, address, priority);
                    break;
                case "B":
                    studen = new StudenB(number, name, address, priority);
                    break;
                case "C":
                    studen = new StudenC(number, name, address, priority);
                    break;
            }
            studens.add(studen);
        } else
            System.out.println("Trùng mã sinh viên!");
    }

//    public void addStuden() {
//        Studen studen = createStuden();
//        studens.add(studen);
//    }

    public void display() {
        for (Studen studen :
                studens) {
            System.out.println(studen);
        }
    }

    public void seachStuden() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tìm kiếm theo mã sinh viên: ");
        int search = input.nextInt();
        if (checkNumber(search)) {
            for (Studen studen : studens) {
                if (studen.getNumber() == search) {
                    System.out.println(studen);
                }
            }
        } else {
            System.out.println("Ko có thí sinh");
        }
    }


}