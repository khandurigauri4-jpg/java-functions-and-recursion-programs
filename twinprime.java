// display all twin prime numbers between the range 1 to n
import java.util.*;
class TwinPrime {
    
     public static int isPrime(int num1)
     {
         int c = 0;
         for(int i = 1; i<=num1; i++)
         {
             if(num1%i == 0)
                c++;
              }
         if(c==2)
         return 1;
         else
         return 0;
     }
     public static void main(String args[])
     {
         Scanner sc = new Scanner (System.in);
         int n;
         System.out.println("enter range");
         n = sc.nextInt();
         TwinPrime ob = new TwinPrime();
         int a1 , a2;
         System.out.println("twin prime numbers numbers between the range are ");
         for(int i = 1; i<=n; i++)
         {
            int j = i+ 2;
            a1 = ob.isPrime(i);
            a2 = ob.isPrime(j);
             if(a1 == 1 && a2 == 1)
             {
                 
            System.out.print(i + " \t" + j);
            
         }
         System.out.println();
     }
}
}
     
     
     
     