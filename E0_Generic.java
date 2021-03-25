public class E0_Generic 
{
    public static void main(String[] args) 
    {
        Data<String> x = new Data<String>("This is a String");
        Data<Integer> y = new Data<Integer>(42);
        //System.out.println(x.getData());
        x.setData("Hola");
        //System.out.println(x.getData());
        x.setData("This is another String");
        x.getData();
        y.getData();
    }
}


class Data<T> 
{
    private T data;

    public Data(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return this.data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}