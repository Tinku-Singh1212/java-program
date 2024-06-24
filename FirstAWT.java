package javaGUI;
import java.awt.Frame;
import javax.swing.JFrame;

class AwtGUI extends Frame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AwtGUI(){
    	this.setSize(600, 400);
    	this.setLocation(200, 200);
    	this.setVisible(true);
		
	}
	
}
class SwingGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SwingGUI(){
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
public class FirstAWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AwtGUI();
		new SwingGUI();

	}

}
