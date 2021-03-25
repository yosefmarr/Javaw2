import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DynamicWhy {
    public static void main(String[] args) 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int option = 0, usersCount = 0, age = 0;
        String name = "";
        User[] users = new User[3];
        try
        {
            while(option != 2)
            {
                System.out.print("\n1.Agregar Usuario\n2.Salir\n==================\n> ");
                option = Integer.parseInt(in.readLine());
                switch (option)
                {
                    case 1: 
                    {
                        System.out.print("\nIngrese nombre: ");
                        name = in.readLine();
                        System.out.print("Ingrese edad: ");
                        age = Integer.parseInt(in.readLine());
                        users[usersCount++] = new User(name, age);
                        System.out.println("\n"+Arrays.toString(users));
                        break;
                    }
                    case 2: break;
                    default: 
                    {
                        System.out.println("Opcion no valida, Ingrese nuevamente.");
                    }
                }
            }
            System.out.println("\n\nAdios...");
        } 
        catch (IOException e) 
        {
            System.out.println("\nError al obtener el input");
        }
        catch (NumberFormatException e)
        {
            System.out.println("\nError el valor ingresado no es un numero");
        }
    }
}


class User 
{
    public String name;
    public int age;

    public User(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return "\\0/";
    }
}