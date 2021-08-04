class prime{
public static void main(String args[]){
int x=Integer.parseInt(args[0]);
int c=0;
for(int i=2;i<=x;i++){
if(x%i==0)
c+=1;
}
if(c>2)
System.out.println("Number "+x+"is not prime");
else
System.out.println("Number "+x+"is prime");
}
}