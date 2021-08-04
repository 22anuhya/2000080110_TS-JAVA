class alphaorder{
public static void main(String args[]){
/*char c1='a';
char c2='e';
if(c1>c2)
System.out.println("ORDER: "+c2+" "+c1);
else
System.out.println("ORDER: "+c1+" "+c2);*/
//find type
/*char c1='a';
if((c1>='A' && c1<='Z') || (c1<='a' && c1<='z'))
System.out.println("Alphabet");
else if(c1>='0' && c1<='9')
System.out.println("digit");
else
System.out.println("special character");*/
//switch case
char c='r';//for case sensitive take more cases or use if/elif..
switch(c){
case 'R':
System.out.println("RED");
break;
case 'B':
System.out.println("BLUE");
break;
case 'G':
System.out.println("GREEN");
break;
case 'O':
System.out.println("ORANGE");
break;
case 'Y':
System.out.println("YELLOW");
break;
case 'W':
System.out.println("WHITE");
break;
default:
System.out.println("Invalid");
}
}
}