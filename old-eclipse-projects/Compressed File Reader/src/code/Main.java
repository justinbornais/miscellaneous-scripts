package code;

import java.io.File;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\justi\\eclipse-workspace\\Compressed File Reader\\src\\files\\test.dd23");
			Scanner s = new Scanner(file);
		}
		catch(Exception e) {
			System.out.println("Sorry, but java sucks.");
		}
	}
}
