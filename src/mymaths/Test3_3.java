package mymaths;

public class Test3_3 implements SortNumber{

    public Integer maxNum(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public Integer minNum(int a, int b) {
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    public static void main(String []args){
        int a=5,b=4,c=9;
        Test3_3 s=new Test3_3();
        int temp=s.maxNum(a, b);
        int temp1=s.maxNum(temp, c);
        System.out.println("The MaxNum is"+temp1);

        int temp2=s.minNum(a, b);
        int temp3=s.minNum(temp2, c);
        System.out.println("The MinNum is"+temp3);

    }
}