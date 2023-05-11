package Encapsulation.bt1;

import java.util.Scanner;

public class KhachSan {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoi nguoi;
    public KhachSan() {
        super();
    }
    public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }
    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);

        // nhập thông tin khách trọ
        nguoi = new Nguoi();
        nguoi.nhapThongTinKhachTro();

        System.out.print("Nhập số ngày trọ: ");
        soNgayTro = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại phòng: ");
        loaiPhong = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong = scanner.nextDouble();
    }
    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhachTro();
        System.out.println("Số ngày trọ: " + soNgayTro);
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Giá phòng: " + giaPhong);
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}