class Ass_Director{
void name(String n){
System.out.println("Ass_Director Name: "+n);}
}
class Director extends Ass_Director{
void name(String n,String nn){
System.out.println("Director Name: "+n);
super.name(nn);}}
class Movie extends Director{
void name(String n,String nn,String nnn){
System.out.println("Movie Name: "+n);
super.name(nn,nnn);}}
class multilevelinheritance{
public static void main(String args[]){
Movie ob=new Movie();
ob.name("Bahubali","Rajamouli","Rama");}}