class Number{
static int a=1;
void add(int n){
a+=n;}}
class staticclass{
public static void main(String args[]){
Number o1=new Number();
o1.add(10);
Number o2=new Number();
o2.add(20);
System.out.println(o1.a);
System.out.println(o2.a);
System.out.println(Number.a);}}