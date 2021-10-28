interface FirstInterface
{
int addMethod(int x,int y);
double divMethod(int m,int n);
void display();
int var1=10;
double var2=20.65;
}
class Myclass implements FirstInterface
{
public int addMethod(int a,int b)
{
return (a+b);
}
public double divMethod(int m,int n){return m/n;}
public void display(){
System.out.println("Var1: "+var1);
System.out.println("Var2: "+var2);
}
}
class interfaces{
public static void main(String args[]){
Myclass o=new Myclass();
System.out.println(o.addMethod(10,20));
System.out.println(o.divMethod(20,4));
o.display();
}
}