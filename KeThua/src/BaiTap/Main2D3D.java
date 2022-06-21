package BaiTap;

import java.util.Scanner;

public class Main2D3D {
    public static void main(String[] args) {
        System.out.println("nhập gái trị");
        float x = 3;
        float y = 4;
        float z = 5;

        point3D point3D = new point3D(x,y,z);

        System.out.println(point3D);
    }
}