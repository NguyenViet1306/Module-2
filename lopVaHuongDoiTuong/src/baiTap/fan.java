package baiTap;

public class fan {
    public static void main(String[] args) {
        MyFan fan = new MyFan();
        System.out.println(fan.toString());
    }
}

class MyFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed;
    boolean on;
    int radius;
    String color;

    MyFan() {
        this.speed = this.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";

    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on";
        } else
            return "Fan is off";
    }
}

