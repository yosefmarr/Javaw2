public interface Vehicle 
{
    public static final int MAX_VELOCITY = 400;
    public void start();
    public void useBreak();
    public void setVelocity(int velocity);
    public int getActualVelocity();
}
