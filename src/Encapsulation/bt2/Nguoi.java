package Encapsulation.bt2;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String gioiTinh;
    private String queQuan;

    public Nguoi() {
        super();
    }

    public Nguoi(String hoTen, String gioiTinh, String queQuan) {
        super();
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên học sinh: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Quê quán: " + queQuan);
    }
}
