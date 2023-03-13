import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class AppOne {
    private JPanel panel1;
    private JTextField resultField;
    private JButton countButton;

    private int number = 0;
public AppOne() {
    countButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ++number;
            resultField.setText(String.valueOf(number));
        }
    });
}

private static JMenuBar createmenubar() {
    JMenuBar menubar = new JMenuBar();

    JMenu filemenu = new JMenu("File");
    JMenu editmenu = new JMenu("Edit");
    JMenu helpmenu = new JMenu("Help");

    JMenuItem newmenuitem = new JMenuItem("New");
    JMenuItem openmenuitem = new JMenuItem("Open");
    JMenuItem exitmenuitem = new JMenuItem("Exit");

    JMenuItem undomenuitem = new JMenuItem("Undo Count");
    JMenuItem updatemenuitem = new JMenuItem("Check for Update...");

    JMenuItem aboutmenuitem = new JMenuItem("About");

    filemenu.add(newmenuitem);
    filemenu.add(openmenuitem);
    filemenu.add(exitmenuitem);

    editmenu.add(undomenuitem);
    editmenu.add(updatemenuitem);

    helpmenu.add(aboutmenuitem);

    menubar.add(filemenu);
    menubar.add(editmenu);
    menubar.add(helpmenu);

    filemenu.setMnemonic(KeyEvent.VK_F);

    exitmenuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
    exitmenuitem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    return menubar;
}

    public static void main(String[] args) {

    JFrame  frame = new JFrame("AppOne");
    frame.setContentPane(new AppOne().panel1 );
    frame.setLocationRelativeTo(null);

    frame.setJMenuBar(createmenubar());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
}
