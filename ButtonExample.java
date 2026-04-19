/*
 b. Develop a Swing program in Java to display a message “Srilanka is pressed” or
“India is pressed” depending upon the Jbutton either Srilanka or India is pressed by
implementing the event handling mechanism with addActionListener( ).
Event Handling
The event handling mechanism used by Swing is the same as that used by the AWT. This
approach is called the delegation event model, and it is described in Chapter 24. In many
cases, Swing uses the same events as does the AWT, and these events are packaged in
java.awt.event. Events specific to Swing are stored in javax.swing.event.
 */
package swings1;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;

	public class ButtonExample {

	    JLabel l1;

	    ButtonExample() {

	        JFrame f = new JFrame("Button Example");

	        // Label
	        l1 = new JLabel();
	        l1.setBounds(50, 50, 700, 100);
	        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 40));

	        // Button India
	        JButton b1 = new JButton("India");
	        b1.setBounds(100, 200, 120, 50);

	        b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                l1.setText("India is pressed");
	            }
	        });

	        // Button SriLanka
	        JButton b2 = new JButton("SriLanka");
	        b2.setBounds(250, 200, 120, 50);

	        b2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                l1.setText("SriLanka is pressed");
	            }
	        });

	        // Add components
	        f.add(b1);
	        f.add(b2);
	        f.add(l1);

	        // Frame settings
	        f.setSize(500, 400);
	        f.setLayout(null);
	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        new ButtonExample();
	    }
	}

 
