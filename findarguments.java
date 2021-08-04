class findarguments{
public static void main(String args[]){
if(args.length==0)
System.out.println("No Arguments given");
else{
System.out.println("The Number of Arguments are: "+args.length);
System.out.println("The Following are the Arguments: ");
for(int i=0;i<args.length;i++)
System.out.println(i+1+" "+args[i]);}
}
}