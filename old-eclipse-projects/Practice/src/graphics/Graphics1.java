package graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Graphics1 extends Canvas {
	public static int size = 1000;
	
	public void paint(Graphics g) {
		Color newColor = new Color(247, 231, 210);
		g.setColor(newColor);
		g.fillRect(0, 0, size, size);
		int x = 0;
		int y = 0;
		int width;
		int height;
		
		for(int i = 0;i <= size;i+= 5) {
			width = i;
			height = i;
			paintOval(g, x, y, width, height);
			paintBox(g, x, y, width, height);
		}
	}
	
	public void save(String imageName, Canvas canvas, String extension) {
		
		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		int type = image.getType();
		System.out.println(type);
		Graphics2D graphics = (Graphics2D) image.getGraphics();
		canvas.paint(graphics);
		
		try {
			System.out.println("Exporting image.");
			ImageIO.write(image, extension, new File(imageName));
			System.out.println("Exported image.");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error.");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame("My Drawing");
		Canvas canvas = new Graphics1();
		Graphics1 work = new Graphics1();
		String extension = "PDF";
		
		canvas.setSize(size, size);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				work.save("C:\\Users\\justi\\Pictures\\Vodka." + extension, canvas, extension);
				System.exit(0);
			}
		});
	}
	
	public void paintOval(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.RED);
		g.drawOval(x, y, width, height);
	}
	
	public void paintBox(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.ORANGE);
		g.drawRect(x, y, width, height);
	}
}