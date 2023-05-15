package Encapsulation.bt1;

import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String soCMND;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String soCMND, String queQuan) {
        this.hoTen = hoTen;
        this.soCMND = soCMND;
        this.queQuan = queQuan;
    }

    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void nhapThongTinKhachTro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên khách hàng: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        soCMND = scanner.nextLine();
    }

    public void hienThiThongTinKhachTro() {
        System.out.println("Họ và tên khách hàng: " + hoTen);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Số chứng minh nhân dân: " + soCMND);
    }
}
