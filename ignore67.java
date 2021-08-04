public class ignore67{
public static void main(String args[]) {
int s=0,f=0,p=0,ss=0,i=0,j=0;
for(i=0;i<args.length;i++)
s+=Integer.parseInt(args[i]);
for(i=0;i<args.length;i++){
if(Integer.parseInt(args[i])==6 && f==0){
f=1;
p=i;}
if(Integer.parseInt(args[i])==7 && f==1){
for(j=i;j>=p;j--)
ss+=Integer.parseInt(args[j]);
ss+=6;
System.out.println(ss);
s-=ss;
ss=0;
f=0;}
}
System.out.println(s-ss);}}
/*
int i=0,j=0;
for(i=0;i<args.length;i++)
s+=Integer.parseInt(args[i]);
for(i=0;i<args.length;i++){
	int p=0;
	if(Integer.parseInt(args[i])==6)
	{
	   for(j=i+1;j<args.length;j++){
		//if(Integer.parseInt(args[j])==6)
			//break;
		if(Integer.parseInt(args[j])==7){
			for(int k=j;k>=i;k--)
				ss+=Integer.parseInt(args[k]);
                        System.out.println(ss);
			break;
}
}
i=j+1;}
}
System.out.println(s-ss);
}
}*/