import java.util.*;
import java.math.*;
import algebra.*;
import filters.*;

public class Application {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text;
		
		System.out.println("Enter any series of calculations.");
		text = input.next();
		
		filters.Operations.sort(text);
	}
}