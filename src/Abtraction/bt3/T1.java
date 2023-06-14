package Abstraction.bt3;

public class T1 extends ThueBao {
    private static int THUE_BAO_HANG_THANG = 2000000;

    public T1() {
        super();
    }

    @Override
    public long tinhTien() {
        return THUE_BAO_HANG_THANG;
    }

    @Override
    public String toString() {
        return "Thuê bao T1 có thuê bao hằng tháng = " + this.THUE_BAO_HANG_THANG +
                ", tổng tiền = " + tinhTien();
    }
}
