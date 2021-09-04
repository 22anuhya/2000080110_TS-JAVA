import java.util.Scanner;
class numofeachdigitinstring{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int[] a=new int[10];
int f=0;
for(int i=0;i<s.length();i++)
a[(int)(s.charAt(i))-48]++;
for(int i=0;i<10;i++)
System.out.println("Number of "+i+" are "+a[i]);
}}