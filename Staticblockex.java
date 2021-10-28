class Staticblockex{
Staticblockex(){
System.out.println("within constructor");
}
static{
System.out.println("within 1st static block");
}
static void m1(){
System.out.println("within static m1 method");}
static{
System.out.println("within 2nd staic block");
m1();}
public static void main(String args[]){//until all the static blocks are executed it then goes to main
System.out.println("within main");
Staticblockex o=new Staticblockex();
}
static{
System.out.println("within 3rd static block");}}