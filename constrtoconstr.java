class Sample{
Sample(){
this("Java");//call overloaded constructor--it should be the first statement if included and loop shoudn't be taken
System.out.println("Default constructor");
}
Sample(String s){
System.out.println("One argument constructor "+s);}}
class constrtoconstr{
public static void main(String args[]){
Sample a1=new Sample();}}