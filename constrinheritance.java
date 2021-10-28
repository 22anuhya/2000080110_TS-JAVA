// should be the first statement whenever called---cannot be called many times
class A{
int a;
/*A(){
a=10;
System.out.println("in class A constructor");
}*/
A(int v)
{
a=v;
}
}
class B extends A{
int b;
B(){
super(10);
b=20;
System.out.println("in class B constructor");}
/*B(int va){
super();
System.out.println("in class B constructor");}*/
}
class constrinheritance{
public static void main(String args[]){
B s=new B();
System.out.println(s.a+" "+s.b);}}