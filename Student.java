public class Student extends Person
{
    private String course;
    private int score = 0;

    public Student(String name, String dpi, String course)
    {
        super(name, dpi); // Debe ser lo primero a ejecutar
        this.course = course;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getCourse()
    {
        return this.course;
    }

    public int getScore()
    {
        return this.score;
    }

    @Override
    public void showGreetings()
    {
        System.out.println("Hi i am a student");
    }

    public String toString()
    {
        return "My name is: "+super.getName()+" & my ID is: "+super.getDpi()+" , Course: "+this.course;
    }
}
