class A{
int val=0;}
class B extends A{
int val=0;
void set(int val){
val=val+10;
this.val=val+20;
super.val=val*2;
System.out.println("Arg "+val+" B val "+this.val+" A "+super.val);}}
class varinheritance{
public static void main(String args[]){
B o=new B();
o.set(20);}}