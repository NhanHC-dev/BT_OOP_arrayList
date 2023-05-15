package Encapsulation.bt2;

import java.util.Scanner;

public class HoSoHocSinh {
    private String lop;
    private Nguoi nguoi;

    public HoSoHocSinh() {
        super();
    }

    public HoSoHocSinh(String lop, Nguoi nguoi) {
        super();
        this.lop = lop;
        this.nguoi = nguoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public void nhapThongTinHoSo() {
        nguoi = new Nguoi();
        nguoi.nhapThongTin();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }

    public void hienThiThongTinHoSo() {
        nguoi.hienThiThongTin();
        System.out.println("Lớp: " + lop);
    }
}
