package Staff;

import java.util.Scanner;

public class ManagerStaff {
    private int index = 0;
    private Staff[] arrayStaff;

    public ManagerStaff() {
    }

    public int getIndex() {
        return index;
    }

//    public void setIndex(int index) {
//        this.index = index;
//    }

    public Staff[] getArrayStaff() {
        return arrayStaff;
    }

//    public void setArrayStaff(Staff.Staff[] arrayStaff) {
//        this.arrayStaff = arrayStaff;
//    }

    public void createArrayStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mong muốn của mảng chứa Staff:");
        int length = input.nextInt();
        arrayStaff = new Staff[length];
    }

    public void addStaffInArrayStaff(Staff newStaff) {
        arrayStaff[index] = newStaff;
        index = index + 1;
    }

    public Staff createNewStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên của Staff thứ" + (index + 1) + ":");
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi của Staff thứ" + (index + 1) + ":");
        int age = input.nextInt();
        System.out.println("Nhập vào lương của Staff thứ" + (index + 1) + ":");
        double salary = input.nextDouble();
        return new Staff(name, age, salary);
    }

    public void updateStaffByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào Index bạn muốn cập nhập");
        int index = input.nextInt();
        // KIỂM TRA XEM INDEX CÓ HỢP LỆ KO
        if (index < 0 || index > arrayStaff.length - 1) {
            System.out.println("Vị trí này ko có trong mảng");
        } else {
            Staff staff = arrayStaff[index];
            System.out.println("Nhập vào tên mới của Staff");
            String name = input.nextLine();
            staff.setName(name);
            System.out.println("Nhập vào tuổi mới của Staff");
            int age = input.nextInt();
            staff.setAge(age);
            System.out.println("Nhập vào lương mới của Staff");
            double salary = input.nextDouble();
            staff.setSalary(salary);
        }
    }

    public void deleteStaffbyIndexArray() {

        //  TẠO 1 MẢNG MỚI CÓ SỐ PHẦN TỬ BẰNG SỐ PHẦN TỬ CỦA MẢNG staff - 1

        //ĐẨY CÁC PHẦN TỬ TRONG MẢNG staff VÀO MẢNG MỚI, NGOẠI TRỪ PHẨN TỬ Ở VỊ TRÍ INDEX

        // CẦN PHÂN BIỆT 3 CHỈ SỐ THƯỜNG DÙNG ĐỂ THAO TÁC VS ĐỐI TƯỢNG TRONG MẢNG

        // CHỈ SỐ 1: INDEX - VỊ TRÍ CỦA PHẦN TỬ TRONG MẢNG

        // CHỈ SỐ 2: VỊ TRÍ XUẤT HIỆN TRONG MẢNG

        // CHỈ SỐ 3: ID CỦA ĐỐI TƯỢNG NẾU CÓ

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào Index muốn xóa: ");
        int index = input.nextInt();
        if (index < 0 || index > arrayStaff.length - 1) {
            System.out.println("vị trí vừa nhập ko có trong mảng!");
        } else {
            Staff[] newStaff = new Staff[arrayStaff.length - 1];
            for (int i = 0; i < arrayStaff.length - 1; i++) {
                if (i < index) {
                    newStaff[i] = arrayStaff[i];
                } else {
                    newStaff[i] = arrayStaff[i + 1];
                }
            }
            arrayStaff = newStaff;
        }
    }

    public void displayStaffByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Index muốn hiển thị: ");
        int index = input.nextInt();
        if (index < 0 || index > arrayStaff.length - 1) {
            System.out.println("Vị trí vừa nhập ko có trong mảng");
        } else {
            System.out.println(arrayStaff[index]);
        }
    }

    public void displayAllStaff() {
        for (Staff elementStaff : arrayStaff) {
            System.out.println(elementStaff);
        }
    }
}
