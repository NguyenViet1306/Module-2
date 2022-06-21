package baiTap;

public class phuongTrinhBacHai {
    double a;
    double b;
    double c;

    public phuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return  this.b * this.b - (4 * this.a * this.c);
    }

    public int checkDelta(){
        if (this.delta() < 0) {
            return 1;
        } else if (this.delta() == 0) {
            return 2;
        } else {
            return 3;
        }
    }

    public void tinhnghiem() {
        switch (checkDelta()){
            case 1:
                System.out.println("The equation has no roots");
                break;
            case 2:
                System.out.println("x = " + (-this.b / (2*this.a)) );
                break;
            case 3:
                System.out.println("The equation has 2 roots:");
                System.out.println("x1 = " +  (-this.b + Math.sqrt(delta()))/ (2*this.a));
                System.out.println("x1 = " +  (-this.b - Math.sqrt(delta()))/ (2*this.a));
                break;
        }
    }
}

