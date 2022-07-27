import java.util.Scanner;

class vol{
   void vloume( int l, int b, int h )
   {
    System.out.println("vloume"+(l*b*h));
   }
}

public class Box {
    int a, b,c;
    public static void main(String args[]){
        System.out.println("Enter length , bredth , height of object :");
       Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
      
System.out.println("Enter length :");
int a= sc.nextInt();  
System.out.println("Enter  bredth :");
int b= sc.nextInt();  
System.out.println("Enter height  :");
int c= sc.nextInt();  

        vol v1=new vol();
        System.out.println("Call First object  :");
             v1.vloume(a,b,c);

             vol v2=new vol();
             System.out.println("Call second object  :");
             v2.vloume(++a,++b,++c);
             vol v3=new vol();
             System.out.println("Call Third object  :");
             v3.vloume(--a,--b,--c);

    }



}
