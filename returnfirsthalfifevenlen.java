import java.util.Scanner;
class returnfirsthalfifevenlen{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int l=s.length();
if(l%2==0)
System.out.println(s.substring(0,l/2));
else
System.out.println(s.substring(l/2,l));
}}