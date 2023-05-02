import java.util.Formatter;

public class Virus2 {

	public static void main(String[] args) {
		
		for(int i = 0;;i++) {
			try {
				Formatter f = new Formatter("C:\\Users\\justi\\Documents\\Virus Time\\" + Integer.toString(i) + ".txt");
				f.format("%s", "Fudgikuh you " + Integer.toString(i) + ".\r\n");
				f.close();
				System.out.println("File created: " + i + ".txt");
			}
			catch(Exception e) {
				System.out.println("Ye suck.");
			}
		}
	}
}