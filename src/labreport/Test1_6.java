package labreport;

/**
 * ��д��������ӹ�Ԫ1900�굽2100�������������ţ�
 * ÿ���5����Ż�һ�С��ж����Ƿ�Ϊ����������ǣ�
 * �� ����ſ��Ա�4�����������ܱ�100�������������ꣻ
 * �� ����ſ��Ա�400������Ҳ�����ꡣ
 */
public class Test1_6 {
    public static void main(String args[]){
        int i,year=0;
        for (i = 1900;i <= 2100;i++){
            if (i % 4 ==0 && i % 100 !=0)
                System.out.println(i);
            if (i % 400 ==0){
                System.out.println(i);
            }
        }
    }
}
