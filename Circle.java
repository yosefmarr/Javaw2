public class Circle extends Shape
{
    protected double r;
    public Circle(double x, double y, double radio)
    {
        super(x,y);
        this.r = radio;
    }

    public double getRadio()
    {
        return this.r;
    }

    @Override
    public double getArea()
    {
        return (Math.PI * Math.pow(this.r, 2));
    }

    @Override
    public double getPerimetro()
    {
        return (2*Math.PI*this.r);
    }

}
