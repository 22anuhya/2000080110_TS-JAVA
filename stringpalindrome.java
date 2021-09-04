import java.util.Scanner;
class stringpalindrome{
public static void main(String args[]){
Scanner reader=new Scanner(System.in);
int c=0;
String s=reader.nextLine();
int l=s.length();
for(int i=0;i<l/2;i++)
if(s.charAt(i)==s.charAt(l-i-1))
c+=1;
if(c==l/2)
System.out.println("It is palindrome");
else
System.out.println("It is not palindrome");
}}