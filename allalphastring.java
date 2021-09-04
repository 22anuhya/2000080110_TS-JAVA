import java.util.Scanner;
class allalphastring{
public static void main(String args[]){
Scanner reader=new Scanner(System.in);
int c=0;
String s=reader.nextLine();
//String s1="abcdefghijklmnopqrstuvwxyz";
//System.out.println(s.compareTo(s1));
int l=s.length();
int k=0;
boolean[] allalpha=new boolean[26];
for(int i=0;i<l;i++){
if('a'<=s.charAt(i) && s.charAt(i)<='z')
k=s.charAt(i)-'a';
else if('A'<=s.charAt(i) && s.charAt(i)<='Z')
k=s.charAt(i)-'A';
allalpha[k]=true;
}
int i=0;
for(i=0;i<26;i++)
if(!allalpha[i])
break;
if(i>=25)
System.out.println("All the alphabets are included");
else
System.out.println("All the alphabets are not included");
}}