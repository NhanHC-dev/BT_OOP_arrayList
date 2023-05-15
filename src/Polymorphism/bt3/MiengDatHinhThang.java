package Polymorphism.bt3;

public class MiengDatHinhThang extends MiengDat {
    private int dayLon, dayNho, chieuCao;

    public MiengDatHinhThang() {
        super();
    }

    public MiengDatHinhThang(int dayLon, int dayNho, int chieuCao) {
        super();
        this.dayLon = dayLon;
        this.dayNho = dayNho;
        this.chieuCao = chieuCao;
    }

    public int getDayLon() {
        return dayLon;
    }

    public void setDayLon(int dayLon) {
        this.dayLon = dayLon;
    }

    public int getDayNho() {
        return dayNho;
    }

    public void setDayNho(int dayNho) {
        this.dayNho = dayNho;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }
    @Override
    public double tinhDienTich() {
        return ((this.dayLon + this.dayNho) * this.chieuCao) / 2;
    }

    @Override
    public long tinhTien() {
        return this.donGia * (long) this.tinhDienTich() * 90 / 100;
    }

    public void nhap() {
        super.nhap();
        do {
            System.out.print("Nhập đáy lớn: ");
            dayLon = scanner.nextInt();
            System.out.print("Nhập đáy nhỏ: ");
            dayNho = scanner.nextInt();
        } while ((dayLon <= dayNho) || (dayLon <= 0) || (dayNho <= 0));
        System.out.print("Nhập chiều cao: ");
        chieuCao = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ", đáy lớn: " + this.dayLon + ", đáy nhỏ: " +
                this.dayNho + ", chiều cao: " + this.chieuCao;
    }

}
