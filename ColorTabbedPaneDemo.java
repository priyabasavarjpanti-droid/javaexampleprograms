/*
 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.
 */


package swings;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorTabbedPaneDemo extends JFrame {

    private JTabbedPane tabbedPane;
    private JLabel label;

    public ColorTabbedPaneDemo() {

        setTitle("Tabbed Pane Color Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label to show selected color
        label = new JLabel("Select a tab", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Create Tabbed Pane
        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("RED", createPanel(Color.RED));
        tabbedPane.addTab("BLUE", createPanel(Color.BLUE));
        tabbedPane.addTab("GREEN", createPanel(Color.GREEN));

        // Listen for tab changes
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String colorName = tabbedPane.getTitleAt(index);
                label.setText("Selected Color: " + colorName);
                System.out.println("Selected Tab: " + colorName);
            }
        });

        add(tabbedPane, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Helper method to create colored panels
    private JPanel createPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        new ColorTabbedPaneDemo();
    }
}