 package swings;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private HashMap<String, String> capitalMap;

    public CountryCapitalList() {

        setTitle("Country - Capital Demo");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Countries list
        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Map countries to capitals
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "N/A (Continent)");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(countryList);

        // Selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String country = countryList.getSelectedValue();
                    String capital = capitalMap.get(country);

                    System.out.println("Selected Country: " + country);
                    System.out.println("Capital: " + capital);
                    System.out.println("--------------------------");
                }
            }
        });

        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}