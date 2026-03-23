public class MultipleCatchBlocks {
	public static void main(String[] Cha) {
	try {
		int arr[] = new int[3];
		arr[5] = 10;
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index error.");
}
	catch(Exception e) {
		System.out.println("General exception.");
		}
	}
}