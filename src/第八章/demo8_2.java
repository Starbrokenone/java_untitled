package �ڰ���;
import javax.swing.*;
import java.awt.*;

public class demo8_2 {
    public static void main(String args[]) {
        JFrame frm = new JFrame("ʹ��JPanel");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        frm.add(topPanel,BorderLayout.NORTH);

        JLabel show = new JLabel();

        show.setText("������������");

        JTextField input = new JTextField();
        input.setEditable(true);
        input.setHorizontalAlignment(SwingConstants.LEFT);
        input.setColumns(20);

        JButton myBtn = new JButton("�ύ");

        //�����ʾ��ǩ������򣬺Ͱ�ť
        topPanel.add(show);
        topPanel.add(input);
        topPanel.add(myBtn);

        //��������°벿��
        JPanel bottomPanel = new JPanel();
        frm.add(bottomPanel,BorderLayout.CENTER);

        //������ʾ��ǩ
        JLabel againshow = new JLabel();
        againshow.setText("��ʾ�������е�����");

        //���������
        JTextArea output = new JTextArea();
        output.setRows(5);
        output.setColumns(32);
        output.setEditable(false);

        //�����ʾ��ǩ�������
        bottomPanel.add(againshow);
        bottomPanel.add(output);

        //���ô���λ�úʹ�С����ʾ
        frm.setBounds(400,200,400,200);
        frm.setVisible(true);
    }
}
