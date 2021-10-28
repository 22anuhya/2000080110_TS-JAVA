class employeeclass{
int id;
String name;
double salary;
void setId(int i){
id=i;}
void setName(String n){
name=n;}
void setSalary(double ss){
salary=ss;}
void display(){
System.out.println("name: "+name+" Salary: "+salary);}
public static void main(String args[]){
employeeclass obj=new employeeclass();
obj.setId(1);
obj.setName("Mamatha");
obj.setSalary(2400000.89);
obj.display();
}}