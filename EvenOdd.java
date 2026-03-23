import java.util.*;
class EvenOdd {
static Scanner input = new Scanner(System.in);

public static void main(String[] cha){
int N = 0;
int ctn = 0;

	System.out.print("How many number?: ");
	ctn = input.nextInt();
	for (int i = 1; i <= ctn; ++i){
	

System.out.print("Enter an integer number No: ");
N = input.nextInt();

/* if (checkEven(N)) //Even
	System.out.println("You enter Even number");
else 
	System.out.println("You enter Odd number"); */

	System.out.println("You entered " + checkRel(N) + " number. ");
	}
}
  /*	static Boolean checkEven(int N) {
	if (N % 2 == 0)
	 return true;
	else 
	 return false;
	}  */
	static String checkRel(int x) {
	if (x % 2 == 0)
	 return "Even";
	else
	 return "Odd";
	}
}