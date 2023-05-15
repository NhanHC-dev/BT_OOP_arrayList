package Polymorphism.bt3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyBds {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        ArrayList<MiengDat> arrMiengDat = new ArrayList<>();
        MiengDat miengDat;
        System.out.print("Nhập số lượng miếng đất: ");
        int soMiengDat = scanner.nextInt();
        for (int i = 0; i < soMiengDat; i++) {
            System.out.println("Nhập thông tin miếng đất thứ " + (i + 1) + ": ");
            System.out.print("Chọn hình dạng miếng đất (0 - đất hình chữ nhật, "
                    + "1 - đất hình thang, 2 - đất hình tam giác): ");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    miengDat = new MiengDatHCN();
                    miengDat.nhap();
                    arrMiengDat.add(miengDat);
                    break;
                case 1:
                    miengDat = new MiengDatHinhThang();
                    miengDat.nhap();
                    arrMiengDat.add(miengDat);
                    break;
                case 2:
                    miengDat = new MiengDatHinhTamGiac();
                    miengDat.nhap();
                    arrMiengDat.add(miengDat);
                    break;
                default:
                    System.out.println("Bạn nhập không đúng. Mời nhập lại");
                    break;
            }
        }
        System.out.println("Hiển thị thông tin những miếng đất của công ty");
        for (MiengDat dat : arrMiengDat) {
            System.out.println(dat.toString());
        }
        // tính tổng diện tích các miếng đất
        double tongDienTich = 0;
        for (MiengDat dat : arrMiengDat) {
            tongDienTich += dat.tinhDienTich();
        }
        System.out.println("Tổng diện tích các miếng đất = " + tongDienTich);
        // tính tổng giá tiền các miếng đất
        long tongGiaTien = 0;
        for (MiengDat dat : arrMiengDat) {
            tongGiaTien += dat.tinhTien();
        }
        System.out.println("Tổng giá tiền các miếng đất = " + tongGiaTien);
    }
}
