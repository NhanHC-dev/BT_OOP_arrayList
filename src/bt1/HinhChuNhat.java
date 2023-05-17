package Abstraction.bt1;

public class HinhChuNhat extends HinhHoc {
    private int chieuDai, chieuRong;
    public HinhChuNhat() {
        super();
    }
    public HinhChuNhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều dài = " + this.chieuDai +
                ", chiều rộng = " + this.chieuRong + ", diện tích = " + tinhDienTich();
    }
}
