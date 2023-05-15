package Encapsulation.bt2;

import java.util.ArrayList;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        ArrayList<HoSoHocSinh> arrHoSo = new ArrayList<>();
        int n;
        HoSoHocSinh hoSoHocSinh;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số học sinh: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
            hoSoHocSinh = new HoSoHocSinh();
            hoSoHocSinh.nhapThongTinHoSo();
            arrHoSo.add(hoSoHocSinh);
        }

        for (int i = 0; i < arrHoSo.size(); i++) {
            System.out.println("\nThông tin học sinh thứ " + (i+1) + ": ");
            arrHoSo.get(i).hienThiThongTinHoSo();
        }

        System.out.println("\nNhững Học Sinh có quê ở Đà Nẵng là: ");
        // hiển thị những học sinh có quê ở Đà Nẵng
        for (int i = 0; i < arrHoSo.size(); i++) {
            if (arrHoSo.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Đà Nẵng")) {
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }

        System.out.println("\nNhững học sinh học lớp 10A1 là: ");
        // hiển thị những học sinh học lớp 10A1
        for (int i = 0; i < arrHoSo.size(); i++) {
            if (arrHoSo.get(i).getLop().equalsIgnoreCase("10A1")) {
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }
    }
}
