package Lab2.bt10;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String school;

    public Student() {
        super();
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void inputThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter school: ");
        school = scanner.nextLine();

    }
    @Override
    public String toString() {
        return "Student{" +
                "Tên=" + name +
                ", Tuổi='" + age + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}