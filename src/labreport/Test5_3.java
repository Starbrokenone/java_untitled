package labreport;

import java.util.Calendar;

/**
 * �����򵥵ĳ���ThreeThread.java���ó��򽫴��������̣߳�
 * ÿ���߳�Ӧ����ʾ�������е�ʱ�䣨���Կ���ʹ��Date���Calendar�ࣩ
 */
public class Test5_3 {
    public static void main(String args[])
    {
        Thread1 t1= new Thread1("t1");
        Thread1 t2= new Thread1("t2");
        Thread1 t3= new Thread1("t3");
        t1.start();
        t2.start();
        t3.start();


    }

}
class Thread1 extends Thread
{String name;

    public Thread1(String str)
    {
        name = str;

    }
    public void run()
    {
        long time1,time2;
        time1 = Calendar.getInstance().getTimeInMillis();
        System.out .println(name+"��ʼ"+time1);
        for(int i=0;i<44455555;i++)
        {

        }
        time2 = Calendar.getInstance().getTimeInMillis();
        System.out .println(name+"����"+time2);
        System.out .println(name+"�������!��ʱ:"+(time2-time1)+"ms");


    }
}


