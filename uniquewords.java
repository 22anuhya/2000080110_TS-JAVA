import java.util.Scanner;
class uniquewords{
public static void main(String args[]){
Scanner reader=new Scanner(System.in);
//String a[]=s.split("\\s");
String s=reader.nextLine();
s=s.trim();
int l=s.length();
String a[]=new String[100];
int k=0;
int f=0;
for(int i=0;i<l;i++)
{
if (s.charAt(i)!=' ' && (f==1 || i==0)){
a[k]="";
a[k]+=s.charAt(i);
f=0;}
else if(s.charAt(i)!=' ' && (f==0)){
a[k]+=s.charAt(i);}
else if(s.charAt(i)==' '){
k+=1;
f=1;}
}
int x=0;
String ns[]=new String[100];
for(int i=0;i<=k;i++)
{
System.out.println(s.indexOf(a[i])+" "+s.indexOf(a[i],s.indexOf(a[i])+1));
if(s.indexOf(a[i],s.indexOf(a[i])+1)==-1){
ns[x]=a[i];
x+=1;
}
else if(s.indexOf(a[i],s.indexOf(a[i])+1)!=-1  && ss!=a[i]){
String ss=a[i];
ns[x]=a[i];
x+=1;
}
System.out.println(a[i]+" "+ss+" "+ns[x-1]);
}
for(int i=0;i<x;i++)
System.out.println(ns[i]);
}}