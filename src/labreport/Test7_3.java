package labreport;
/**
 * 编写程序，利用Java字符流文件输入/输出类，实现将源程序复制到另一个文件中
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
