import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JFrame{


    JTabbedPane tab = new JTabbedPane();
    JButton NavigateToMyFrame = new JButton("Prisoners");
    JButton NavigateToNewFrame = new JButton("Docs");
    JButton NavigateToXFrame = new JButton("Relation");


    public HomePanel() {

        this.setSize(400, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(tab);
        this.setVisible(true);
        NavigateToMyFrame.addActionListener(new NavigateToMyFrame());
        NavigateToNewFrame.addActionListener(new NavigateToNewFrame());
        //NavigateToXFrame.addActionListener(new NavigateToXFrame());

        this.setLayout(new GridLayout(5, 5));
        this.add(NavigateToMyFrame);
        this.add(NavigateToNewFrame);
        this.add(NavigateToXFrame);

    }


    class NavigateToMyFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Close the current tab and open the new one
            dispose();
            Prisoners frame = new Prisoners();
        }
    }

    class NavigateToNewFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Close the current tab and open the new one
            dispose();
            Docs frame = new Docs();
        }
    }



}
