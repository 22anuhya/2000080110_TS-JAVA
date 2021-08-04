class reversenum{
public static void main(String args[]){
int x=Integer.parseInt(args[0]);
int n=x,s=0;
while(n>0){
int r=n%10;
s=s*10+r;
n=(int)n/10;
}
System.out.println("Rversed number is "+s);
}
}