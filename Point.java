public class Point 
{
    public double x = 0.0;
    public double y = 0.0;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "("+this.x+","+this.y+")";
    }
}
