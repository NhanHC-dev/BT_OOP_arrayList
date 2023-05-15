package Polymorphism.bt3;

public class MiengDatHinhTamGiac extends MiengDat{
    private int chieuCao, day;

    public MiengDatHinhTamGiac() {
        super();
    }

    public MiengDatHinhTamGiac(int chieuCao, int day) {
        super();
        this.chieuCao = chieuCao;
        this.day = day;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public void nhap() {
        super.nhap();
        do {
            System.out.print("Nhập đáy: ");
            day = scanner.nextInt();
            System.out.print("Nhập chiều cao: ");
            chieuCao = scanner.nextInt();
        } while ((day < 0) || (chieuCao < 0));
    }
    @Override
    public double tinhDienTich() {
        return (this.day * this.chieuCao) / 2;
    }

    @Override
    public long tinhTien() {
        return this.donGia * (long) this.tinhDienTich() * 90 / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", đáy: " + this.day +
                ", chiều cao: " + this.chieuCao;
    }
}
