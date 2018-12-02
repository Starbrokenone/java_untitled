package labreport;

import java.util.Scanner;
/**
 * 实现取款机功能，存款balance、存钱deposit、取withdraw、查询getbalan
 *
 */
public class Test3_2 {
    public static void main(String[] args) {
        double balance = 0;
        double deposit = 0;
        double withdraw = 0;
        for (;;) {
            System.out.println("请输入数字：\t1.存钱 \t2.取钱\t3.查询余额\n");
            Scanner input = new Scanner(System.in);
            String num = input.next();
            double s1 = 0, s2= 0 ;
            if (num.equals("1")) {
                System.out.println("输入存入金额：");
                deposit = input.nextDouble();
                System.out.println("存钱数目为:" + deposit);
                s1 += deposit;
            }
            if (num.equals("2")) {
                System.out.println("输入取钱金额：");
                withdraw = input.nextDouble();
                System.out.println("取走金额为：" + withdraw);
                s2 += withdraw;
            }
            if (true | num.equals("3")) {
                balance += s1 - s2;
                System.out.println("账户余额为：" + balance);
            }
        }
    }
}