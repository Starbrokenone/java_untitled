package labreport;

import java.io.FileReader;
import java.io.IOException;

public class Test7_4 {
    public static void main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("F:\\1.txt");
        FileReader fw = new FileReader("F:\\1.txt");
        int cha1=0,cha2=0;
        boolean judge =true;
        while(true)
        {
            cha1=fr.read();
            cha2=fw.read();
            if(cha1==-1&&cha2==-1)
                break;
            if(cha1!=cha2)
            {
                judge = false;
                break;
            }
        }
        if(cha1!=-1||cha2!=-1)
            judge=false;

        if(judge==false)
            System.out.println("�ļ����ݲ���ͬ��");
        else
            System.out.println("�ļ�������ȫ��ͬ��");

        fr.close();
        fw.close();


    }



}
