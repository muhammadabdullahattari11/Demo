package testjui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// border layout
public class AttractiveUI {

	public static void main(String[] args) {
	   
	        JFrame frame = new JFrame("Attractive UI");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 400);

	        // Create panels with different background colors
	        JPanel northPanel = new JPanel();
	        northPanel.setBackground(Color.BLUE);
	        JPanel centerPanel = new JPanel();
	        centerPanel.setBackground(Color.LIGHT_GRAY);
	        JPanel southPanel = new JPanel();
	        southPanel.setBackground(Color.GREEN);

	        // Add components to panels
	        northPanel.add(new JLabel("Header", JLabel.CENTER));
	        centerPanel.add(new JButton("Click Me"));
	        southPanel.add(new JLabel("Footer", JLabel.CENTER));

	        // Set layout and add panels to the frame
	        frame.setLayout(new BorderLayout());
	        frame.add(northPanel, BorderLayout.NORTH);
	        frame.add(centerPanel, BorderLayout.CENTER);
	        frame.add(southPanel, BorderLayout.SOUTH);

	        frame.setVisible(true);
	}

}
