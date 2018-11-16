package labreport;

/**
 * 编写程序，输出从公元1900年到2100年所有闰年的年号，
 * 每输出5个年号换一行。判断年是否为闰年的条件是：
 * ① 若年号可以被4整除，而不能被100整除，则是闰年；
 * ② 若年号可以被400整除，也是闰年。
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
