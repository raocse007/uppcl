import java.io.NotActiveException;
import java.util.Scanner;
class calc
{
 public int Add(int a, int b )
 {
    return a+b;

 }
 public int Sub(int a, int b )
 {
    return a-b;

 }
 public int mul(int a, int b )
 {
    return a*b;
 }
    public int div(int a, int b )
    {
       return a/b;
   
       
    }
    public int modulo(int a, int b )
    {
       return a%b;
   
       
    }
    public int Andop(int a, int b )
    {
       return  a&b;
   
    }
    public int orop(int a, int b )
    {
       return a|b;
   
    }
    public int notop(int a)
    {
       return a;
   
    }
   
 
}
public class simplecalc{
int a,b,c,d,result;
    public static void main(String[] args){

   int ch;

        System.out.println("Enter Your Choice : 1. Addition\n 2. substraction\n 3. multiplication \n4. divide \n5. Modulo \n6. AND operation \n7. OR operation \n8. Not Operation " );
        Scanner myObj = new Scanner(System.in);
        calc c=new calc();
        ch=myObj.nextInt();
       // while(1){
        switch(ch){
            case 1:  System.out.println("Addition of two numbers ");
            System.out.println("Addition of two numbers "+c.Add(3,2));
             break;
             case 2:  System.out.println("Subtraction of two numbers ");
            System.out.println("Addition : "+c.Sub(3,2));
             break;
             case 3:  System.out.println("Multiplication  of two numbers ");
            System.out.println("Multiplication  "+c.mul(3,2));
             break;
             case 4:  System.out.println("Division  of two numbers ");
            System.out.println("Division "+c.div(3,2));
             break;
             case 5:  System.out.println("Modulo of two numbers ");
            System.out.println("Modulo  "+c.modulo(3,2));
             break;
             case 6:  System.out.println("And opertyion  of two numbers ");
            System.out.println("And opertyion "+c.Andop(3,2));
             break;
             case 7:  System.out.println("OR opertyion  of two numbers ");
            System.out.println("OR opertyion "+c.orop(3,2));
             break;
             case 8:  System.out.println("Not opertyion  of two numbers ");
            System.out.println("Not opertyion "+c.notop(2));
             break;
             default :
             System.out.println("exit");


            


        }     
//    } 

    }  

}

