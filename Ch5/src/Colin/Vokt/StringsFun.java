package Colin.Vokt;

public class StringsFun {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.indexOf("to"));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf("o", 15));
		System.out.println(s1.length());
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 11));
		System.out.println(s1.startsWith("Wel"));
		System.out.println(s1.endsWith("Java"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s3));
		System.out.println("\t Wel \t".trim());
		
		
		
		/*
		 * equals(s1): Returns true if string is equal to string s1
		 * equalsIgnoreCase: Returns true if this string is equal to string s1; it is case insensitive
		 * compareTo: Returns an integer greater than 0, equal...
		 * compareToIngnoreCase
		 * startsWith(prefix)
		 * endsWith(suffix)
		 * contains(s1)
		 */
	}

}
