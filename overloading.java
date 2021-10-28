class divide{
int div(int a,int b){
return a/(b);}
double div(double a, double b){
return a/b;}
}
class overloading{
public static void main(String args[]){
divide o=new divide();
System.out.println(o.div(10,20));
System.out.println(o.div(10.2,20.2));
}}