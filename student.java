
/* 1.Call by value example  */
public class student {

int id ;
String name;
   
}
class teststudent{
    public static void main(String[] args)
    {
        student s1=new student();
        s1.id=100;
        s1.name="prakash";

        System.out.println("Hi "+s1.name+" Your Roll no is "+s1.id);

    }
}
