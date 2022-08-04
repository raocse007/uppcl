public class revnum
{
static int  numrev(int n)
    { int r=0;
      while(n>0)
      { r=n%10;
                n=(int)n/10;
        r=r+r*10;
      }
     return r;

    }
      
    public static void main (String args[])
    {
    int n = 54321,x;
             x=numrev(n);
      

    }

} 