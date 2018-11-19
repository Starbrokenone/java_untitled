package labreport;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 编写一个程序，在控制台输入10个数，按大小顺序输出
 */
public class Test2_1 {
    public static void main(String args[])throws IOException {
        System.out.println("请输入10个数:");
        Scanner scanner = new Scanner(System.in) ;
        int i;
        int[] a = new int[10];
        for ( i = 0; i < 10; i++) {
            int b = scanner.nextInt();
            a[i] = b;
        }
        Arrays.sort(a);
        System.out.println("它们按大小顺序输出后为:");
        for (i = 0;i <a.length;i++)
            System.out.println(a[i]);
        scanner.close();

    }
}
