package BaiTap;

public class point3D extends Point2D {
    private float z;

    public point3D() {
    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

//    public float[] getXYZ() {
//        float[] arr = new float(getX(),getY(),getZ());
//        arr[2] = this.z;
//        return arr;
//    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                " }";
    }
}

