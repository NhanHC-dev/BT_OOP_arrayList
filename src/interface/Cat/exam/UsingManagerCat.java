package Cat.exam;

import java.util.Scanner;
public class UsingManagerCat {
    static ManagerCat managerCat = new ManagerCat();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;

        do {
            showMenu();
            choose = scan.nextInt();

            switch(choose) {
                case 1:
                    managerCat.getColorManager().nhap();
                    break;
                case 2:
                    managerCat.nhap();
                    break;
                case 3:
                    managerCat.hienThi();
                    break;
                case 4:
                    managerCat.sortByColor();
                    managerCat.hienThi();
                    break;
                case 5:
                    managerCat.searchByLoai();
                    break;
                case 6:
                    managerCat.sortByColorManager();
                    managerCat.hienThi();
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Input failed!");
                    break;
            }
        } while(choose != 7);
    }

    static void showMenu() {
        System.out.println("1. Nhập danh sách mã màu");
        System.out.println("2. Nhập thông tin của n con mèo");
        System.out.println("3. Hiển thị thông tin");
        System.out.println("4. Sắp xếp danh sách theo mau");
        System.out.println("5. Tìm kiếm thông tin theo loai");
        System.out.println("6. Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager");
        System.out.println("7. Thoát.");
        System.out.print("Lua chon : ");
    }
}
