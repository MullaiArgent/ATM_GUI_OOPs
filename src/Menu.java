import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    JButton but_one = new JButton("1");
    JButton but_two = new JButton("2");
    JButton but_three = new JButton("3");
    JButton but_four = new JButton("4");
    JButton but_five = new JButton("5");
    JButton but_six = new JButton("6");
    JButton but_seven = new JButton("7");
    JButton but_eight = new JButton("8");
    JButton but_nine = new JButton("9");
    JButton but_zero = new JButton("0");
    JButton but_astrix = new JButton("*");
    JButton but_ash = new JButton("#");
    JButton but_cancel = new JButton("CANCEL");
    JButton but_clear = new JButton("CLEAR");
    JButton but_enter = new JButton("ENTER");
    JButton but_help = new JButton("HELP");
    JLabel label = new JLabel();

    Menu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(440,315);
        this.setResizable(false);
        this.setTitle("Enter your Valid PIN Number");
        
        this.add(label);
        label.setBounds(5,5,415,45);
        label.setText("Text");
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(but_one);
        but_one.setBounds(5,55,100,50);
        this.add(but_two);
        but_two.setBounds(110,55,100,50);
        this.add(but_three);
        but_three.setBounds(215,55,100,50);
        this.add(but_cancel);
        but_cancel.setBounds(320,55,100,50);
        this.add(but_four);
        but_four.setBounds(5,110,100,50);
        this.add(but_five);
        but_five.setBounds(110,110,100,50);
        this.add(but_six);
        but_six.setBounds(215,110,100,50);
        this.add(but_clear);
        but_clear.setBounds(320,110,100,50);
        this.add(but_seven);
        but_seven.setBounds(5,165,100,50);
        this.add(but_eight);
        but_eight.setBounds(110,165,100,50);
        this.add(but_nine);
        but_nine.setBounds(215,165,100,50);
        this.add(but_enter);
        but_enter.setBounds(320,165,100,50);
        this.add(but_astrix);
        but_astrix.setBounds(5,220,100,50);
        this.add(but_zero);
        but_zero.setBounds(110,220,100,50);
        this.add(but_ash);
        but_ash.setBounds(215,220,100,50);
        this.add(but_help);
        but_help.setBounds(320,220,100,50);

        this.setLayout(null);
        this.setVisible(true);
    }
}