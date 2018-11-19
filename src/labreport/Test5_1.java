package labreport;

import java.util.Date;

/**
 * 运行下面的程序，理解用创建Thread子类的方法实现多线程
 */
class Test5_1 extends Thread {
    int pauseTime;
    String name;
    public Test5_1(int x,String n){
        pauseTime=x;
        name=n;
    }
    public void run(){
        while(true){
            try{
                System.out.println(name+":"+new Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            }catch(Exception e){System.out.println(e);}
        }
    }
    static public void main(String srgs[]){
        Test5_1 tp1=new Test5_1(1000,"Fast");
        tp1.start();
        Test5_1 tp2=new Test5_1(3000,"Slow");
        tp2.start();
    }
}


