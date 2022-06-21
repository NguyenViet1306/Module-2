package ThucHanh;

public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
