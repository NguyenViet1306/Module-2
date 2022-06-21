package luyenTap;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    staff[] staffs = new staff[10];

    public Menu() {
    }
//    public staff creatStaff() {
//        System.out.println("Nhập tên Nhân Viên:");
//        System.out.println("Nhập tên:");
//        String name = sc.nextLine();
//        System.out.println("Nhập tuổi Nhân Viên:");
//        System.out.println("Nhập tuổi:");
//        int age = sc.nextInt();
//        System.out.println("Nhập mức Lương: ");
//        System.out.println("Nhập lương:");
//        double salary = sc.nextDouble();
//        staff cre = new staff(name , age , salary);
//        return cre;
//    }

    public void addStaff() {
        staffs[0] = new staff("viet 0", 26, 1000000);
        staffs[1] = new staff("viet 1", 26, 2000000);
        staffs[2] = new staff("viet 2", 26, 3000000);
//        staff staff = creatStaff();
//        staffs[0] = staff;
    }

    public void removeStaff() {
        staff[] staff1 = new staff[staffs.length - 1];
        for (int i = 0; i < staffs.length-1; i++) {
            if (i <1) {
                staff1[i] = staffs[i];
            } else {
                staff1[i] = staffs[i+1];
            }
        }
        staffs = staff1;
    }

    public void display() {
        for (staff i : staffs) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addStaff();
        menu.removeStaff();
        menu.display();
    }

}
