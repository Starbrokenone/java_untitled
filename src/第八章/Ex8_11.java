package �ڰ���;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 * �¼�������ʾ��
 */
public class Ex8_11 {
    public static void main(String[] args){
        JFrame frm = new JFrame("����¼�����");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);

        //������ť����
        JButton btn = new JButton("�뵥������ť");
        btn.setBounds(120,60,120,30);
        frm.add(btn);

        //������ť�ļ�������ע�ᣬ����Ϊ�¼������߶���
        ButtonHandler btnHandler = new ButtonHandler();
        btn.addActionListener(btnHandler);  //  ��Ȩ�����¼�

        frm.setBounds(400,200,400,200);
        frm.setVisible(true);
    }
}

//��д��ť���¼������ߣ���ʵ��ActionListner�ӿ�
class ButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("����һ�ΰ�ť");
    }
}
