package Interface.bt5;

import java.util.Scanner;

public class TestBook {

    public static void menu() {
        System.out.println("------------------------");
        System.out.println("   1. Insert new Book\n" +
                "   2. View list of Books\n" +
                "   3. Average Price\n" +
                "   4. Exit");
        System.out.println("------------------------");
        System.out.print("Chon chuc nang: ");
    }

    public static void main(String[] args) {
        ManagerBook mb = new ManagerBook();
        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (true){
            menu();
            switch (input.nextInt()) {
                case 1 -> mb.insertNewBook();
                case 2 -> mb.viewlistofBooks();
                case 3 -> mb.averagePrice();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Nhap sai chuc nang");
            }
        }
    }
}
