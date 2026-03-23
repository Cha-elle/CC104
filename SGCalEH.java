import java.util.Scanner;

	public class SGCalEH {
		public static void main(String[] cha) {
	Scanner sc = new Scanner (System.in);
	
	try {
	System.out.print("Enter student name: ");
	String name = sc.nextLine();

	System.out.print("Enter grade 1: ");
	double x = sc.nextDouble();
	
	System.out.print("Enter grade 2: ");
	double y = sc.nextDouble();

	System.out.print("Enter grade 3: ");
	double z = sc.nextDouble();

	if (x < 0 || y < 0 | z < 0){
	System.out.print("Error: Grade cannot be negative.");
	} else if (x > 100 || y > 100 || z > 100) {
		System.out.println("Invalid input: Grade must not exceed 100.");

	} else {
		double ave = (x + y + z) /3;
		System.out.println("Student Name: " + name);
		System.out.println("average: " + ave);
	}
	
	} catch (Exception ave) { 
	System.out.println("Invalid grade input.");
		}
	}
}



