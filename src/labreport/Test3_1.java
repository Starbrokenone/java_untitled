package labreport;

/**
 * (1) 创建一个复数类complex，以附属进行数学运算、复数具有如下格式：
 * RealPart+ImaginaryRart*I ,其中，I为-1的平方根。
 *   要求如下：
 * ①　利用浮点变量表示此类的私有数据。提供两个构造方法，
 * 一个用于此类声明的对象的初始化；一个为默认的无参构造方法。
 * ②　提供两复数加、减、乘的运算方法。
 * ③　按格式(a,b)打印复数。其中a为实部，b为虚部。
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

