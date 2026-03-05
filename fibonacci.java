// printing fibonacci series through recursion
import java.util.*;
class Series{
     int fibo(int num)
    {
        if(num<=1)
        {
            return 0;
        }
        if(num == 2)
        {
            return 1;
        }
        else
        return (fibo(num-1) + fibo(num-2));
    }

     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("enter the value of n");
         n = sc.nextInt();
         System.out.println("fibonacci series is");
         Series obj = new Series();
         for(int i = 0; i<=n ; i++)
         {
             System.out.print(obj.fibo(i) + " ");
         }
     }
}
     