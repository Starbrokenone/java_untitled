package labreport;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ��дһ�������ڿ���̨����10����������С˳�����
 */
public class Test2_1 {
    public static void main(String args[])throws IOException {
        System.out.println("������10����:");
        Scanner scanner = new Scanner(System.in) ;
        int i;
        int[] a = new int[10];
        for ( i = 0; i < 10; i++) {
            int b = scanner.nextInt();
            a[i] = b;
        }
        Arrays.sort(a);
        System.out.println("���ǰ���С˳�������Ϊ:");
        for (i = 0;i <a.length;i++)
            System.out.println(a[i]);
        scanner.close();

    }
}
