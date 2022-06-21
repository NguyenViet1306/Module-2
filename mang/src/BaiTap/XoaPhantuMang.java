package BaiTap;

import java.util.Scanner;

public class XoaPhantuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cột muốn tính: ");
        int col = scanner.nextInt();
        int[][] ints = {{1, 2, 3}, {123, 123, 555}, {6, 4, 77}};
        int sumColumn = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (j == (col-1)) {
                    sumColumn += ints[i][j];
                }
            }
        }
        System.out.println(sumColumn);
    }
}
