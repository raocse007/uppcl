public class fibonacci
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    int i=0,n = 9;
     do{
        System.out.print("  "+fib(i));
        i++;
       }while(i<=n);

    }

} 