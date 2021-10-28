class employeeclass{
int id=-1;
String name="NA";
double salary=0.00;
employeeclass(){
System.out.println("This is default constructor");
}
employeeclass(int i){
id=i;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
employeeclass(String n){
name=n;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
employeeclass(double ss){
salary=ss;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
employeeclass(int i,String n){
id=i;
name=n;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
employeeclass(String n,double ss){
name=n;
salary=ss;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
employeeclass(double ss,int i){
salary=ss;
id=i;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
employeeclass(int i,String n,double ss){
id=i;
name=n;
salary=ss;
//System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}
void display(){
System.out.println("id: "+id+" name: "+name+" Salary: "+salary);
}}
class empconstructorMain{
public static void main(String args[]){
employeeclass obj1=new employeeclass();
obj1.display();
employeeclass obj2=new employeeclass(10);
obj2.display();
employeeclass obj3=new employeeclass(10,"Saikiran");
obj3.display();
employeeclass obj4=new employeeclass(10,"Saikiran",123.33);
obj4.display();
}}