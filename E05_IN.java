public class E05_IN 
{
    public static void main(String[] args) 
    {
        Student yosef = new Student("Yosef", "123456", "Java");
        yosef.showGreetings();
        System.out.println(yosef);

        Person another = null;
        another = new Student("Ivan", "123456", "React");
        another.showGreetings();
        System.out.println(another);
    }
}
