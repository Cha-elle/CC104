import java.util.Scanner;
public class InputValidation {
	public static void main(String[] Cha) {
	Scanner sc = new Scanner(System.in);
	try{
	     System.out.print("Enter a number: ");
	     int num = sc.nextInt();
		System.out.println("You entered: " + num);
}
	catch(Exception e) {
		System.out.println("Invalid input. Please enter a number.");
		}
	}
}