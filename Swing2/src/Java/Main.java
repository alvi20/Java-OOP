package Java;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class Main extends JFrame {
    private Container c;
    private JLabel label1,label2;
    private JTextField textField1,textField2;
    private JButton jbutton1;
    private JTextArea ta1;
    private Font f,f2,f3;
    private JCheckBox JCB1,JCB2;
    private ButtonGroup Bg1;
    Main(){
        setBounds(200,50,400,300);
        setTitle("Log in");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();
    }
    public void initializeComponents(){
        c=this. getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        label1=new JLabel();
        label1.setText("Enter your name: ");
        label1.setBounds(110,100,150,50);
        c.add(label1);

        label2=new JLabel();
        label2.setText("Enter Password: ");
        label2.setBounds(110,110,150,100 );
        c.add(label2);


        textField1=new JTextField();
        textField1.setHorizontalAlignment(JTextField.LEFT);
        textField1.setBounds(210,120,100,20);
        c.add(textField1);

        textField2=new JTextField();
        textField2.setHorizontalAlignment(JTextField.LEFT);
        textField2.setBounds(210,150,100,20);
        c.add(textField2);


        f2=new Font("Times New Roman",Font.BOLD,12);
        jbutton1=new JButton("Submit");
        jbutton1.setBounds(250,200,100,20);
        jbutton1.setFont(f2);
        c.add(jbutton1);


        jbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String s1=textField1.getText();
              String s2=textField2.getText();
              if(s1.isEmpty())
              {
                  JOptionPane.showMessageDialog(null,"Please Enter something");
              }
              else if (s2.isEmpty())
              {
                  JOptionPane.showMessageDialog(null,"Enter pasword please!!");
              }

              else
              {
                    JOptionPane.showMessageDialog(null,"Successfully Created!");
              }
            }
        });

        

        f=new Font("Arial Black",Font.BOLD,18);

         ta1=new JTextArea("Fill Up Bellow");
         ta1.setBounds(130,50,170,30);
         ta1.setBackground(Color.ORANGE);
         ta1.setFont(f);
         c.add(ta1);

        f3=new Font("Arial",Font.BOLD,10);
         JCB1=new JCheckBox("Male");
         JCB1.setBounds(100,200,100,20);
         JCB1.setBackground(Color.ORANGE);
         JCB1.setFont(f3);
         c.add(JCB1);

        JCB2=new JCheckBox("Female");
        JCB2.setBounds(100,220,100,20);
        JCB2.setBackground(Color.ORANGE);
        JCB2.setFont(f3);
        c.add(JCB2);

      Bg1=new ButtonGroup();
        Bg1.add(JCB1);
        Bg1.add(JCB2);
  

    }

    public static void main(String[] args) {


        Main frame=new Main();
        frame.setVisible(true);



        //frame.setSize(400,300);
        //frame.setLocation(200,50);
	// write your code here
    }



}


