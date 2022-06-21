package LapTrinhHuongDoiTuong;

public class NhanVien extends CanBo {
    private String CongViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        CongViec = congViec;
    }

    public NhanVien(String name, String address, String gender, int age, String congViec) {
        super(name, address, gender, age);
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "CongViec='" + CongViec + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}