package labreport;

import java.io.IOException;

/**
 * ��һ��3*3����Խ�Ԫ��֮��
 */
public class Test2_2 {
    public static void main(String args[])throws IOException{
        int a[][],sum=0;
        a= new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j]=i+j;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                if(i==j)
                    sum+=a[i][j];
            }
        System.out.print(sum);
    }

}
