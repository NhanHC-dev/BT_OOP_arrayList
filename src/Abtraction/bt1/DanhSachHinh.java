package Abstraction.bt1;

import java.util.ArrayList;

public class DanhSachHinh {
    ArrayList<HinhHoc> arrHinhHoc;

    public DanhSachHinh() {
        super();
        arrHinhHoc = new ArrayList<>();
        arrHinhHoc.add(new HinhChuNhat(7, 3));
        arrHinhHoc.add(new HinhTron(3));
        arrHinhHoc.add(new HinhChuNhat(10, 1));
    }

    public void themHinh(HinhHoc hinhHoc) {
        arrHinhHoc.add(hinhHoc);
    }

    public void hienThiDanhSachHinh() {
        for (int i = 0; i < arrHinhHoc.size(); i++) {
            System.out.println(arrHinhHoc.get(i).toString());
        }
    }

    public int demSoHinhChuNhat() {
        int soHinhChuNhat = 0;
        for (HinhHoc hinhHoc : arrHinhHoc) {
            if (hinhHoc instanceof HinhChuNhat) {
                soHinhChuNhat++;
            }
        }
        return soHinhChuNhat;
    }
    public void hienThiHinhChuNhatCoDienTichLonNhat() {
        double temp = 0;
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        for (HinhHoc hinhHoc : arrHinhHoc) {
            if (hinhHoc instanceof HinhChuNhat) {
                if (temp < hinhHoc.tinhDienTich()) {
                    temp = hinhHoc.tinhDienTich();
                    hinhChuNhat = (HinhChuNhat) hinhHoc; // ép kiểu biến hinhHoc về kiểu HCN và gán vào biến hCN
                }
            }
        }
        System.out.println("Hình chữ nhật có diện tích lớn nhất là " + hinhChuNhat.toString());
    }
}
