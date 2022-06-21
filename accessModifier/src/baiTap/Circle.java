package baiTap;

import java.awt.geom.Area;
import java.util.Scanner;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double areal;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAreal() {
        return this.radius*this.radius*Math.PI;
    }

    public void setAreal (double areal) {
        this.areal = areal;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập giá trị R:");
//        double r = sc.nextDouble();
        Circle circle = new Circle(1.0);

        System.out.println(circle.getRadius());
        System.out.println(circle.getAreal());

        circle.setRadius(2.0);

        System.out.println(circle.getRadius());
        System.out.println(circle.getAreal());
    }
}