package labreport;
/**
 * ��д��������Java�ַ����ļ�����/����࣬ʵ�ֽ�Դ�����Ƶ���һ���ļ���
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test7_3 {
    public static void main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("F:\\1.txt");
        FileWriter fw = new FileWriter("F:\\2.txt");
        int cha;
        while((cha=fr.read())!=-1)
        {
            System.out .print((char)cha);
            fw.write(cha);
        }
        fr.close();
        fw.close();
    }

}
