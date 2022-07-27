class Addition{
    
        Addition(int i, int j){
       System.out.println("constructor with Two parameters"+(i+j));
    }
   
    Addition(int i, int j, int k){
       System.out.println("constructor with Three parameters"+(i+j+k));	      
    }
           
    Addition(int i, String name){
       System.out.println("constructor with int and String param");
    }
    public static void main(String args[]){
      
           
        Addition obj2 = new Addition(12, 12);
 
        Addition obj3 = new Addition(1, 2, 13);
            
        Addition obj4 = new Addition(1,"BeginnersBook");
    }
 }
    

