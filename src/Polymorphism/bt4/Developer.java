package Polymorphism.bt4;

public class Developer extends Employee {
    private int soGioLamThem;

    public Developer() {
        super();
    }

    public Developer(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số giờ làm thêm: ");
        soGioLamThem = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soGioLamThem * 200000;
        return this.luong;
    }
    @Override
    public String toString() {
        return super.toString() + "\n, số giờ làm thêm: " + this.soGioLamThem +
                ", lương: " + this.luong;
    }
}
