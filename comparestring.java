class comparestring{
public static void main(String args[]){
	String s1=new String("Hello");
	String s2=new String("hello");
	String s3="Hello";
	System.out.println("equal operator both are Equal: ");
	System.out.print(s1==s2);//this checks the address also
	System.out.println("\nequal function both are Equal: "+s1.equals(s2));
	System.out.println("\nequal function both are Equal: "+s1.equals(s3));
	System.out.println("\nequal operator both are Equal: ");
	System.out.print(s1==s3);
	System.out.println("\nequal function both are Equal by ignore case: "+s1.equalsIgnoreCase(s2));
	System.out.println("\ncompareto function : "+s1.compareTo(s2));//if -ve s1 is smaller
	System.out.println("\nstartswith and endswith : "+s1.startsWith("he"));
}}