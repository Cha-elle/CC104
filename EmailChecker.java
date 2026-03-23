import java.util.Scanner;
	public class EmailChecker {
		public static void main(String[] cha) {
	
	Scanner sc = new Scanner(System.in);
	

	System.out.print("Enter email: ");
	String email = sc.nextLine();
	
	if(email.contains("@") && !email.startsWith("@") && email.endsWith(".com") || email.endsWith(".edu") && email.indexOf(".") > email.indexOf("@")){
	System.out.print("Email is VALID");
}
	else {
	System.out.print("Email is INVALID");
}

	}
}