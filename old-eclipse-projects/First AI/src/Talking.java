
public class Talking {
	
	//Values used universally:
	private static int counter;
	
	//Possible values the user can enter:
	private static final String[][] responses = {
			{"hi","hello","greetings"},
			{"how are you", "hows it going", "how's it going"}
			};
	
	//Possible computer responses:
	private static final String[][] Cresponses = {
		{"Hello there!","Well, hello there!"},
		{"Meh. I'm alright.","Everything is good with me!","Meh. I don't care enough to figure that out."}
		};
	
	public static void decide(String s) {
		int numVars = 2;
		counter = 0;
		
		for(int i = 0;i < responses.length;i++) {
			counter += checker(Cresponses[i].length, s, responses[i], i);
		}
		
		if(counter == 2) {
			int decider = (int) (Math.random() * 3 + 1);
			
			switch(decider) {
			case(1):
				Bot.botSay("I didn't get that.");
				break;
			
			case(2):
				Bot.botSay("Please rephrase that. I'm sorry I'm not like Google Assistant.");
				break;
			
			case(3):
				Bot.botSay("What?");
				break;
			}
		}
		counter = 0;
	}
	/**This method checks if the text entered equals the given array.
	 * If it does, then it stops the for loop and returns the value.
	 * It it doesn't, then it adds to the counter so the computer can
	 * check to see if it is recognized or not.
	 */
	private static int checker(int numPossible, String s, String[] ss, int index) {
		int count = 0;
		int numFails = 0;
		for(int i = 0;i < numPossible;i++) {
			
			if(s.contains(ss[i])) {
				say(index, numPossible);
			}
			else {
				numFails += 1;
			}
		}
		
		if(numFails == numPossible) {
			count = 1;
		}
		else {
			count = 0;
		}
		
		return count;
	}
	
	private static void say(int index, int numPossible) {
		int decider = (int) Math.floor(Math.random() * numPossible);
		Bot.botSay(Cresponses[index][decider]);
	}
}