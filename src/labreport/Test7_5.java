package labreport;

/**
 * ��дһ��������2~200֮�����������������������ļ�prime.dat�С�
 * �ٴӸ��ļ��ж�ȡ���ݲ�����Ļ����ʾ������
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
            System.out.println("�Ҳ���ָ���ļ�"); System.exit(-1);
        }catch (IOException e){
            System.out.println("�ļ�д�����"); System.exit(-1);
        }

        System.out.println("�ļ�д����ϣ�");

    }


    public static void main(String[] args) {
        Test7_5 tip = new Test7_5();


    }

    //����Isprime�������ж�һ�����Ƿ�������
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