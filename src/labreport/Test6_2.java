package labreport;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test6_2{

    public static void main(String[] args) {

        JFrame f=new JFrame();
        FlowLayout flow =new FlowLayout();
        f.setLayout(flow);//设置布局

        JButton b=new JButton("Click Me");
        b.addActionListener(new ActionListener(){//利用匿名类

            public void actionPerformed(ActionEvent e) {
                if(b.getText().equals("Click Me"))
                    b.setText("Click Me Again");
                else b.setText("Click Me");
            }

        });

        f.add(b);
        f.setBounds(20,20,400,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
