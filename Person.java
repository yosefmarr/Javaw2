public class Person
{
    private String name;
    private String dpi;

    public Person(String name, String dpi)
    {
        this.name = name;
        this.dpi = dpi;
    }

    public String getName()
    {
        return this.name;
    }

    public String getDpi()
    {
        return this.dpi;
    }

    public void showGreetings()
    {
        System.out.println("Hi i am a person");
    }

}
