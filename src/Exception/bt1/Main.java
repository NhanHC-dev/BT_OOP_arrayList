package workshop5p1q2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Worker[] arrWorker=new Worker[100];
        Worker wk=new Worker();
        for (int i=0;i<2;i++) {
            arrWorker[i]= wk.getInput();
        }
        for (int i=0;i<2;i++) {
            arrWorker[i].display();
        }
    }
     
}
