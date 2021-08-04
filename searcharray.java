public class searcharray {
public static void main(String args[]) {
int[] arr={1,4,34,56,7};
int s=Integer.parseInt(args[args.length-1]),i=0;
for(i=0;i<args.length-1;i++){
if(Integer.parseInt(args[i])==s)
{System.out.println(i+1);
break;}
}
if(i==args.length-1)
System.out.println("-1");
}
}