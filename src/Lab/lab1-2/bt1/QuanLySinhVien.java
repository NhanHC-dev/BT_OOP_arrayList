package Lab.bt1;

import java.util.Scanner;

public class QuanLySinhVien {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTinh(SinhVien tt) {
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setHoTen(sc.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        tt.setDiaChi(sc.nextLine());
        do {
            System.out.println("Nhập số điện thoại bao gồm 10 số: ");
            tt.setsTD(sc.nextLine());
        } while (tt.getsTD().length() != 10);
    }

    public static void main(String[] args) {
        SinhVien sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sinh viên. \n" +
                    "2.Xuất bản danh sách sinh viên.\n" +
                    "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lương sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");
                        sv[i] = new SinhVien();
                        nhapThongTinh(sv[i]);

                    }
                    break;
                case 2:
                    SinhVien temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
