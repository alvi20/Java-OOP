package Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame f=new JFrame("Frame");
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setSize(600,400);

          JPanel p=new JPanel();
          p.setLayout(null);

          JButton btn=new JButton("B1");
          JTextField tf=new JTextField();
          tf.setText("Hello World");

          tf.setBounds(10,20,100,50);
          btn.setBounds(230,300,90,50);
          p.add(btn);
          p.add(tf);
         btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 tf.setText("Changed");
             }

         });

          f.setContentPane(p);
          f.setVisible(true);

        //JOptionPane.showMessageDialog(null,"Wrong Password","Warning",JOptionPane.QUESTION_MESSAGE);


	// write your code here
    }
}
