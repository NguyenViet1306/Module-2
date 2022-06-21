package bai2OOP;

public class Library {
    private int maTaiLieu;
    private String nhaXuatBan;
    private int soPhatHanh;

    public Library() {
    }

    public Library(int maTaiLieu, String nhaXuatBan, int soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "library{" +
                "maTaiLieu=" + maTaiLieu +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }
}
