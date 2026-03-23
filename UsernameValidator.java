import java.util.Scanner;
	public class UsernameValidator {
		public static void main(String[] cha){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter name: ");
	String name = sc.nextLine();

	
	
	if(name.length() >= 8 && !name.contains(" ") && Character.isLetter(name.charAt(0))) {
	
	System.out.println("Username is VALID");
}
	else {
	System.out.print("Username is INVALID");
}
	}
}	