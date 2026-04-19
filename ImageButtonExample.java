package swings3;

import java.awt.Font;
import javax.swing.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame f = new JFrame("Image Button Example");

        label = new JLabel();
        label.setBounds(50, 40, 400, 40);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Correct resource loading
        ImageIcon clockIcon = null;
        ImageIcon hourGlassIcon = null;

        try {
            clockIcon = new ImageIcon(getClass().getResource("/images/digital_clock.png"));
            hourGlassIcon = new ImageIcon(getClass().getResource("/images/hourglass.png"));
        } catch (Exception e) {
            System.out.println("Error loading images: " + e);
        }

        JButton b1 = new JButton("Clock", clockIcon);
        b1.setBounds(80, 100, 150, 150);

        b1.addActionListener(e -> label.setText("Digital Clock is pressed"));

        JButton b2 = new JButton("Hourglass", hourGlassIcon);
        b2.setBounds(260, 100, 150, 150);

        b2.addActionListener(e -> label.setText("Hour Glass is pressed"));

        f.add(b1);
        f.add(b2);
        f.add(label);

        f.setSize(500, 350);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}