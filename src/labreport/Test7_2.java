package labreport;

import java.io.File;

/**
 * ����Java�ļ���File�ķ�������ȡ�����ļ����ļ��������ȡ���С������
 */
public class Test7_2 {
    public static void main(String args[]){
        File file = new File("C:\\Users\\������\\Desktop");
        System.out.println("�ļ�����"+file.getName());
        System.out.println("�ļ����ȣ�"+file.length()+"�ֽ�");

    }
}
