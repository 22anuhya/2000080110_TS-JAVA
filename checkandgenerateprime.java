class checkprime{
public static void main(String args[]){
//System.out.print("Enter a number");
int x=Integer.parseInt(args[0]);
if(x==1 || x==0)
System.out.println(x+"is neither prime nor composite");
else{
int c=0;
if(x==2)
System.out.println(x+"is prime");
else if(x%2==0)
System.out.println(x+"is not prime");
else{
for(int i=3;i<=Math.sqrt(x);i+=2){
if(x%i==0)
{c+=1;
break;}
}
if(c!=0)
System.out.println(x+"is not prime");
else
System.out.println(x+"is prime");}}
}
}
class generateprime{
public static void main(String args[]){
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int arr[y-x+1];
int j=0;
/*
for(int i=x;i<=y;i++){
int c=0;
for(int j=2;j<=Math.sqrt(i);j++){
if(i%j==0)
{c+=1;
break;}
}
if(c==0)
System.out.print(i+" , ");
}*/
}
}