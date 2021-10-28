class Patient{
String name;
double weight;
double height;
Patient(String n,double w,double h){
name=n;
weight=w;
height=h;
}
double BMI(){
return ((weight/(height*height))*703);}}
class Patients{
public static void main(String args[]){
Patient p1=new Patient("Abc",4.2,5.6);
System.out.println("BMI of the patient is "+p1.BMI());}}