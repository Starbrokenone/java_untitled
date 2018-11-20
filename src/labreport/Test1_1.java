package labreport;

/**
 * 编写应用程序,计算100(含100)以内所有偶数的和。
 */
public class Test1_1 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 101) {
            sum = sum + i;
            i = i + 2;

        }
        System.out.println(sum);
    }

}
