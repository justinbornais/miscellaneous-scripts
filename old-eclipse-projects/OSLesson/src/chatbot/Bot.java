package chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	
	private static JTextField txtEnter = new JTextField();
	private static JTextArea txtChat = new JTextArea();
	
	public Bot() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Java Chatbox");
		
		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590,30);
		
		txtEnter.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String text = txtEnter.getText();
				String uText = text.toLowerCase();
				txtChat.append("You: " + text + "\n");
				
				Talking.decide(uText);
				txtEnter.setText("");
			}
			
		});
		
		txtChat.setLocation(15,5);
		txtChat.setSize(560,510);
		
		this.add(txtEnter);
		this.add(txtChat);
	}
	
	public static void botSay(String s) {
		txtChat.append("Computer: " + s + "\n");
	}

	public static void main(String[] args) {
		new Bot();

	}

}
