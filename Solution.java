import java.util.*;

public class Solution
{
   public static int recursiveFun(int n){
       if(n == 1)           //base cases first three terms are 1, 1, 2
           return 1;
       if(n == 2)
           return 1;
       if(n == 3)
           return 2;
       return -2*recursiveFun(n-3) + (-1)*recursiveFun(n-2) + 9*recursiveFun(n-1);   //f(n) = -2f(n-3) -f(n-2) + 9f(n-1)
   }

   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);   //create scanner object
       System.out.print("Enter the number of terms to generate: ");
       int n = in.nextInt();               //read number of terms

       for(int i = 1; i <= n; i++)           //print 1st term till nth term
           System.out.print(recursiveFun(i) + ", ");
       System.out.println();
   }
}

