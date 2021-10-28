import java.util.Scanner;
class isomorphic{
public static void main(String aargs[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int[] m1=new int[123];
int[] m2=new int[123];
int i=0;
if(s1.length()!=s2.length()){
System.out.println("Not Isomorphic");
return;}
else{
for(i=0;i<s1.length();i++)
{
if(m1[s1.charAt(i)]==0 && m2[s2.charAt(i)]==0)
{	
	m1[s1.charAt(i)]=s2.charAt(i);
	m2[s2.charAt(i)]=s1.charAt(i);
}
else if(m1[s1.charAt(i)]!=s2.charAt(i) || m2[s2.charAt(i)]!=s1.charAt(i))
{
	System.out.println("Not Isomorphic");
	return;
}
}
System.out.println("Isomorphic");
}
}}