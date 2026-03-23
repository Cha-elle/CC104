import java.util.*;
	
	public class SalesReport{
     public static void main(String[] cha){
	int[][] sales = {
	{1200,1500,1700},
	{1000,1200,1300},
	{900,1200,1600}
};

	for (int i = 0; i < sales.length; i++){
	int total = 0;
	for(int y = 0; y < sales[i].length; y++) {
	  total += sales[i][y];
}
     System.out.println("Total sales for Store" + (i+1) + ":" + total);
}
}
}