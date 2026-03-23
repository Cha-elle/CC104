import java.util.Scanner;
	public class WordAnalyzer {
	public static void main(String[] cha) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter sentence: ");
	String sen = sc.nextLine();
	
	String[] count = sen.split(" ");
		System.out.print("Word count: " + count.length);

	String rep = sen.replaceAll("[a,e,i,o,u]", "*");
		System.out.print("\nWithout vowels: " + rep);

	String longest = "";

	for (String word : count) {
		if(word.length() > longest.length()) {
			longest = word;
			
 			}
		}	
	 System.out.print("\nLongest word: " + longest);

	}
}