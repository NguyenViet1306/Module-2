package luyenTap;

public class Animal {
    int weight, height;
    String gender, color;

    public Animal() {
    }

    public Animal(int weight, int height, String gender, String color) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
