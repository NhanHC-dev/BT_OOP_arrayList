package R_W_File.bt2;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static StudentManager studentManager = new StudentManager();
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("Chọn chức năng (từ 1 đến 9): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> studentManager.inputStudent();
                case 2 -> studentManager.editStudentById();
                case 3 -> studentManager.deletetudentById();
                case 4 -> studentManager.sortStudentByGPA();
                case 5 -> studentManager.sortStudentByName();
                case 6 -> studentManager.displayStudent();
                case 7 -> studentManager.saveFile();
                case 8 -> studentManager.readFile();
                case 9 -> {
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                }
                default -> System.out.println("Please input [1...9] !");
            }
        } while (true);
    }
    static void showMenu(){
        System.out.println("Application Manager Student");
        System.out.println("Enter 1: To insert student");
        System.out.println("Enter 2: To edit student by id: ");
        System.out.println("Enter 3: To delete student by id: ");
        System.out.println("Enter 4: To sort student by gpa: ");
        System.out.println("Enter 5: To sort student by name: ");
        System.out.println("Enter 6: To show information student: ");
        System.out.println("Enter 7: To save student: ");
        System.out.println("Enter 8: To read student form file:");
        System.out.println("Enter 9: To exit:");
    }
}
