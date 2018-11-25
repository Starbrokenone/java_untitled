package labreport;

import java.io.File;

/**
 * 利用Java文件类File的方法，获取磁盘文件的文件名、长度、大小等特性
 */
public class Test7_2 {
    public static void main(String args[]){
        File file = new File("C:\\Users\\张利云\\Desktop");
        System.out.println("文件名："+file.getName());
        System.out.println("文件长度："+file.length()+"字节");

    }
}
