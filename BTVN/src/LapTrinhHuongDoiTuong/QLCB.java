package LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> canBos;

    public QLCB() {
        canBos = new ArrayList<>();
    }

    public void addCanBo() {
        CanBo canBo = createCanBo();
        canBos.add(canBo);
    }

    private CanBo createCanBo() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào tên Cán bộ: ");
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi của Cán bộ: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Nhập vào giới tính của Cán bộ: ");
        String gender = input.nextLine();
        System.out.println("Nhập vào địa chỉ của Cán bộ: ");
        String address = input.nextLine();
        return new CanBo(name, address, gender, age);
    }



//mã tìm kiếm cơ bản cho mọi thnahf phần

    public ArrayList<CanBo> seachCanBo() {
        Scanner sc = new Scanner(System.in);
        ArrayList<CanBo> canBoArrayList = new ArrayList<>();
        System.out.println("Nhập tên Cán bộ muốn tìm kiếm: ");
        String name1 = sc.nextLine();
        for (CanBo canbo : canBos) {
            // sử dụng equals để so sánh String
            if (name1.equals(canbo.getName())) {
                canBoArrayList.add(canbo);
            }
        }
//        for (CanBo c : canBoArrayList) {
//            System.out.println(c);
//        }
        return canBoArrayList;
    }



    public void displayCanBo() {
        for (CanBo canbo : canBos) {
            System.out.println(canbo);
        }
    }

}
