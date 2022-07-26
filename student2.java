/* 3.Call by  constructor  example   */
 public class employee {

    int id;
    String name;
    float salary;
     employee(int i, String n, float s)
    {
      id=i;
      name=n;
      salary=s;
      System.out.println("id : "+id+" Name : "+name+"Salary : "+salary);
        }
     

}
   public  class student2{
        /**
         * @param args
         */
        public static void main(String[] args){
            employee e=new employee(100,"vishal", 69000);
            e.employee(100,"prakash",5900);
            
                          
        }
    }
    