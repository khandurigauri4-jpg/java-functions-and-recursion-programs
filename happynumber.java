// check if the given number is happy number or not
import java.util.*;
class Happy {
    
    public static int sumofdigits(int n)
    {
        int s = 0;
        while(n>9)
        {
            s = 0;
            while(n>0)
            {
                int r = n % 10;
                s = s + r*r;
                n = n/10;
            }
            n = s;
        }
        return s;
    }
     
     public static int isHappy(int num)
     {
         int sum = sumofdigits(num);
         if(sum == 1)
         return 1;
         else
         return 0;
     }
     public static void main(String args[])
     {
         Scanner sc = new Scanner (System.in);
         int n1;
         System.out.println("enter a number");
         n1 = sc.nextInt();
         if(isHappy(n1) == 1)
         System.out.println("happy number");
         else
         System.out.println("not a happy number");
     }
}
     
     
     
     