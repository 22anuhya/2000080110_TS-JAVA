class string {
	public static void main(String args[]) {
		String s1="Hello";
		String s2=new String("World");
		System.out.println(s1+" "+s2);
		char[] c1={'h','e','l','l','o'};
		String cs1=new String(c1);
		System.out.println("Char array String "+cs1);
		System.out.println("length of Char array String "+cs1.length());
		System.out.println("length of s1 "+s1.length());
		String os="Iam Copied";
		String cs=os;
		System.out.println("Copied string is "+cs);
		System.out.println("Iam Concatenated: "+cs.concat(os));
		System.out.println("Iam Concatenated: "+os.concat(cs));
		System.out.println("Iam original copied: "+cs);
		System.out.println("Iam original: "+os);
		System.out.println("index of lo in cs1 "+cs1.indexOf("lo"));//first occurance is considered
		//indexOf(char ch/String s,int fromIndex)
		//lastIndexOf
}}