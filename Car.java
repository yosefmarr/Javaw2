public class Car implements Vehicle
{
    int speed = 0;
    String model;

    public Car(String model)
    {
        this.model = model;
    }

    public void start()
    {
        System.out.println("Car is starting...");
        setVelocity(5);
    }
    public void useBreak()
    {
        System.out.println("Car is stoping...");
        setVelocity(0);
    }
    public void setVelocity(int velocity)
    {
        this.speed = velocity;
    }
    public int getActualVelocity()
    {
        return this.speed;
    }
}
