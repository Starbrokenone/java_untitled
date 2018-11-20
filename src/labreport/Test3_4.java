package labreport;

/**
 * ���ʵ�����¼򵥳��й�������Ҫ�����£�
 * �١�ʵ���������е���Suppermacket�࣬���л�������,��¼ϵͳ��������Ʒ��
 * �����̵���Ʒ�ĺ���check(�̵������Ʒ������,������̵���)����ѯ��Ʒ�ĺ���query��
 * ����ʾ��ѯ�����
 * �ڡ�������Ʒ��Goods��������Ʒ����Name����Ʒ�۸�Price����Ʒ����Producer�����ԣ�
 * ����Sale��������Ʒ������ʱ������ʾ����Add����Ʒ�ϼܲ�������ShowMe��
 * ��ʾ��Ʒ��Ϣ����
 * �ۡ� main����������������Ҫ��ĸ��ֹ��ܣ������Ը��ݲ˵��������ӡ�ɾ����
 * ��ѯ��Ʒ���̵���Ʒ���Լ���Ʒ���ۺ���Ʒ�ϼܵĲ���
 * ��ʾ:�� ���л��ܿ���ʹ����Ʒ����,�����С100�������100����Ʒ��
 * �� ע��ʵ����Ʒ��ѯ�Ķ�̬�ԣ�Ҫ����Ը�����Ʒ�����ƻ���ػ�۸��ѯ��Ʒ������
 */
import java.io.*;
public class Test3_4 {
    public static void main(String args[]) throws IOException
    {
        Suppermacket a = new Suppermacket();
        int month;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String read = new String();
        for(;;){
            System.out.println("1.������Ʒ����  2.�̵���Ʒ  3.������Ʒ������  4.���ݼ۸����  5.���ݲ��ز���  6.������Ʒ  7.��Ʒ�ϼ�  8����ʾ��Ʒ��Ϣ");
            System.out.println("Enter the month number:");
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
        System.out.println("������Ʒ���֣�");
        String Name = new String();
        Name = bre.readLine();
        System.out.println("������Ʒ�۸�");
        float Price = Float.parseFloat(bre.readLine());
        System.out.println("������Ʒ����");
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
    public void Sale(){
        if(this.count>0){
            this.count--;
            System.out.println("��Ʒ�Ѿ�������");
        }
        else
            System.out.println("��Ʒ�����գ��˲������ɹ���");
    }
    public void Add()
    {
        this.count++;
        System.out.println("��Ʒ�Ѿ��ϼܣ�");
    }
    public void ShowMe()
    {
        System.out.println("��Ʒ����"+this.Name);
        System.out.println("��Ʒ�۸�"+this.Price);
        System.out.println("��Ʒ����"+this.Produced);
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
