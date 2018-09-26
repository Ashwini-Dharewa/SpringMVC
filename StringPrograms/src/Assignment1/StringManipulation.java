package Assignment1;

public class StringManipulation {
	public static void main(String[] args)
	{
		String s="Welcome to Java World";
		System.out.println("Character at 5th position: "+s.charAt(4));
		System.out.println("Comparision: "+(s.compareTo("Welcome")));
		String snew=s+" - Let us learn";
		System.out.println("After concatenation: "+snew);
		System.out.println("First occurence of a: "+(snew.indexOf('a'))+1);
		System.out.println("After replacement: "+snew.replace('a','e'));
		System.out.println("Substring : "+snew.substring(4,10));
		System.out.println("String in lower case: "+snew.toLowerCase());
	}

}
