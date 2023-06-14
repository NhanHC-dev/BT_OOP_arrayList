package Abstraction.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose, soPhutTruyCap, soMBTruyCap;
        Scanner scanner = new Scanner(System.in);
        ThueBao thueBao;
        DanhSachThueBao danhSachThueBao = new DanhSachThueBao();

        System.out.println("1. Thêm thuê bao Dial Up");
        System.out.println("2. Thêm thuê bao ADSL");
        System.out.println("3. Thêm thuê bao T1");
        System.out.println("4. Hiển thị danh sách thuê bao");
        System.out.println("5. Tính tổng tiền cước của từng loại thuê bao");
        System.out.println("6. Tính tổng tiền cước của tất cả các loại thuê bao");
        System.out.println("7. Hiển thị thông tin thuê bao ADSL có tiền cước lớn nhất");
        System.out.println("8. Thoát chương trình");

        do {
            System.out.print("Chọn chức năng (từ 1 đến 8): ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1 -> {
                    System.out.print("Nhập số phút truy cập: ");
                    soPhutTruyCap = scanner.nextInt();
                    thueBao = new ThueBaoDialUp(soPhutTruyCap);
                    danhSachThueBao.themThueBao(thueBao);
                    System.out.println("Thêm thành công thuê bao Dial Up có số phút truy cập = " +
                            soPhutTruyCap);
                }
                case 2 -> {
                    System.out.print("Nhập số MB truy cập: ");
                    soMBTruyCap = scanner.nextInt();
                    thueBao = new ThueBaoADSL(soMBTruyCap);
                    danhSachThueBao.themThueBao(thueBao);
                    System.out.println("Thêm thành công thuê bao ADSL có số MB truy cập = " +
                            soMBTruyCap);
                }
                case 3 -> {
                    thueBao = new T1();
                    danhSachThueBao.themThueBao(thueBao);
                    System.out.println("Thêm thành công thuê bao T1");
                }
                case 4 -> {
                    System.out.println("Thông tin các thuê bao có trong danh sách:");
                    danhSachThueBao.hienThiDanhSachThueBao();
                }
                case 5 -> danhSachThueBao.tinhTongCuocCuaTungLoaiThueBao();
                case 6 -> danhSachThueBao.tinhTongCuocCuaTatCaCacThueBao();
                case 7 -> danhSachThueBao.hienThiThueBaoCoTienCuocLonNhat();
                case 8 -> {
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                }
                default -> System.out.println("Chức năng chọn phải nằm trong khoảng từ 1 đến 8");
            }
        } while (true);
    }
}
