class placeinarray{
public static void main(String args[]){
int[] arr=new int[10];
for(int i=0;i<arr.length-1;i++)
arr[i]=i+1;
for(int i=0;i<arr.length;i++){
if(i==Integer.parseInt(args[1])-1){
for(int j=arr.length-1;j>=i;j--){
if(j==i)
arr[i]=Integer.parseInt(args[0]);
else
arr[j]=arr[j-1];
}
}
}
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
}}