//widening:byte-short-char-int-long-flaot-double
//narrowing:reverse of widening
class typecasting{
public static void main(String args[]){
int a=10;
double b=a;
char c='A';
int i=c;
System.out.println("Widening: "+b+","+i);
int i1=9;
byte x=(byte)i1;
int i2=5600;
char c1=(char)i2;
System.out.println("Narrowing: "+x+","+c1);//error
}
}