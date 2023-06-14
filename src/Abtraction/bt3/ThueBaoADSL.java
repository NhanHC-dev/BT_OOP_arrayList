package Abstraction.bt3;

public class ThueBaoADSL extends ThueBao {
    private final static int THUE_BAO_HANG_THANG = 50000;
    private final static int DON_GIA_MB = 50;
    private int soMBTruyCap;

    public ThueBaoADSL() {
        super();
    }

    public ThueBaoADSL(int soMBTruyCap) {
        super();
        this.soMBTruyCap = soMBTruyCap;
    }

    @Override
    public long tinhTien() {
        return THUE_BAO_HANG_THANG + DON_GIA_MB * soMBTruyCap;
    }

    @Override
    public String toString() {
        return "Thuê bao ADSL có thuê bao hằng tháng = " + this.THUE_BAO_HANG_THANG +
                ", đơn giá theo MB = " + this.DON_GIA_MB + "/MB" +
                ", số MB truy cập = " + this.soMBTruyCap + ", tổng tiền = " + tinhTien();
    }
}
