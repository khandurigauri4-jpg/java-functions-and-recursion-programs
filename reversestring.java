// reverse a string using recursion
import java.util.*;
class Stringrev {
    String str , r;
    int l;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("enter a string ");
        str = sc.next();
        r = "";
        l = str.length();
    }
    public String reverse(String st , int s , String rev)
    {
        if(s<0)
        return rev;
        else
        {
            rev = rev + st.charAt(s);
            return reverse(st , s-1 , rev);
        }
    }
    
     void result()
     {
     String res = reverse(str , l-1 ,r);
     System.out.println("string is = " + str);
         System.out.println("reverse is = " + res);
     }
     public static void main(String args[])
     {
         Stringrev ob = new Stringrev();
         ob.input();
         ob.result();
     }
}
     