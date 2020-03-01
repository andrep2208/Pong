 package Pong;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Graphics2D;



import javax.swing.JPanel;
import javax.swing.Timer;
 
   
   public class PongPanel extends JPanel implements ActionListener, KeyListener {
	  private final static int TIMER_DELAY = 5;
	  
	  public void paintComponent(Graphics g) {
		     super.paintComponent(g);
		     g.setColor(Color.WHITE);
		     g.fillRect(20, 20, 100, 100);
		 }
       
      public PongPanel() {
          setBackground(Color.BLACK);
          Timer timer = new Timer(TIMER_DELAY, this);
          timer.start();
      }
      
      private void update() {
    	  
      }
      

      
  
      @Override
      public void keyPressed(KeyEvent event) {
      }
  
      @Override
      public void keyReleased(KeyEvent event) {
      }
  
      @Override
      public void keyTyped(KeyEvent event) {
      }
  
      @Override
      public void actionPerformed(ActionEvent event) {
      }
  
 }