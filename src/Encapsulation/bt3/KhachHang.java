package Encapsulation.bt3;

import java.util.Scanner;

public class KhachHang {
    private String hoTenChuNha;
    private String soNha;
    private int maSoCongTo;

    public KhachHang() {
        super();
    }

    public KhachHang(String hoTenChuNha, String soNha, int maSoCongTo) {
        super();
        this.hoTenChuNha = hoTenChuNha;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public void nhapThongTinKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên chủ hộ: ");
        hoTenChuNha = scanner.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha = scanner.nextLine();
        System.out.print("Mã số công tơ: ");
        maSoCongTo = scanner.nextInt();
    }

    public void hienThiThongTinKhachHang() {
        System.out.println("Tên chủ hộ: " + hoTenChuNha);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maSoCongTo);
    }
}

