package workshop5p1q2;

public abstract class Person {
    private String name;
    
    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }
    public abstract void display();
    public abstract double getSalary();
    @Override
    public String toString() {
        return "Name = " + name;
    }
    
}
