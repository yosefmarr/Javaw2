public class E08_Interface 
{
    public static void main(String[] args) 
    {
        Car c = new Car("Tesla S");
        c.start();
        System.out.println(c.getActualVelocity());
        System.out.println(Vehicle.MAX_VELOCITY);
    }
}
