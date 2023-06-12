package bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ManagerCat {
    ArrayList<CatDetail> catDetails = new ArrayList<>();
    ColorManager colorManager = new ColorManager();
    Scanner input = new Scanner(System.in);

    public ColorManager getColorManager() {
        return colorManager;
    }

    public void nhap() {
        System.out.println("Nhap so meo can them : ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            CatDetail catDetail = new CatDetail(colorManager);
            catDetail.nhap();

            catDetails.add(catDetail);
        }
    }

    public void hienThi() {
        for (CatDetail catDetail : catDetails) {
            catDetail.hienThi();
        }
    }

    public void sortByColor() {
        Collections.sort(catDetails, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareTo(o2.getMau());
            }
        });
    }
    public void searchByLoai() {
        System.out.println("Nhap loai can tim : ");
        String loai = input.nextLine();

        for (CatDetail catDetail : catDetails) {
            if(catDetail.getLoai().equalsIgnoreCase(loai)) {
                catDetail.hienThi();
            }
        }
    }

    public void sortByColorManager() {
        Collections.sort(catDetails, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return (o1.getColorIndex() > o2.getColorIndex())?1:-1;
            }
        });
    }
}
