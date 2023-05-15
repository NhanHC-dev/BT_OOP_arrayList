package Inheritance.bt1;

import java.util.Scanner;

public class ChuyenXe {
    protected String maSoChuyen, hoTenTaiXe, soXe;
    protected double doanhThu;
    Scanner scanner = new Scanner(System.in);
    public ChuyenXe() {
        super();
        this.maSoChuyen = "";
        this.hoTenTaiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super();
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public String getMaSoChuyen() {
        return maSoChuyen;
    }
    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public String getSoXe() {
        return soXe;
    }
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    public void nhapThongTinChuyenXe() {
        System.out.print("Nhập mã số chuyến: ");
        maSoChuyen = scanner.nextLine();
        System.out.print("Nhập họ tên tài xế: ");
        hoTenTaiXe = scanner.nextLine();
        System.out.print("Nhập số xe: ");
        soXe = scanner.nextLine();
        System.out.print("Nhập doanh thu: ");
        doanhThu = scanner.nextDouble();
    }

    public String toString() {
        return "Mã số chuyến: " + this.maSoChuyen + ", họ tên tài xế: " + this.hoTenTaiXe
                + ", số xe: " + this.soXe + ", doanh thu: " + this.doanhThu;
    }


}

