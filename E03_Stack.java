import java.util.Stack;

public class E03_Stack
{
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        printStack(s, true);
        s.pop();
        printStack(s, true);
    }

    public static void printStack(Stack<Integer> s, boolean top)
    {
        if(s.empty()) return ;
        int d = s.pop();
        String str = top ? "\n| "+d+" | <--- TOP" : "| "+d+" |";
        System.out.println(str);
        printStack(s, false);
        s.push(d);
    }
}