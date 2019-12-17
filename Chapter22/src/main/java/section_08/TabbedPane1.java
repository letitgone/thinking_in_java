package section_08;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class TabbedPane1 extends JFrame {
    private String[] flavors =
            {"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge",
                    "Rum Raisin", "Praline Cream", "Mud Pie"};
    private JTabbedPane tabs = new JTabbedPane();
    private JTextField txt = new JTextField(20);

    public TabbedPane1() {
        int i = 0;
        for (String flavor : flavors)
            tabs.addTab(flavors[i], new JButton("Tabbed pane " + i++));
        tabs.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txt.setText("Tab selected: " + tabs.getSelectedIndex());
            }
        });
        add(BorderLayout.SOUTH, txt);
        add(tabs);
    }

    public static void main(String[] args) {
        run(new TabbedPane1(), 400, 250);
    }
}
