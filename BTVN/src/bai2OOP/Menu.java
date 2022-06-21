package bai2OOP;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ManagerLibrary managerLibrary = new ManagerLibrary();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-----Menu-----");
            System.out.println("--------------" );
            System.out.println("1.Them moi tai lieu");
            System.out.println("2.Xoa tai lieu theo ma");
            System.out.println("3.hien thi thong tin tai lieu");
            System.out.println("4.Tim kiem theo loai");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    managerLibrary.createLibrary(sc);
                    break;
                case 2:
                    managerLibrary.deleteLibrary();
                    break;
                case 3:
                    managerLibrary.display();
                    break;
                case 4:
                    managerLibrary.seachTaiLieuTheoLoai(sc);
                    break;
            }
        } while (choice !=0);

    }
}
