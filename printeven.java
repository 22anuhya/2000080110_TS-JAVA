class printeven{
public static void main(String args[]){
int i1=Integer.parseInt(args[0]);
int i2=Integer.parseInt(args[1]);
if(i1%2==1)
i1=i1+1;
if(i1<i2){
for(int i=i1;i<=i2;i+=2)
System.out.println(i);}
else{
for(int i=i2;i<=i1;i+=2)
System.out.println(i);
}
}
}