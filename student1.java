/* 2.Call by method example   */
public class student1 {

    int rollno;
    String name;
    void insertrecord(int r, String n)
    {
      rollno=r;
      name=n;
      System.out.println("Hi "+n+" Your Roll no is "+r);
    }
       
    }
    class teststudent1{
        public static void main(String[] args)
        {
            student1 s1=new student1();
            s1.insertrecord(700, "prakash");

            
    
        }
    }
    