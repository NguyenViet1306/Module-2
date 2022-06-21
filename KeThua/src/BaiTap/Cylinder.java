package BaiTap;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;


    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.height*this.getArea();
    }

    @Override
    public void setRadius(double radius) {
        super.getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        double radius = 3;
        double height = 5;
        String color = "red";
        Cylinder cylinder = new Cylinder(radius, color, height);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}