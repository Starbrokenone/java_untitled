package labreport;

/**
 * 编写一个程序，求2~200之间的素数，并将结果保存在文件prime.dat中。
 * 再从该文件中读取内容并在屏幕上显示出来。
 */
import java.io.*;

public class Test7_5{

    private Isprim sushu = null;
    FileOutputStream fos = null;
    public  Test7_5() {
        try {
            fos = new FileOutputStream("F://prime.dat");
            sushu = new Isprim();
            for(int i=2;i<=200;i++)
            {
                if(sushu.isPrim(i)){
                    fos.write(i);
                    System.out.println(i);
                }

            }
            fos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("找不到指定文件"); System.exit(-1);
        }catch (IOException e){
            System.out.println("文件写入错误"); System.exit(-1);
        }

        System.out.println("文件写入完毕！");

    }


    public static void main(String[] args) {
        Test7_5 tip = new Test7_5();


    }

    //定义Isprime类用于判断一个数是否是素数
    class Isprim {
        public Isprim(){

        }
        public  boolean  isPrim(int m)
        {
            int i=2;
            boolean flag=true;
            while(i<m-1)
            {
                if(m%i==0)
                {
                    flag=false;
                    break;
                }
                i++;

            }
            return flag;
        }

    }
}