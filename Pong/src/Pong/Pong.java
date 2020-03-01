package Pong;
import javax.swing.JFrame;

public class Pong extends JFrame {
	private final String tittle = "Pongy";
	private final int width = 800;
	private final int height = 600; 
	public Pong() {
    	setTitle(tittle);
    	setSize(width, height);
    	setResizable(false);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	 
	public static void main(String[] args) {
		
		new Pong();
		 

	}
 
}
