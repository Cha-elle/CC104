import java.io.*;
public class ThrowsKeyword {
	static void readFile() throws IOException {
	FileReader file = new FileReader("test.txt");
}
	public static void main(String[] Cha){
	try {
	readFile();
}
	catch(IOException e) {
		System.out.println("file not found.");
		}
	}
}