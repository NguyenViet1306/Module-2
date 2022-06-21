package thucHanh;

import java.awt.*;
import java.util.Scanner;

public class lopHinhChuNhat {
        double width ,  height ;

        public lopHinhChuNhat(){
        }

        public lopHinhChuNhat( double width , double height) {
            this.height = height;
            this.width = width;
        }

        public double getArea () {
            return this.height * this.width;
        }

        public double getPerimeter () {
            return (  this.height + this.width ) * 2;
        }

        public String Display () {
            return "lopHinhChuNhat {" + "width" + width + ", heigth" + height + "}";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Width: ");
            double width = sc.nextDouble();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();

            lopHinhChuNhat lopHinhChuNhat = new lopHinhChuNhat(width,height);

            System.out.println("Your Rectangle \n " + lopHinhChuNhat.Display());
            System.out.println("Perimeter of the Rectangle: "+ lopHinhChuNhat.getPerimeter());
            System.out.println("Area of the Rectangle: "+ lopHinhChuNhat.getArea());
    }
}

