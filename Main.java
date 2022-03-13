import java.util.Scanner;

class UserDefinedException extends Exception{
    public UserDefinedException(String message)
    {
        super(message);
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
        input.close();
        if (radius < 0)
        {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        else
        {
            CircleWithException myCircle = new CircleWithException(radius);
            double rad = myCircle.getRadius();
            double area = myCircle.getArea();
            double diameter = myCircle.getDiameter();
            try
            {
                checkArea(area);
                System.out.println("Circle: \n  -Radius: " + rad + "\n  -Diameter: " + diameter + "\n  -Area: " + area);
            }
            catch (UserDefinedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean checkArea(double area) throws UserDefinedException
    {
        if (area > 1000) throw new UserDefinedException("ERROR: Area more than 1000");
        return true;
    }
}