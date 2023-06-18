package workshop5p1q2;

public class Validation {
    public static Scanner input = new Scanner(System.in);
    public static String checkString()
    {
        String result=input.nextLine();
        if (result.isEmpty())
        {
            System.out.print("Can not be NULL, enter again: ");
            return checkString();
        }
        return result;
    }

    public static double checkDouble()
    {
        double result=input.nextDouble();
        if (result<0)
            {
                System.out.print("Wrong input: ");
                return checkDouble();
            }
        return result;
    }
}
