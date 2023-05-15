package Polymorphism.bt3;

import java.util.Scanner;
public class MiengDat {
    private String maSo;
    protected long donGia;
    Scanner scanner = new Scanner(System.in);

    public MiengDat() {
        super();
    }

    public MiengDat(String maSo, long donGia) {
        super();
        this.maSo = maSo;
        this.donGia = donGia;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public double tinhDienTich() {
        return 0;
    }

    public long tinhTien() {
        return this.donGia * (long) this.tinhDienTich();
    }
    public void nhap() {
        System.out.print("Nhập mã số miếng đất: ");
        maSo = scanner.nextLine();
        System.out.print("Nhập đơn giá 1m2: ");
        donGia = scanner.nextLong();
    }

    @Override
    public String toString() {
        return "Mã số miếng đất: " + this.maSo + ", đơn giá: " + this.donGia + " VND, diện tích: "
                + this.tinhDienTich() + ", giá tiền: " + this.tinhTien();
    }
}
