package applications;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 * This class is an attempt to adding a button to a JFrame.
 * @author justi
 * 
 */
public class App1 extends JFrame {
	
	public App1(String caption) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Java Image Viewer");
		
		/*
		ImageIcon ii = new ImageIcon("C:\\Users\\justi\\Pictures\\FRC 2019 Field Layout.png");
		JLabel lable = new JLabel(ii);
		JScrollPane jsp = new JScrollPane(lable);
		//this.getContentPane().add(jsp);
		*/
		
		JButton button = new JButton();
	    button.setSize(new Dimension(100, 50));
	    button.setLocation(500, 350);
	    button.setText("Press me!");
	    
	    //this.add(lable);
	    this.getContentPane().add(button);
	    System.out.println("Button added.");
		this.getContentPane().add(new JLabel(new ImageIcon("FRC_2019_Field_Layout.jpeg")));
		System.out.println("Image added.");
	}
	
	public static void main(String[] args) {
		new App1("Hello World");
	}
}