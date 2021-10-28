class Collage{
String Collage_name;
String Code;
Collage(){
System.out.println("Default collage construcctor");}
Collage(String n,String c){
Collage_name=n;
Code=c;
System.out.println("collage name: "+this.Collage_name+" code: "+this.Code);
}}
class Student extends Collage{
int Student_id;
String Student_name;
Student(){
System.out.println("Default student construcctor");}
Student(String n,int id){
Student_name=n;
Student_id=id;
System.out.println("collage name: "+this.Collage_name+" code: "+this.Code+" Student name: "+this.Student_name+" Student ID: "+this.Student_id);
}}
class Staff{
int Staff_id;
String Staff_name;
Staff(){
System.out.println("Default staff construcctor");}
Staff(String n,int id,String cn,int cc){
super(cn,cc);
Staff_name=n;
Staff_id=id;
System.out.println("collage name: "+this.Collage_name+" code: "+this.Code+" Staff name: "+this.Staff_name+" Staff ID: "+this.Staff_id);
}}
class Hierarichalinheritance{
public static void main(String args[]){
Staff o1=new Staff("abc",123,"def",456);
}}