import java.util.Scanner;
class vowelsinstring{
public static void main(String args[]){
Scanner reader=new Scanner(System.in);
int c=0;
String s=reader.nextLine();
char[] v=new char[s.length()];
int k=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
{v[k]=s.charAt(i);
k+=1;
}
}
for(int i=0;i<k;i++)
System.out.print(v[i]+" ");
}}