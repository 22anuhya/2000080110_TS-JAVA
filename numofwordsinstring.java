import java.util.Scanner;
class numofwordsinstring{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
s=s.trim();
int c=0;
for(int i=0;i<s.length();i++)
{
//if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')--counts first sapce if given if trim not taken
if(s.charAt(i)==' ' && s.charAt(i-1)!=' ')//counts last sapce alsoif given if trim not taken to remmove first and last spaces
c++;
}
System.out.println("no.of words are "+(c+1));
}}