import java.util. *;

class GradeAnalyzer {
	static Scanner input = new Scanner(System.in);

	public static void main(String cha[]) {
	int [] grades = new int[5];
	int sum = 0;
	
	int highest = 0;
	System.out.println("Enter grades: ");
	for (int i = 0; i < grades.length; ++i) {
	grades[i] = input.nextInt();
	sum += grades[i];
	
	if (grades[i] > highest)
	 highest = grades[i];
}

	double ave = sum / grades.length;
	System.out.print("Average Grade: " + ave);
	System.out.print("Highest Grade: " + highest);

		}
	}

