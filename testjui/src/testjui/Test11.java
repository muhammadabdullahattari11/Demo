package testjui;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Test11 extends Frame {

	Test11(){
		
		Button b=new Button("Don;t Click me");
		b.setBounds(50, 50, 150, 30);
		b.setBackground(Color.blue);
		add(b);
		setSize(300,300);
		setLayout(null);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
			
			 // Provide empty implementations for other methods
            public void windowOpened(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {}
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}

		});
	}
	
	
	public static void main(String[] args) {
		
		
		Test11 t=new Test11();
	
	
	}

}
