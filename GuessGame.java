import java.util. *;

class GuessGame {
	static Scanner sc = new Scanner(System.in);
	static Random N = new Random();
	static int Secret = N.nextInt(100)+1;
	static int Guess = 0;
	static String ans = "";
	public static void main(String[] cha) {

      do{
		Secret = N.nextInt(101);
		Guess = 0;
	do {
		System.out.print("Enter your Guess (1-100): "); 
		Guess = sc.nextInt();

	if(Guess > Secret)
		System.out.println("Too High!");

	else if
	(Guess < Secret)
		System.out.println("Too Low!");

	else 
		System.out.println("Congratulations!");

	}while(Guess != Secret);
	  System.out.print("Play again Y/N)? ");
	  ans = sc.next();
		} while (!ans.equalsIgnoreCase("N"));
		  System.out.println("Good Bye!");

	}
}