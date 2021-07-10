import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


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

    JButton but_s_one = new JButton();
    JButton but_s_two = new JButton();
    JButton but_s_three = new JButton();
    //JButton but_s_four = new JButton();

    JLabel pin_label = new JLabel();
    JLabel amt_label = new JLabel();
    JLabel help_label = new JLabel();

    public Integer p = 0;
    Integer BalanceInt = 0;
    public Integer decider = 0;

    HashMap<Integer,String> data = new HashMap<>();
    JLayeredPane pane = new JLayeredPane();


    Menu(){
        data.put(4321,"987654");
        data.put(3210,"876543");

        this.add(pane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(440,515);
        this.setResizable(false);
        this.setTitle("Enter your Valid PIN Number");

        pane.add(pin_label,Integer.valueOf(1));
        pin_label.setBounds(85,5,255,245);
        pin_label.setVerticalAlignment(JLabel.CENTER);
        pin_label.setHorizontalAlignment(JLabel.CENTER);
        pin_label.setOpaque(true);
        this.add(pin_label);


        but_s_one.setBounds(5,10,50,100);
        but_s_two.setBounds(5,120,50,100);
        but_s_three.setBounds(370,10,50,100);
        //but_s_four.setBounds(370,120,50,100);

        this.add(but_s_one);
        this.add(but_s_two);
        this.add(but_s_three);
        //this.add(but_s_four);

        but_s_one.setBackground(Color.darkGray);
        but_s_two.setBackground(Color.darkGray);
        but_s_three.setBackground(Color.darkGray);
        //but_s_four.setBackground(Color.darkGray);

        this.add(but_one);
        but_one.setBounds(5,255,100,50);
        this.add(but_two);
        but_two.setBounds(110,255,100,50);
        this.add(but_three);
        but_three.setBounds(215,255,100,50);
        this.add(but_cancel);
        but_cancel.setBounds(320,255,100,50);
        this.add(but_four);
        but_four.setBounds(5,310,100,50);
        this.add(but_five);
        but_five.setBounds(110,310,100,50);
        this.add(but_six);
        but_six.setBounds(215,310,100,50);
        this.add(but_clear);
        but_clear.setBounds(320,310,100,50);
        this.add(but_seven);
        but_seven.setBounds(5,365,100,50);
        this.add(but_eight);
        but_eight.setBounds(110,365,100,50);
        this.add(but_nine);
        but_nine.setBounds(215,365,100,50);
        this.add(but_enter);
        but_enter.setBounds(320,365,100,50);
        this.add(but_astrix);
        but_astrix.setBounds(5,420,100,50);
        this.add(but_zero);
        but_zero.setBounds(110,420,100,50);
        this.add(but_ash);
        but_ash.setBounds(215,420,100,50);
        this.add(but_help);
        but_help.setBounds(320,420,100,50);

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
        but_enter.addActionListener(this);
        but_astrix.addActionListener(this);
        but_zero.addActionListener(this);
        but_ash.addActionListener(this);
        but_help.addActionListener(this);

        but_s_one.addActionListener(this);
        but_s_two.addActionListener(this);
        but_s_three.addActionListener(this);

        but_one.setBackground(Color.GRAY);
        but_one.setBackground(Color.GRAY);
        but_two.setBackground(Color.GRAY);
        but_three.setBackground(Color.GRAY);
        but_cancel.setBackground(Color.RED);
        but_four.setBackground(Color.GRAY);
        but_five.setBackground(Color.GRAY);
        but_six.setBackground(Color.GRAY);
        but_clear.setBackground(Color.lightGray);
        but_seven.setBackground(Color.GRAY);
        but_eight.setBackground(Color.GRAY);
        but_nine.setBackground(Color.GRAY);
        but_enter.setBackground(Color.GREEN);
        but_astrix.setBackground(Color.GRAY);
        but_zero.setBackground(Color.GRAY);
        but_ash.setBackground(Color.GRAY);
        but_help.setBackground(Color.lightGray);



        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(BalanceInt>100000000){
            JOptionPane.showMessageDialog(null,"Enter Maximum RS 20,000 for the transaction","Maximum Limit Exceeded",JOptionPane.WARNING_MESSAGE);
        }
        else if(e.getSource()==but_one){
            if(decider==0) {
                p = (p * 10) + 1;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 1;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else if(e.getSource()==but_two){
            if(decider==0) {
                p = (p * 10) + 2;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 2;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else if(e.getSource()==but_three){
            if(decider==0) {
                p = (p * 10) + 3;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 1;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else  if(e.getSource()==but_cancel){
            this.dispose();

        }else if(e.getSource()==but_four){
            if(decider==0) {
                p = (p * 10) + 4;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 4;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else  if(e.getSource()==but_five){
            if(decider==0) {
                p = (p * 10) + 5;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 5;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else if(e.getSource()==but_six){
            if(decider==0) {
                p = (p * 10) + 6;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 6;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else  if(e.getSource()==but_clear){
            if (decider==0){
                p = p/10;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt / 10);
                amt_label.setText("Rs"+BalanceInt);
            }

        }else if(e.getSource()==but_seven){
            if(decider==0) {
                p = (p * 10) + 7;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 7;
                amt_label.setText("Rs"+BalanceInt);
            }
        } else if(e.getSource()==but_eight){
            if(decider==0) {
                p = (p * 10) + 8;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 8;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else if(e.getSource()==but_nine){
            if(decider==0) {
                p = (p * 10) + 9;
                x_printer();
            }else if(decider==1){
                BalanceInt = (BalanceInt * 10) + 9;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else if(e.getSource()==but_enter){
                action_page();

        }else if(e.getSource()==but_zero){
            if(decider==0) {
                p = (p * 10);
                pin_label.setText("" + p);
            }else if(decider==1){
                BalanceInt = BalanceInt * 10;
                amt_label.setText("Rs"+BalanceInt);
            }
        }else if(e.getSource()==but_help){
            pane.add(help_label,Integer.valueOf(2));
            help_label.setBounds(85,5,255,245);
            help_label.setBackground(Color.green);
            help_label.setOpaque(true);
            this.add(help_label);
            help_label.setVerticalAlignment(JLabel.CENTER);
            help_label.setHorizontalAlignment(JLabel.CENTER);
            String help = "<html>This is an Simple Java Based Study Purpose App," +
                    "this Works with 987654,4321 as Ac. No. and PIN No. respectively " +
                    "and also with 876543,3210 as Ac. No. and PIN No. respectively." +
                    " Press Any Number Key to continue</html>";
            help_label.setText(help);

        }else if(e.getSource()==but_s_one){

        }else if(e.getSource()==but_s_two){
            decider=1;

        }else if(e.getSource()==but_s_three){
            decider=1;

        }
    }
    public void x_printer(){
        String x = "Enter the Pin Number :";
        int temp = p;
        if(p==0){
            pin_label.setText("Enter the Pin Number :");
        }else{
        while(temp>0){
            temp/=10;
            x += "X";
            pin_label.setText(x);
    }}}

    public void action_page(){
        if(data.containsKey(p)){
            decider=2;
            JPanel action_panel = new JPanel();
            pane.add(action_panel,Integer.valueOf(0));
            action_panel.setBounds(85,10,255,245);
            action_panel.setBackground(Color.blue);
            action_panel.setOpaque(true);
            action_panel.setLayout(null);
            this.add(action_panel);

            JLabel view_bal = new JLabel();
            view_bal.setText("View Balance");
            view_bal.setBackground(Color.black);
            view_bal.setBounds(30,10,100,100);
            action_panel.add(view_bal);

            JLabel amt_deposit = new JLabel();
            amt_deposit.setText("Money Deposit");
            amt_deposit.setBackground(Color.BLACK);
            amt_deposit.setBounds(30,110,100,100);
            action_panel.add(amt_deposit);

            JLabel amt_withdraw = new JLabel();
            amt_withdraw.setText("Money Withdraw");
            amt_withdraw.setBackground(Color.BLACK);
            amt_withdraw.setBounds(140,10,100,100);
            action_panel.add(amt_withdraw);

            amt_label.setBounds(140,140,200,40);
            action_panel.add(amt_label);

        }else{
            JOptionPane.showMessageDialog(null,"Invalid Entry","Invalid Entry",JOptionPane.ERROR_MESSAGE);
            p=0; pin_label.setText("Enter the Pin Number :");
        }
}
    }