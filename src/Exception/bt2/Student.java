package workshop5p2q1;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    public Student(String program, int year, double fee, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public int getYear() {
        return year;
    }
    public double getFee() {
        return fee;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStudent{" + "program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }
    public void display()
    {
        System.out.println(toString());
        System.out.println("=====================================");
    }
}
