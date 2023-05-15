package Polymorphism.bt3;

public class MiengDatHCN extends MiengDat{
    private int chieuDai, chieuRong;

    public MiengDatHCN() {
        super();
    }

    public MiengDatHCN(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return (this.chieuDai * this.chieuRong);
    }
    @Override
    public void nhap() {
        super.nhap();
        do {
            System.out.print("Nhập chiều dài miếng đất: ");
            chieuDai = scanner.nextInt();
            System.out.print("Nhập chiều rộng miếng đất: ");
            chieuRong = scanner.nextInt();
        } while ((chieuDai <= chieuRong) || (chieuDai <= 0) || (chieuRong <= 0));
    }

    @Override
    public String toString() {
        return super.toString() + ", chiều dài: " + this.chieuDai +
                ", chiều rộng: " + this.chieuRong;
    }
}
