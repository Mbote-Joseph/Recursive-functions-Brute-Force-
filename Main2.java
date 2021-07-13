public class Main2 
{
    // static variables to hold x, y and z
    static int x, y , z;
    
    // recursive method to return nth member of sequence
    static int F(int n) {
        // base cases
        if(n<=2) return 1;
        if(n==3) return 2;
        // recursive case
        return x*F(n-1)+y*F(n-2)+z*F(n-3);
    }
    
    // main code
    public static void main(String[] args) 
    {
        // run brute force test
        // each variable i, j and k runs from -10 to 10
        // as there are only 3 variables, three
        // equations must be checked
        for(int i=-10;i<=10;i++) 
        {
            for(int j=-10;j<=10;j++)
            {
                for(int k=-10;k<=10;k++)
                {
                    // 1,1,2,6
                    // 1,2,6,9
                    // 2,6,9,13
                    if(1*k+1*j+2*i==6 &&
                        1*k+2*j+6*i==9 &&
                        2*k+6*j+9*i==13)
                    {
                        // found multipliers
                        // set static variables
                        x=i;y=j;z=k;
                    }
                }
            }
        }
        
        // print sequence
        // 20 numbers
        System.out.println("Sequence is :");
        for(int i=1;i<=20;i++)
        {
            System.out.print(F(i)+" ");
        }
        
        // print multipliers
        System.out.println();
        System.out.println("x = " + x + ",y = " + y + ",z = " + z);
    }
}