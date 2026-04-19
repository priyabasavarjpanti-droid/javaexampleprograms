 package swings;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class CMYTabbedPaneDemo extends JFrame {

    private JTabbedPane tabbedPane;
    private JLabel label;

    public CMYTabbedPaneDemo() {

        setTitle("CMY Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label to display selected color
        label = new JLabel("Select a color tab", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Create Tabbed Pane
        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("CYAN", createPanel(Color.CYAN));
        tabbedPane.addTab("MAGENTA", createPanel(Color.MAGENTA));
        tabbedPane.addTab("YELLOW", createPanel(Color.YELLOW));

        // Change listener for tab selection
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
        new CMYTabbedPaneDemo();
    }
}