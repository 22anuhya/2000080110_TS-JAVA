class adddigit{
public static void main(String args[]){
int x=Integer.parseInt(args[0]);
int s=0,y=x;
while(y>0){
int r=y%10;
s+=r;
y=(int)y/10;
}
System.out.println("Sum of digits is "+s);
}
}