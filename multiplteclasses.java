class sub{
String msg="Hello";
string myname;
void disp(String name){
myname=name;
System.out.println(msg+name);
}}
class multipleclasses{
public static void main(String args[])
{
sub s1=new sub();
sub s2=new sub();
sub s3=new sub();
s1.disp("Sai kiran");
s1.disp("Vamsi");
s1.disp("Nandan");
System.out.println(s1.myname+","+s2.myname+","+s3.myname);}}