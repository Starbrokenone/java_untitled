package labreport;

import java.util.Scanner;

/**
 * ��һ������
 *      x        ��x<1��
 * Y=   3x-2      ��1��x<10��
 *         4x        ��x��10��
 *    дһ���򣬸���xֵ�����yֵ
 */
public class Test1_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("������x��ֵ:");
        int x = sc.nextInt();
        int y = 0;
        if(x < 1)
            y = x;
        if(x >=1 && x<10)
            y =3*x-2;
        if (x >=10)
            y = 4*x;
        System.out.println("Y = "+y);
    }
}
