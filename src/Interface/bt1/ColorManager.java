package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager {
    ArrayList<String> colorList = new ArrayList<>();

    public void nhap() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap so mau can them : ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap mau : ");
            String color = scan.nextLine();

            colorList.add(color);
        }
    }

    public void hienThi() {
        for (String color : colorList) {
            System.out.println("color : " + color);
        }
    }

    public ArrayList<String> getColorList() {
        return colorList;
    }
}
