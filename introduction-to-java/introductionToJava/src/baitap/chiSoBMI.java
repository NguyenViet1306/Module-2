package baitap;

import java.util.Scanner;

public class chiSoBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập cân nặng (kg) ");
        double wight = sc.nextDouble();
        System.out.println("nhập chiều cao (m) ");
        double hight = sc.nextDouble();
        double bmi = wight / Math.pow(hight,2);
        if ( bmi < 18 ) {
            System.out.println("Underwight");
        } else if ( bmi < 25 ) {
            System.out.println("Norman");
        } else if ( bmi < 30 ) {
            System.out.println("Overwight");
        } else {
            System.out.println("Obese");
        }
    }
}
