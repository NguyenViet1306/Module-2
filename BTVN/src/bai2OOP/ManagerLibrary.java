package bai2OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerLibrary {
    private ArrayList<Library> libraries;

    public ManagerLibrary() {
        libraries = new ArrayList<>();
    }

    void createLibrary(Scanner sc) {
        System.out.println("nhập vào mã tài liệu: ");
        int maTaiLieu1 = sc.nextInt();
        sc.nextLine();
        if (!checkMaTaiLieu(maTaiLieu1)) {

            System.out.println("nhập vào tên nhà xuất bản: ");
            String nhaXuatBan = sc.nextLine();
            System.out.println("nhập vào số bản phát hành: ");
            int soBanPhatHanh = sc.nextInt();
            sc.nextLine();

            int choice;

            System.out.println("chọn loại tài liệu:");
            System.out.println("1. Thêm Sách:");
            System.out.println("2. Thêm Tạp chí");
            System.out.println("3. Thêm Báo");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("nhập vào tên tác giả: ");
                    String tenTacGia = sc.nextLine();
                    System.out.println("nhập vào số trang: ");
                    int soTrang = sc.nextInt();
                    Book book = new Book(maTaiLieu1, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                    libraries.add(book);
                    break;
                case 2:
                    System.out.println("nhập vào số phát hành: ");
                    int soPhatHanh = sc.nextInt();
                    System.out.println("nhập vào tháng phát hành: ");
                    int thangPhatHanh = sc.nextInt();
                    Managiz managiz = new Managiz(maTaiLieu1, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                    libraries.add(managiz);
                    break;
                case 3:
                    System.out.println("nhập vào ngày phát hành: ");
                    int ngayPhatHanh = sc.nextInt();
                    Newspaper newspaper = new Newspaper(maTaiLieu1, nhaXuatBan, soBanPhatHanh, ngayPhatHanh);
                    libraries.add(newspaper);
                    break;
            }
        }

    }


    public void deleteLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu muốn xóa");
        int maTaiLieu1 = sc.nextInt();
        for (Library a : libraries) {
            if (a.getMaTaiLieu() == maTaiLieu1) {
                libraries.remove(a);
            }
        }
    }

    public void display() {
        for (Library library : libraries) {
            System.out.println(library);
        }
    }

    public void seachTaiLieuTheoLoai(Scanner sc) {

        System.out.print("chon loai tai lieu: ");
        System.out.println("1.Sach");
        System.out.println("2.Tap chi");
        System.out.println("3.Bao");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                for (Library library : libraries) {
                    if (library instanceof Book) {
                        System.out.println(library);
                    }
                }
                break;
            case 2:
                for (Library library : libraries) {
                    if (library instanceof Managiz) {
                        System.out.println(library);
                    }
                }
                break;
            case 3:
                for (Library library : libraries) {
                    if (library instanceof Newspaper) {
                        System.out.println(library);
                    }
                }
                break;
        }


    }

    public boolean checkMaTaiLieu(int maTaiLieu1) {
        for (Library library : libraries) {
            if (maTaiLieu1 == library.getMaTaiLieu()) {
                return true;
            }
        }
        return false;
    }

}

