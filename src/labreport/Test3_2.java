package labreport;

import java.util.Scanner;
/**
 * ʵ��ȡ������ܣ����balance����Ǯdeposit��ȡwithdraw����ѯgetbalan
 *
 */
public class Test3_2 {
    public static void main(String[] args) {
        double balance = 0;
        double deposit = 0;
        double withdraw = 0;
        for (;;) {
            System.out.println("���������֣�\t1.��Ǯ \t2.ȡǮ\t3.��ѯ���\n");
            Scanner input = new Scanner(System.in);
            String num = input.next();
            double s1 = 0, s2= 0 ;
            if (num.equals("1")) {
                System.out.println("��������");
                deposit = input.nextDouble();
                System.out.println("��Ǯ��ĿΪ:" + deposit);
                s1 += deposit;
            }
            if (num.equals("2")) {
                System.out.println("����ȡǮ��");
                withdraw = input.nextDouble();
                System.out.println("ȡ�߽��Ϊ��" + withdraw);
                s2 += withdraw;
            }
            if (true | num.equals("3")) {
                balance += s1 - s2;
                System.out.println("�˻����Ϊ��" + balance);
            }
        }
    }
}