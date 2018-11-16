package labreport;

/**
 * 求水仙花数
 */
public class Test1_2 {
    public static void main(String args[]){
        int i,x,y,z;
        for(i=100;i<1000;i++)
        {
            x=i%10;
            y=i/10%10;
            z=i/100%10;

            if(i==(x*x*x+y*y*y+z*z*z))
            System.out.println(i);
        }

    }
}
