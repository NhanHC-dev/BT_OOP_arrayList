package Lab2.bt4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();
            ArrayList<Person> persons = new ArrayList<>();
            System.out.println("Enter number person");
            int number = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < number; j++) {
                // Inout person for
                System.out.println("Thành viên thứ " + (j + 1)+": \n"+ "Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter job: ");
                String job = scanner.nextLine();
                System.out.println("Enter passport: ");
                String passport = scanner.nextLine();
                Person person = new Person(name, age, job, passport);
                persons.add(person);
            }
            town.addFamily(new Family(persons,address ));
        }
        town.showInfor();
    }
}
