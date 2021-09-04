class swapcasesinstring {
	public static void main(String args[]){
		String s1="HELLO";
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++)
		s2+=(char)((int)s1.charAt(i)+32);
		for(int i=0;i<s2.length();i++)
		s3+=(char)((int)s2.charAt(i)-32);
		System.out.println("Converted to lower case "+s2);
		System.out.println("Converted to upper case "+s3);
		String s=lowerCase(s3);
		System.out.println("Converted to lower case "+s);
}}