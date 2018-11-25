package labreport;

import java.util.Calendar;

/**
 * 创建简单的程序ThreeThread.java，该程序将创建三个线程，
 * 每个线程应当显示它所运行的时间（可以考虑使用Date类或Calendar类）
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
        System.out .println(name+"开始"+time1);
        for(int i=0;i<44455555;i++)
        {

        }
        time2 = Calendar.getInstance().getTimeInMillis();
        System.out .println(name+"结束"+time2);
        System.out .println(name+"运行完毕!用时:"+(time2-time1)+"ms");


    }
}


