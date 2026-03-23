public class FinallyBlock {
public static void main(String[] Cha){
try {
	int num = 10/2;
	System.out.println(num);
}
	catch(Exception num){
	 System.out.println("Error occurred");
}
	finally {
	 System.out.println("This block always executes.");
		}
	}
}