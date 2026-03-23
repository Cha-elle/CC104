import java.util.*;
class OddEven {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] Cha){
    int N=0;
    int ctn=0, ectr=0, octr=0;
    int arrN[];

     System.out.print("How many numbers?: ");
    ctn = input.nextInt();
    arrN = new int[ctn];
    int i=1;
    
    do{

      System.out.print("Enter an integer number No: ");
    N = input.nextInt();
    arrN[i-1] = N;
   /* if (checkEven(N)) //Even
        System.out.println("You enter Even number");
    else 
        System.out.println("You enter Odd number");    */
   
    System.out.println("You entered " + checkRel(N) + " number. ");
    ++i;
       }
    while (i<=ctn);
     for (int x=0; x<arrN.length; ++x) {
    if (arrN[x]%2==0) ++ectr; else ++octr;
    
 } 
         System.out.println("Total No of EVen: " + ectr);
         System.out.println("Total No of EVen: " + ectr);
    }

  /*  static boolean checkEven(int N) {
        if (N%2==0)
           return true;
        else 
           return false;
     } */ 
    static String checkRel(int x) {
    if (x % 2 == 0)
        return "Even";
    else 
        return "Odd";
    }
}

