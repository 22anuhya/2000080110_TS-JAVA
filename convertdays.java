import java.util.Scanner;
class convertdays{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int d=sc.nextInt();
int da=0,yr=0,w=0;
yr=(int)d/(12*30);
w=(int)(d-yr*12*30)/7;
da=(int)(d-yr*12*30-w*7);
System.out.println(yr+" Years "+w+" weeks "+da+" days");
}}