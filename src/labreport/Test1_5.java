package labreport;

/**
 * 编写程序输出以下图案
 */
public class Test1_5 {
    public static void main(String args[]) {
        for (int i = 0; i < 9; i++) {
            if (i > 1 && i % 2 == 0) ;
            else {
                System.out.print("\n");
                for (int k = 9; k > i / 2; k--)
                    System.out.print(" ");
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
        }
        for (int i = 5; i > 0; i--) {
            if (i > 1 && i % 2 == 0) ;
            else {
                System.out.print("\n");
                for (int k = 9; k > i / 2; k--)
                    System.out.print(" ");
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }

        }

    }
}
