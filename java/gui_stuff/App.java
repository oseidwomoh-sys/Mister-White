import javax.swing.JFrame;
import javax.swing.JButton;
// import java.awt.BorderLayout;
// import java.awt.GridLayout;
import javax.swing.JPanel;

class App {

  public static void main(String[] args) {

    JFrame frame = new JFrame("cmp269");

    /// components are organized in a container, using a layout manager
    /// by default, the content pane of a JFrame uses BorderLayout
    ///
    ///
    /// To change the layout manager, we can use the setLayout() method of the container
    ///
    // GridLayout gridLayout = new GridLayout(2, 3); // 2 rows, 3 columns
    // frame.setLayout(gridLayout);
    JPanel panel = new JPanel();
    
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");

    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(new JButton("Button 6"));
    panel.add(new JButton("Button 7"));
    panel.add(new JButton("Button 8"));
    panel.add(new JButton("Button 9"));
  

    frame.add(panel);

    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
}

