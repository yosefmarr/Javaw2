public abstract class Shape 
{
    protected Point center;
    public Shape(double x, double y)
    {
        this.center = new Point(x, y);
    }
    public Point getCenter()
    {
        return this.center;
    }
    public abstract double getArea();
    public abstract double getPerimetro();
}
