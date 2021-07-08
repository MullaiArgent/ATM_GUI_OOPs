import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame implements ActionListener {
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
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    public long p = 0;

    Menu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(440,315);
        this.setResizable(false);
        this.setTitle("Enter your Valid PIN Number");

        this.add(label1);
        this.add(label2);
        label1.setBounds(205,5,212,45);
        label2.setBounds(5,5,212,45);
        label2.setText("Enter the Pin Number");
        label1.setBackground(Color.red);
        label2.setBackground(Color.yellow);
        label1.setOpaque(true);
        label2.setOpaque(true);
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

        but_one.addActionListener(this);
        but_two.addActionListener(this);
        but_three.addActionListener(this);
        but_cancel.addActionListener(this);
        but_four.addActionListener(this);
        but_five.addActionListener(this);
        but_six.addActionListener(this);
        but_clear.addActionListener(this);
        but_seven.addActionListener(this);
        but_eight.addActionListener(this);
        but_nine.addActionListener(this);
        but_astrix.addActionListener(this);
        but_zero.addActionListener(this);
        but_ash.addActionListener(this);
        but_help.addActionListener(this);

        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==but_one){
            p  = (p*10)+1;
            label1.setText(""+p);
        }else if(e.getSource()==but_two){
            p  = (p*10)+2;
            label1.setText(""+p);
        }else if(e.getSource()==but_three){
            p  = (p*10)+3;
            label1.setText(""+p);
        }else  if(e.getSource()==but_cancel){

        }else if(e.getSource()==but_four){
            p  = (p*10)+4;
            label1.setText(""+p);
        }else  if(e.getSource()==but_five){
            p  = (p*10)+5;
            label1.setText(""+p);
        }else if(e.getSource()==but_six){
            p  = (p*10)+6;
            label1.setText(""+p);
        }else  if(e.getSource()==but_clear){
            p = p/10;
            label1.setText(""+p);
        }else if(e.getSource()==but_seven){
            p  = (p*10)+7;
            label1.setText(""+p);
        } else if(e.getSource()==but_eight){
            p  = (p*10)+8;
            label1.setText(""+p);
        }else if(e.getSource()==but_nine){
            p  = (p*10)+9;
            label1.setText(""+p);
        }else if(e.getSource()==but_astrix){
            label1.invalidate();
        }else if(e.getSource()==but_enter){

        }else if(e.getSource()==but_zero){
            p  = (p*10);
            label1.setText(""+p);
        }else if(e.getSource()==but_ash){

        }else if(e.getSource()==but_help){

        }
    }
}