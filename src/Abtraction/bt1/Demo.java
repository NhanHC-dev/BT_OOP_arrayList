package Abstraction.bt1;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int choose, chieuDai, chieuRong, banKinh;
        Scanner scanner = new Scanner(System.in);
        Random random;
        HinhHoc hinhHoc;
        DanhSachHinh danhSachHinh = new DanhSachHinh();

        System.out.println("1. Thêm hình chữ nhật");
        System.out.println("2. Thêm hình tròn");
        System.out.println("3. Hiển thị danh sách hình");
        System.out.println("4. Đếm số lượng hình chữ nhật");
        System.out.println("5. Hiển thị thông tin hình chữ nhật có diện tích lớn nhất");
        System.out.println("6. Thoát chương trình");

        do {
            System.out.print("Chọn chức năng (từ 1 đến 6): ");
            choose = scanner.nextInt();

            switch(choose) {
                case 1:
                    random = new Random();
                    do {
                        chieuDai = random.nextInt(5) + 1;   // chiều dài nằm trong khoảng [1...5]
                        chieuRong = random.nextInt(5) + 1;
                    } while (chieuDai <= chieuRong);
                    hinhHoc = new HinhChuNhat(chieuDai, chieuRong);
                    danhSachHinh.themHinh(hinhHoc);
                    System.out.println("Thêm thành công hình chữ nhật có chiều dài = " + chieuDai +
                            ", chiều rộng = " + chieuRong);
                    break;
                case 2:
                    random = new Random();
                    banKinh = random.nextInt(5) + 1;
                    hinhHoc = new HinhTron(banKinh);
                    danhSachHinh.themHinh(hinhHoc);
                    System.out.println("Thêm thành công hình tròn có bán kính = " + banKinh);
                    break;
                case 3:
                    System.out.println("Thông tin các hình có trong danh sách:");
                    danhSachHinh.hienThiDanhSachHinh();
                    break;
                case 4:
                    System.out.println("Số lượng hình chữ nhật = " +
                            danhSachHinh.demSoHinhChuNhat());
                    break;
                case 5:
                    System.out.println("Thông tin hình chữ nhật có diện tích lớn nhất: ");
                    danhSachHinh.hienThiHinhChuNhatCoDienTichLonNhat();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng chọn phải nằm trong khoảng từ 1 đến 6");
                    break;
            }
        } while (true);
    }
}
