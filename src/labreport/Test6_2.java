package labreport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test6_2{

    public static void main(String[] args) {

        JFrame f=new JFrame();
        f.setLayout(null);//���ò���

        JButton b=new JButton("Click Me");
        b.addActionListener(new ActionListener(){//����������

            public void actionPerformed(ActionEvent e) {
                if(b.getText().equals("Click Me"))
                    b.setText("Click Me Again");
                else b.setText("Click Me");
            }

        });
        b.setBounds(60,60,200,30);
        f.add(b);
        f.setBounds(50,50,400,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
