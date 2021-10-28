class overloading_square
 { 
     public void square()    { 
       System.out.println("No Parameter Method Called");
     } 
    public void square( int number )  {
      int square = number * number;
     System.out.println("Method with Integer Argument Called:"+square); 
     }
    public void square( double number ) {
       double square = number * number;
       System.out.println("Method with float Argument Called:"+square); 
     }
public static void main(String[] args)
  {
    overloading_square obj = new overloading_square();
    obj.square();
    obj.square(5);   
    obj.square(2.5);   
  }
 }