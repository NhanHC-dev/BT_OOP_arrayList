package R_W_File.bt2;

import java.util.Scanner;

public class Student extends Person{
    static int count = 0;
    int id = 0;
    float gpa;

    public Student() {
        id = ++count;
    }

    public Student(int id, float gpa) {
        this.id = ++count;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter ID: ");
//        id = Integer.parseInt(scanner.nextLine());
        //id += count;
        super.input();
        System.out.print("Enter GPA: ");
        gpa = Float.parseFloat(scanner.nextLine());
    }
    public void display(){
        System.out.println(this);
    }
    public String getFileLine(){
        return id +", " + name +", " + age +", " + address +", " + gpa +"\n ";
    }
    public void parse(String line){
        String[] param = line.split(",");
        try{
            id = Integer.parseInt(param[0]);
            name = param[1];
            age = Integer.parseInt(param[2]);
            address = param[3];
            gpa = Float.parseFloat(param[4]);
        } catch (ArrayIndexOutOfBoundsException ex){
        } finally {
        }
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
