package labreport;
import java.applet.Applet;
import javax.swing.*;
import java.awt.*;

import java.util.Date;

/**
 * ��дһ��������Ӧ����¼���������¼�����ʱ����״̬����ʾ��Ӧ��ʱ����Ϣ��
 * ��ʾ��ʹ��showStatus(�ַ���)������
 */
public class Test6_1 {
    public static void main(String args[]){
        JFrame frm = new JFrame("��ʾʱ����Ϣ");

        frm.setLayout(null);
        JLabel label=new JLabel();

        label.setBounds(130,60,60,30);
        frm.add(label);
        frm.setBounds(400,200,400,200);
        frm.setVisible(true);
    }

}
