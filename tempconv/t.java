import java.util.*;
public class Test{
    public static void printArray(int ...t)
    {
        for(int i :t)
        {
            System.out.println( i+" ");
        }
    }
    public static void main(String [] args)
    {
       printArray(2,3,4);
       printArray(7);
    }
}