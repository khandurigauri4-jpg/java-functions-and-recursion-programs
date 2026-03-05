// display all smith numbers between the range 1 to n
import java.util.*;
class Smith {
    public int sumofdigits(int num)
    {
        int s = 0;
        
            while(num>0)
            {
                int rem = num%10;
                s = s + rem;
                num = num/10;
            }
            
        return s;
    }
     public int isPrime(int num1)
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
         Smith ob = new Smith();
         int sumd = 0 , sump = 0;
         System.out.println("smith numbers between the range are ");
         for(int i = 4; i<=n; i++)
         {
            sump = 0;
            sumd = ob.sumofdigits(i);
            int t = i;
             for(int j = 2; j<=t; j++)
             {
                 while(t%j == 0)
                 {
                     if(ob.isPrime(j) == 1)
                     {
                     if(j>9)
                     sump = sump + ob.sumofdigits(j);
                     else
                     sump = sump + j;
                     }
                     t = t/j;
                 }
             }
            if(sump == sumd && ob.isPrime(i) == 0)
            System.out.print(i + " ");
            
         }
     }
}
     
     
     
     