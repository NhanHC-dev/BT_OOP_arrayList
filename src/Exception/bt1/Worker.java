package workshop5p1q2;

public class Worker extends Person {
    private double salary;
    private double rate;

    public Worker(){

    }
    public Worker(double salary, double rate, String name) {
        super(name);
        this.salary = salary;
        this.rate = rate;
    }
    public Worker getInput()
    {
        System.out.print("Type Name: ");
        String name = Validation.checkString();
        System.out.print("Type Basic Salary: ");
        double salar = Validation.checkDouble();
        System.out.print("Type Rate: ");
        double rat = Validation.checkDouble();
        Worker temp=new Worker(salar,rat,name);
        return temp;
    }
    @Override
    public String toString() {
        return super.toString()+"\nSalary = "+getSalary();
    }
    @Override
    public void display() {
        System.out.println(toString());
        System.out.println("===============");
    }
    @Override
    public double getSalary() {
        return salary*rate;
    }
    
}
