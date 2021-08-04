public class arraysum {
public static void main(String args[]) {
if(args.length>10)
System.out.println("Oversized");
else
{
int[] arr=new int[10];
for(int i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
int s=0,ma=Integer.MIN_VALUE,mi=Integer.MAX_VALUE,smi=Integer.MAX_VALUE,sma=Integer.MIN_VALUE;
for(int i=0;i<args.length;i++)
{s+=arr[i];
if(ma<arr[i])
{sma=ma;
ma=arr[i];}
else if(sma<arr[i] && arr[i]!=ma)
sma=arr[i];
if(mi>arr[i])
{smi=mi;
mi=arr[i];}
if(smi>arr[i] && arr[i]!=mi)
smi=arr[i];
}
/*for(int i=0;i<args.length;i++){
if(sma<arr[i] && arr[i]!=ma)
sma=arr[i];
if(smi>arr[i] && arr[i]!=mi)
smi=arr[i];
}*/
System.out.println("Sum: "+s+" Average: "+s/(float)args.length);
System.out.println("Minimum: "+mi+" Maximum: "+ma+"\nSecond min: "+smi+" Second max: "+sma);
int mas=s-mi;
System.out.println("Maximum sum of 9 elements is "+mas);
}
}
}