package bt1;

import java.util.ArrayList;
import java.util.Scanner;
public class CatDetail implements ICat {

    String loai;
    String mau;
    String noiSong;
    int colorIndex;

    ColorManager colorManager;

    public CatDetail() {
    }

    public CatDetail(ColorManager colorManager) {
        this.colorManager = colorManager;
    }

    public CatDetail(String loai, String mau, String noiSong) {
        this.loai = loai;
        this.mau = mau;
        this.noiSong = noiSong;
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap loai : ");
        loai = input.nextLine();

        colorManager.hienThi();
        System.out.println("Nhap mau : ");
        while (true) {
            mau = input.nextLine();
            ArrayList<String> colorList = colorManager.getColorList();

            boolean isFind = false;

            for (int i = 0; i < colorList.size(); i++) {
                if(colorList.get(i).equalsIgnoreCase(mau)) {
                    colorIndex = i;
                    isFind = true;
                    break;
                }
            }

            if(!isFind) {
                System.out.println("Nhap error -> Yeu cau nhap lai");
            } else {
                break;
            }
        }

        System.out.println("Nhap noi song : ");
        noiSong = input.nextLine();
    }

    @Override
    public void hienThi() {
        System.out.println("");
        System.out.printf("Loai : %s, mau : %s, noi song : %s\n", loai, mau, noiSong);
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }
}
