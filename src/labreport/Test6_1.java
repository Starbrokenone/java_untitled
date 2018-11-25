package labreport;
import java.applet.Applet;
import javax.swing.*;
import java.awt.*;

import java.util.Date;

/**
 * 编写一个程序响应鼠标事件，当鼠标事件发生时，在状态条显示相应的时间信息。
 * 提示：使用showStatus(字符串)方法。
 */
public class Test6_1 {
    public static void main(String args[]){
        JFrame frm = new JFrame("显示时间信息");

        frm.setLayout(null);
        JLabel label=new JLabel();

        label.setBounds(130,60,60,30);
        frm.add(label);
        frm.setBounds(400,200,400,200);
        frm.setVisible(true);
    }

}
