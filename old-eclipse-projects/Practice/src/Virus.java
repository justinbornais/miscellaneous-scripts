import java.util.Formatter;

public class Virus {

	public static void main(String[] args) {
		
		final int numIncrements = 1; // Set high for low files but high storage; set low for high files but low storage.
		for(int i = 0;;i++) {
			try {
				Formatter f = new Formatter("C:\\Users\\justi\\Documents\\Virus Time\\" + Integer.toString(i) + ".txt");
				
				for(int j = 0;j < numIncrements;j++) {
					f.format("%s", "You suck " + Integer.toString(j) + " times.\r\n");
				}
				
				f.close();
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.println("Ye suck.");
			}
		}
	}
}