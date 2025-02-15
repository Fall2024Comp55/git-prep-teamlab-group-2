import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

//Group 2
//Nice work!

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static final FILE_NAME = "robot.png"; 
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(FILE_NAME, 200, 100);
		add(robot);
		GLabel label = new GLabel("Adan collazo", 200, 400);
		add(label);
	}

	public static void main(String[] args) {
		new SimplePicture().start();
	}
}