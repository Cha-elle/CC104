import java.util.Scanner;
public class StringTester{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a sentence: ");
String input = sc.nextLine();

System.out.println("\n=== STRING ANALYSIS ===");
System.out.println("\nOriginal: "+ input);


char lastChar = input.charAt(input.length()-1);
System.out.print("\nLast character: " + lastChar);

String replace = input.replace(" ", "_");
System.out.print("\nReplace Character: " + replace);

input = input.substring(0,5);
System.out.print("\nsubstring: " + input);



	}
}