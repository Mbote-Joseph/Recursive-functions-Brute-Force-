public class Main{
    // static variables to hold x, y and z
    static int x, y , z;
    
    // recursive method to return nth member of sequence
    static int recursiveFunction(int n) {
        // base cases
        if(n<=2) return 1;
        if(n==3) return 2;
        // recursive case
        return x*recursiveFunction(n-1)+y*recursiveFunction(n-2)+z*recursiveFunction(n-3);
    }
    
    // main code
    public static void main(String[] args) {
        // run brute force test
        for(int i=-10;i<=10;i++) {
            for(int j=-10;j<=10;j++)
            {
                for(int k=-10;k<=10;k++) {
                    if(1*k+1*j+2*i==-16 &&
                        1*k+2*j+-16*i==52 &&
                        2*k+-16*j+52*i==-152)
                    {
                        x=i;y=j;z=k;
                    }
                }
            }
        }
        
        // print sequence
        // 20 numbers
        System.out.println("Sequence is :");
        for(int i=1;i<=20;i++){
            System.out.print(recursiveFunction(i)+" ");
        }
        
        // print multipliers
        System.out.println();
        System.out.println("x = " + x + ",y = " + y + ",z = " + z);
    }
}
