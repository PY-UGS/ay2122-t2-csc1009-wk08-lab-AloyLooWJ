public class CircleWithException
{
    private double radius;
    private double area;
    private double diameter;
    final double PI = 3.1415;

    public CircleWithException(double radius)
    {
        setRadius(radius);
    }

    private void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        area = PI * radius * radius;
        return area;
    }

    public double getDiameter()
    {
        diameter = 2 * radius;
        return diameter;
    }
}