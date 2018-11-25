package labreport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4_3 {
    public static void main(String args[]) throws Exception
    {
        Suppermacket a = new Suppermacket();
        int month;
        System.out.println("请输入序号选择菜单:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String read = new String();
        for(;;){
            System.out.println("1.增加商品种类  2.盘点商品  3.根据商品名查找  4.根据价格查找  5.根据产地查找  6.出售商品  7.商品上架  8。显示商品信息");

            month = (int)Double.parseDouble(in.readLine());
            switch(month)
            {
                case 1:a.Add_Goods();break;
                case 2:a.check();break;
                case 3:read = in.readLine();a.query(read);break;
                case 4:read = in.readLine();a.query(Float.parseFloat(read));break;
                case 5:read = in.readLine();a.query(read,1);break;
                case 6:read = in.readLine();a.good[Integer.parseInt(read)].Sale();break;
                case 7:read = in.readLine();a.good[Integer.parseInt(read)].Add();break;
                case 8:read = in.readLine();a.good[Integer.parseInt(read)].ShowMe();break;
                case 9:read = in.readLine();a.delete(Integer.parseInt(read));break;
            }
        }
    }
}
class Suppermacket
{
    public Goods good[] = new Goods[200] ;
    public int Goods_num = -1;
    public int Add_Goods() throws IOException
    {
        InputStreamReader re = new InputStreamReader(System.in);
        BufferedReader bre = new BufferedReader (re);
        System.out.println("输入商品名字：");
        String Name = new String();
        Name = bre.readLine();
        System.out.println("输入商品价格");
        float Price = Float.parseFloat(bre.readLine());
        System.out.println("输入商品产地");
        String Produced = new String();
        Produced = bre.readLine();
        for(int i=0;i<=Goods_num;i++)
        {
            if(good[i].getname().equals(Name)==true){
                good[i].addcount();
                return 1;
            }
        }
        this.Goods_num++;
        good[Goods_num] = new Goods();
        good[Goods_num].setGoods(Name, Price, Produced);
        return 0;
    }
    public void check()
    {
        for(int i=0;i<=Goods_num;i++)
        {
            System.out.println(good[i].getname()+" "+good[i].getcount());
        }
    }
    public void query(String Name)
    {
        for(int i=0;i<=Goods_num;i++)
        {
            if(good[i].getname().equals(Name)==true){
                System.out.println(good[i].getname()+" "+good[i].getcount());
            }
        }
    }
    public void query(float Price )
    {
        for(int i=0;i<=Goods_num;i++)
        {
            if(good[i].getprice()==Price){
                System.out.println(good[i].getname()+" "+good[i].getcount());
            }
        }
    }
    public void query(String Producer ,int j )
    {
        for(int i=0;i<=Goods_num;i++)
        {
            if(good[i].getproducer().equals(Producer)==true){
                System.out.println(good[i].getcount());
            }
        }
    }
    public void delete(int i)
    {int k;
        for(k=i+1;k<=Goods_num;k++)
        {
            this.good[k-1] = good[k];
        }
        this.Goods_num--;
    }
}
class Goods{
    private String Name;
    private float Price;
    private String Produced;
    private int count = 0;
    InsufficientFundsException problem = new InsufficientFundsException();

    public void Sale()throws InsufficientFundsException{
        this.count--;
        if(this.count<0)
            throw problem;
    }
    public void Add()
    {
        this.count++;
        System.out.println("商品已经上架！");
    }
    public void ShowMe()
    {
        System.out.println("商品名称"+this.Name);
        System.out.println("商品价格"+this.Price);
        System.out.println("商品产地"+this.Produced);
    }
    public void setGoods(String Name,float Price,String Produced)
    {
        this.Name = Name;
        this.Price = Price;
        this.Produced = Produced;
    }
    public String getname()
    {
        return this.Name;
    }
    public float getprice()
    {
        return this.Price;
    }
    public String getproducer()
    {
        return this.Produced;
    }
    public void addcount()
    {
        this.count++;
    }
    public int getcount()
    {
        return count;
    }
}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(){
        super("余额不足！交易不成功！");
    }
}

















































