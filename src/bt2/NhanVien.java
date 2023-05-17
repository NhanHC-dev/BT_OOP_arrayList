package Abstraction.bt2;

import java.util.Scanner;

public abstract class NhanVien {
    private String tenNhanVien;
    protected long luongNhanVien;
    Scanner scanner = new Scanner(System.in);

    public NhanVien() {
        super();
    }

    public NhanVien(String tenNhanVien, long luongNhanVien) {
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public void nhapThongTin() {
        System.out.print("Nhập tên nhân viên: ");
        tenNhanVien = scanner.nextLine();
    }
    public abstract void tinhLuong();

    @Override
    public String toString() {
        return "Tên nhân viên: " + this.tenNhanVien + ", lương nhân viên: " +
                this.luongNhanVien + " VND";
    }
}
