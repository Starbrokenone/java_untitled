package labreport;

import java.util.Scanner;

/**
 * 输入一段字符串，统计其中有多少个单词（单词用空格隔开）
 */
public class Test2_3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("请输入一段字符串（单词用空格隔开）:");
        String s = scanner.nextLine();
        System.out.println(s.length());
    }
}
