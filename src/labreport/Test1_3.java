package labreport;

/**
 * 求1-100间的素数
 */
public class Test1_3 {
    public static void main(String[] args) {
        int i,j;
        for(i = 1;i <= 100;i++){
            if(i==1 || i==2){
                System.out.println(i);
                continue;
            }
            for(j=2;j<i;j++){
                if(i%j==0)
                    break;
                if(j==i-1)
                    System.out.println(i);
            }
        }
    }
}
