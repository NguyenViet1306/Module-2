package luyenTap;

import java.util.Scanner;

public class ungDungTinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền cho vay");
        double tien = sc.nextDouble();
        System.out.println("nhập phần trăm lãi suất");
        double ptram = sc.nextDouble();
        System.out.println("nhập số tháng");
        int thang = sc.nextInt();

        double lai = 0;
        for ( int i = 0 ; i < thang ; i++){
            lai += tien * (ptram/100/12) * thang;
        }
        System.out.println("tổng số tiền lãi là:" + lai);
    }
}
