//access specifiers
class acessspecifier{
private int a=10;
public int b=10;
int sum(){
return a+b;}
int geta(){
return a;}
//to modify private variable
void seta(int x){
a=x;}
}
class encapsulation{
public static void main(String args[]){
acessspecifier obj=new acessspecifier();
System.out.println("Value of b from obj"+obj.b);
System.out.println("Value of a from method-geta()"+obj.geta());
System.out.println("Value of sum from method"+obj.sum());
}}

class Point {
    int m_x, m_y; 
    Point(){}
    Point(int x, int y) 
     {    
         m_x = x;    
         m_y = y;  
      }
    public static void main(String args[]) 
    {
      Point p = new Point();
    }
}