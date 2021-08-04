class checkargument{
public static void main(String args[]){
if(args.length>0)
{System.out.println("Arguments are");
int i=0;
while(i<args.length){
System.out.print(args[i]+" , ");
i=i+1;
}
}
else
System.out.print("NO VALUES");
}
}