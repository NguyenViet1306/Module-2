package BaiTap;

import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        int length = scanner.nextInt();
        int[] ints = new int[length];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        System.out.println("Nhập giá trị muốn thêm:");
        int value = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm:");
        int index = scanner.nextInt();
        addElement(value, index, ints);

        for (int e : ints) {
            System.out.print(e + "; ");
        }
    }

    public static void addElement(int value, int index, int[] ints) {
        if (index <= -1 || index > ints.length) {
            System.out.println("Index không hợp lệ");
        } else {
            for (int i = ints.length - 1; i > index; i--) {
                ints[i] = ints[i - 1];
            }
            ints[index] = value;
        }
    }
}
