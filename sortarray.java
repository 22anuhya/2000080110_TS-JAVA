public class sortarray {
public static void main(String args[]) {
int i=0,j=0;
int[] arr=new int[args.length];
for(i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
for(i=0;i<args.length-1;i++){
for(j=0;j<args.length-1-i;j++){
if(arr[j]>arr[j+1]){
int t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;}}}
System.out.print("Sorted array is: ");
for(i=0;i<args.length;i++)
System.out.print(arr[i]+" ");
}
}