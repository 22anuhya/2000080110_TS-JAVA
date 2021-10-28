interface intdemo
{
void display();
}
class classone implements intdemo
{
void add(int x,int y){
System.out.println("The sum is "+(x+y));}
public void display(){
System.out.println("Welcome to Interfaces");}}
class classtwo implements intdemo{
void multiply(int i,int j,int k){
System.out.println("multiplication result is "+(i*j*k));
}
public void display(){
System.out.println("Welcome to Interfaces");}
}
/*
class interface2{
public static void main(String args[]){
classone o1=new classone();
classtwo o2=new classtwo();
o1.add(10,20);
o1.display();
o2.multiply(30,40,50);
o2.display();
}
}
*/
//run time polymorphism
class interface2{
public static void main(String args[]){
intdemo obj;
classone o1=new classone();
classtwo o2=new classtwo();
obj=o1;
//obj.add(10,20);
obj.display();
obj=o2;
//obj.multiply(30,40,50);
obj.display();
}
}