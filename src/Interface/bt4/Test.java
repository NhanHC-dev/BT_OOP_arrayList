package Interface.bt4;

import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("------------------------");
        System.out.println("   1. Insert new Student\n" +
                "   2. View list of Students\n" +
                "   3. Search Students\n" +
                "   4. Exit");
        System.out.println("------------------------");
        System.out.print("Chon chuc nang: ");
    }

    public static void main(String[] args) {
        ManageStudent rp = new ManageStudent();
        Scanner input = new Scanner(System.in);
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    rp.add();
                    break;
                case 2:
                    rp.view();
                    break;
                case 3:
                    rp.search();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhap chuc nang");
                    break;
            }

        }
    }
}
