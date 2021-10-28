class Constructor{
Constructor()
{
System.out.println("This is default constructor");
}
Constructor(int a){
System.out.println("This is constructor with one argument "+a);}}
class mainConstructor{
public static void main(String args[]){
Constructor o1=new Constructor();
Constructor o2=new Constructor(100);}}