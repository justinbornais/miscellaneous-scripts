import java.util.Arrays;
import java.util.Formatter;

public class VirusComplex {
	
	public static String insult(int a, int b, int c) {
		
		char[] a1 = {'a','b','c','t','8'};
		char[] a2 = {'1','2','3','6','9'};
		char[] b1 = {'g','y','&','5','4'};
		char[] b2 = {'0','(',')','{','}'};
		char[] c1 = {'^','*','$','@','7'};
		char[] c2 = {'[',']',';',':','.'};
		
		String text = "";
		
		for(int i = 1;i < a;i++) {
			
			for(int j = 1;j < b;j++) {
				
				for(int k = 1;k < c;k++) {
					
					text += Character.toString(a1[i % 5]);
					text += Character.toString(a1[j % 5]);
					text += Character.toString(a1[k % 5]);
					text += Character.toString(a2[i % 5]);
					text += Character.toString(a2[j % 5]);
					text += Character.toString(a2[k % 5]);
					text += Character.toString(b1[i % 5]);
					text += Character.toString(b1[j % 5]);
					text += Character.toString(b1[k % 5]);
					text += Character.toString(b2[i % 5]);
					text += Character.toString(b2[j % 5]);
					text += Character.toString(b2[k % 5]);
					text += Character.toString(c1[i % 5]);
					text += Character.toString(c1[j % 5]);
					text += Character.toString(c1[k % 5]);
					text += Character.toString(c2[i % 5]);
					text += Character.toString(c2[j % 5]);
					text += Character.toString(c2[k % 5]);
				}
			}
		}
		return text;
	}
	
	public static void write(Formatter f) {
		f.format("%s%s%s", insult(9,12,4), insult(20,30,47), insult(44,12,15));
	}
	
	public static void initiate(Formatter f) {
		
		for(int i = 0;;i++) {
			
			try {
				f = new Formatter("C:\\Users\\justi\\Documents\\Virus Time\\" + Integer.toString(i) + ".ddhtg");
				write(f);
				f.close();
				
				System.out.println("File " + Integer.toString(i) + ".ddhtg created.");
			}
			
			catch(Exception e) {
				System.out.println("Ye suck.");
			}
		}
	}
	
	public static void main(String[] args) {
		Formatter f = null;
		initiate(f);
	}

}