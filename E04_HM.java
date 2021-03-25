import java.util.HashMap;
import java.util.LinkedList;

public class E04_HM 
{
    public static void main(String[] args) 
    {
        Category[] cat = { new Category("Action"), new Category("Sci-fi"), new Category("Horror")};
        HashMap<Category, LinkedList<Book>> library = new HashMap<Category, LinkedList<Book>>();
        library.put(cat[0], new LinkedList<Book>());
        library.put(cat[1], new LinkedList<Book>());
        library.put(cat[2], new LinkedList<Book>());
        LinkedList<Book> l = library.get(cat[0]);
        l.add(new Book("B1"));
        l.add(new Book("B2"));
        l.add(new Book("B5"));
        library.put(cat[0], l);
        l = library.get(cat[1]);
        l.add(new Book("B3"));
        l.add(new Book("B4"));
        library.put(cat[1], l);

        // Category de accion
        System.out.println(cat[0] + " ==> "+ library.get(cat[0]));

        // Category de sci-fi
        System.out.println(cat[1] + " ==> "+ library.get(cat[1]));


    }
}

class Category 
{
    public String name;
    public Category(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return this.name.toUpperCase();
    }
}

class Book
{
    public String name;
    public Book(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return "|"+this.name+"|";
    }
}
