package luyenTap;

import java.util.Scanner;

public class hienThiSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap num = ");
        int num = scanner.nextInt();
        System.out.printf("các số nguyên tố là: ", num);
        int count = 0; // Đếm SNT
        int N = 2; //Tìm SNT bắt đầu từ số 2
        while (count < num) {
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        //Số nguyên < 2 ko phải là SNT
        if (n < 2) {
            return false;
        }
        //Check SNT khi n > 2
        for (int N = 2; N <= Math.sqrt(n); N++) {
            if (n % N == 0) {
                return false;
            }
        }
        return true;
    }
}
