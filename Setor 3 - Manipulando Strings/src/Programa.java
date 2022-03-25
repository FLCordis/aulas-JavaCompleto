
public class Programa {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "X");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("LowerCase: -" + s01 + "-");
		System.out.println("UpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-"); //Remove espaço no começo e no fim.
		
		System.out.println("\nSubstring (2): " + s04);
		System.out.println("Substring (2,9): " + s05);
		System.out.println("Replace (a,x): " + s06 );
		System.out.println("Replace (abc,x): " + s07 );
		
		System.out.println("\nIndex of 'bc': " + i);
		System.out.println("Last Index of 'bc': " + j);
	}
}
