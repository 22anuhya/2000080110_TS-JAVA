class palindrome{
public static void main(String args[]){
int i=0,f=0;
for(i=args[0].length()-1;i>=0;i--){
if(args[0].charAt(i)!=args[0].charAt((args[0].length())-i-1)){
f=1;
break;}
//System.out.println(args[0].charAt((args[0].length())-i-1)+args[0].charAt(i));
}
if(f==0)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}