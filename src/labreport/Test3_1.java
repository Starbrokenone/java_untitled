package labreport;

/**
 * (1) ����һ��������complex���Ը���������ѧ���㡢�����������¸�ʽ��
 * RealPart+ImaginaryRart*I ,���У�IΪ-1��ƽ������
 *   Ҫ�����£�
 * �١����ø��������ʾ�����˽�����ݡ��ṩ�������췽����
 * һ�����ڴ��������Ķ���ĳ�ʼ����һ��ΪĬ�ϵ��޲ι��췽����
 * �ڡ��ṩ�������ӡ������˵����㷽����
 * �ۡ�����ʽ(a,b)��ӡ����������aΪʵ����bΪ�鲿��
 */
public class Test3_1 {
    public static void main(String args[])
    {
        complex a = new complex(5,6);
        complex b = new complex(1,8);
        a.print();
        a.add(b).print();
        a.sub(b).print();
        a.mul(b).print();
    }
}
class complex{
    float RealPart;
    float ImaginaryRart;

    public complex()
    {   RealPart = 0;
        ImaginaryRart = 0;
    }
    public complex(float RealPart,float ImaginaryRart)
    {   this.RealPart = RealPart;
        this.ImaginaryRart = ImaginaryRart;
    }
    public  complex add(complex b)
    {
        this.RealPart = this.RealPart+b.RealPart;
        this.ImaginaryRart = this.ImaginaryRart+b.ImaginaryRart;
        return this;
    }
    public  complex sub(complex b)
    {
        this.RealPart = this.RealPart-b.RealPart;
        this.ImaginaryRart = this.ImaginaryRart-b.ImaginaryRart;
        return this;
    }
    public  complex mul(complex b)
    {   float a,d;
        a = this.RealPart*b.RealPart - this.ImaginaryRart*b.ImaginaryRart;
        d = this.RealPart*b.ImaginaryRart + this.ImaginaryRart*b.RealPart;
        this.RealPart = a;
        this.ImaginaryRart = d;
        return this;
    }
    public void print()
    {
        System.out.println("("+RealPart+","+ImaginaryRart+")");
    }
}

