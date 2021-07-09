import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Acc extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("NEXT");
    JTextField  field = new JTextField();
    HashMap<String,Integer> data = new HashMap<>();
    Acc(){
        field.setBounds(175,150,80,20);
        button.setBounds(175,180,80,20);
        data.put("987654",4321);
        data.put("876543",3210);
        frame.setTitle("Enter the Account Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(440,315);
        frame.setResizable(false);
        frame.add(button);
        button.addActionListener(this);
        frame.add(field);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            if(data.containsKey(field.getText())){
                frame.dispose();
                Menu menu = new Menu();
}

        }}}