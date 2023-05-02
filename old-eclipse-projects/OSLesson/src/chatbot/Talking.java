package chatbot;

public class Talking {
	
	private static int counter;
	
	private static final String[][] responses = {
			{"hi","hello","greetings"},
			{"how are you","hows it going","how's it going"}
			};
	
	private static final String[][] Cresponses = {
			{"Hello!","Hello there!","Why, hello there!"},
			{"I'm good.","Meh.","It's all good!"}
			};
	private static final String[] unknown = {"Hmm, I didn't get that.", "Say again?", "I don't understand."};
	public static void decide(String s) {
		counter = 0;
		
		for(int i = 0;i < responses.length;i++) {
			counter += checker(responses[i].length, s, responses[i], i);
		}
		
		if(counter == responses.length) {
			int decider = (int) Math.floor(Math.random() * unknown.length);
			Bot.botSay(unknown[decider]);
			
		}
	}
	
	private static int checker(int numPossible, String s, String[] ss, int index) {
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
			return 1;
		}
		else {
			return 0;
		}
	}
	
	private static void say(int index, int numPossible) {
		int decider = (int) Math.floor(Math.random() * numPossible);
		Bot.botSay(Cresponses[index][decider]);
	}
}
