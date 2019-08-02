# 太原理工大学Java语言程序设计实验报告
## 实验1 java语言基础

**一、实验目的和要求（必填）**

(1) 通过实验，掌握Java语言程序设计的基本方法。

(2) 学会Java语言中标示符的命名、运算符和表达式的应用。

(3) 熟练地掌握Java程序流程控制语句的应用。

**二、实验内容和原理（必填）**

(1) 编写应用程序,计算100(含100)以内所有偶数的和。

(2) “水仙花数”是指一个3位数，其个位、十位、百位上的数字的立方和等于该数本身，例如371=33+73+13，因此371是一个水仙花数。编写程序，求所有的水仙花数。

(3) 编写一个程序，求1-100间的素数。

(4)  有一函数：

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image003.png)     x        （x<1）

Y=   3x-2      （1≤x<10）

​        4x        （x≥10）

   写一程序，给定x值，输出y值。

(5) 使用for循环语句，编写程序输出以下图案。

```
   ☆

  ☆☆☆

 ☆☆☆☆☆

☆☆☆☆☆☆☆

 ☆☆☆☆☆

  ☆☆☆

   ☆
```

(6) 编写程序，输出从公元1900年到2100年所有闰年的年号，每输出5个年号换一行。判断年是否为闰年的条件是：① 若年号可以被4整除，而不能被100整除，则是闰年；② 若年号可以被400整除，也是闰年。

 

**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**



**五、实验数据记录和处理（可选）**

```
\1.  package labreport;
 
 */**  ** *编写应用程序,计算100(含100)以内所有偶数的和。  \*/* public class Test1_1 {
     public static void main(String[] args) {
         int i = 0;
         int sum = 0;
         while (i <= 100) {
             sum = sum + i;
             i = i + 2;
 
         }
         System.*out*.println(sum);
     }
 
 }

\2.  package labreport;
 
 */**  ** *求水仙花数  \*/* public class Test1_2 {
     public static void main(String args[]){
         int i,x,y,z;
         for(i=100;i<1000;i++)
         {
             x=i%10;
             y=i/10%10;
             z=i/100%10;
 
             if(i==(x*x*x+y*y*y+z*z*z))
             System.*out*.println(i);
         }
 
     }
 }
```



```
3.  package labreport;



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
4.  package labreport;



import java.util.Scanner;



/**

 * 有一函数：

 *      x        （x<1）

 * Y=   3x-2      （1≤x<10）

 *         4x        （x≥10）

 *    写一程序，给定x值，输出y值

 */

public class Test1_4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入x的值:");

        int x = sc.nextInt();

        int y = 0;

        if(x < 1)

            y = x;

        if(x >=1 && x<10)

            y =3*x-2;

        if (x >=10)

            y = 4*x;

        System.out.println("Y = "+y);

    }

}
5.  package labreport;



/**

 * 编写程序输出以下图案

 */

public class Test1_5 {

    public static void main(String args[]) {

        for (int i = 0; i < 9; i++) {

            if (i > 1 && i % 2 == 0) ;

            else {

                System.out.print("\n");

                for (int k = 9; k > i / 2; k--)

                    System.out.print(" ");

                for (int j = 0; j < i; j++) {

                    System.out.print("*");

                }

            }

        }

        for (int i = 5; i > 0; i--) {

            if (i > 1 && i % 2 == 0) ;

            else {

                System.out.print("\n");

                for (int k = 9; k > i / 2; k--)

                    System.out.print(" ");

                for (int j = 0; j < i; j++) {

                    System.out.print("*");

                }

            }



        }



    }

}
6.  package labreport;



/**

 * 编写程序，输出从公元1900年到2100年所有闰年的年号，

 * 每输出5个年号换一行。判断年是否为闰年的条件是：

 * ① 若年号可以被4整除，而不能被100整除，则是闰年；

 * ② 若年号可以被400整除，也是闰年。

 */

public class Test1_6 {

    public static void main(String args[]){

        int i;

        for (i = 1900;i <= 2100;i++){

            if (i % 4 ==0 && i % 100 !=0)

                System.out.println(i);

            if (i % 400 ==0){

                System.out.println(i);

            }

        }

    }

}
```

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image005.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image007.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image009.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image011.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image013.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image015.jpg)

**七、讨论、心得（可选）** 

## 实验2 数组和字符串编程  

 

**一、实验目的和要求（必填）**

(1) 通过实验，掌握Java语言中数组、字符串程序设计的基本方法。

(2) 较熟练地掌握Java程序数组的应用、字符串处理操作的方法应用。

**二、实验内容和原理（必填）**

(1) 编写一个程序，在控制台输入10个数，按大小顺序输出。

(2) 求一个3*3矩阵对角元素之和。

(3) 输入一段字符串，统计其中有多少个单词。（单词用空格隔开）

**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**

 

**五、实验数据记录和处理（可选）**

```
1.  package labreport;



import java.io.IOException;

import java.util.Arrays;

import java.util.Scanner;



/**

 * 编写一个程序，在控制台输入10个数，按大小顺序输出

 */

public class Test2_1 {

    public static void main(String args[])throws IOException {

        System.out.println("请输入10个数:");

        Scanner scanner = new Scanner(System.in) ;

        int i;

        int[] a = new int[10];

        for ( i = 0; i < 10; i++) {

            int b = scanner.nextInt();

            a[i] = b;

        }

        Arrays.sort(a);

        System.out.println("它们按大小顺序输出后为:");

        for (i = 0;i <a.length;i++)

            System.out.println(a[i]);

        scanner.close();



    }

}
2.  package labreport;



import java.io.IOException;



/**

 * 求一个3*3矩阵对角元素之和

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
3.  package labreport;



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
```

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image018.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image020.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image022.jpg)

**七、讨论、心得（可选）**

使用二维数组时要用new创建数组。

 

## 实验3 Java面向对象程序设计 

 

**一、实验目的和要求（必填）**

掌握Java面向对象程序设计中类、继承、包和接口的概念与应用，能熟练应用方法、类、成员变量等元素。

**二、实验内容和原理（必填）**

(1) 创建一个复数类complex，以附属进行数学运算、复数具有如下格式：RealPart+ImaginaryRart*I ,其中，I为-1的平方根。

  要求如下：

①　利用浮点变量表示此类的私有数据。提供两个构造方法，一个用于此类声明的对象的初始化；一个为默认的无参构造方法。

②　提供两复数加、减、乘的运算方法。

③　按格式(a,b)打印复数。其中a为实部，b为虚部。

(2) 创建银行账号Account类，实现存款(balance)的存(deposit)、取(withdraw)和查询(getbalance)等功能。

(3) 编程定义一个接口，实现三个数中求最小值和最大值的方法，并将程序存放在mymaths包中。

(4) 编程实现以下简单超市管理，具体要求如下：

①　实现描述超市的类Suppermacket类，具有货架属性,记录系统中现有商品，定义盘点商品的函数check(盘点各类商品的数量,并输出盘点结果)，查询商品的函数query，并显示查询结果；

②　定义商品类Goods，具有商品名称Name，商品价格Price，商品产地Producer等属性，操作Sale（销售商品，余额不足时给予提示）、Add（商品上架操作）和ShowMe（显示商品信息）。

③　 main函数，测试以上所要求的各种功能，即可以根据菜单命令增加、删除、查询商品、盘点商品，以及商品销售和商品上架的操作

提示:① 超市货架可以使用商品数组,数组大小100表明存放100个商品。

② 注意实现商品查询的多态性，要求可以根据商品的名称或产地或价格查询商品的数量。

**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**

 

**五、实验数据记录和处理（可选）**

```
1.  package labreport;



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
2.  package labreport;



/**

 * 创建银行账号Account类，

 * 实现存款(balance)的存(deposit)、取(withdraw)和查询(getbalance)等功能

 */

public class Test3_2 {

    public static void main(String args[]){

        Account money = new Account(100.00);

        money.deposit(100);

        money.withdraw(20);

        money.getbalance();

    }

}

class Account{

    double balance = 0.0f;

    public Account(double _balance){

        balance = _balance;

        System.out.println("您的当前余额为"+balance);

    }

    public double deposit(double a){

        this.balance += a;

        System.out.println("存款后您的余额为"+balance);

        return balance;

    }

    public void getbalance(){

        System.out.println("您的当前余额为"+balance);

    }

    public void withdraw(double b){

        this.balance -=b;

        System.out.println("取款后您的余额为"+balance);

    }

}
package mymaths;



public interface SortNumber {

    public Integer maxNum(int a,int b);

    public Integer minNum(int a,int b);

}

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
3.  package labreport;



/**

 * 编程实现以下简单超市管理，具体要求如下：

 * ①　实现描述超市的类Suppermacket类，具有货架属性,记录系统中现有商品，

 * 定义盘点商品的函数check(盘点各类商品的数量,并输出盘点结果)，查询商品的函数query，

 * 并显示查询结果；

 * ②　定义商品类Goods，具有商品名称Name，商品价格Price，商品产地Producer等属性，

 * 操作Sale（销售商品，余额不足时给予提示）、Add（商品上架操作）和ShowMe（

 * 显示商品信息）。

 * ③　 main函数，测试以上所要求的各种功能，即可以根据菜单命令增加、删除、

 * 查询商品、盘点商品，以及商品销售和商品上架的操作

 * 提示:① 超市货架可以使用商品数组,数组大小100表明存放100个商品。

 * ② 注意实现商品查询的多态性，要求可以根据商品的名称或产地或价格查询商品的数量

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

            System.out.println("请输入序号选择菜单:");

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

    public void Sale(){

        if(this.count>0){

            this.count--;

            System.out.println("商品已经卖出！");

        }

        else

            System.out.println("商品已卖空，此操作不成功！");

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
4.   
```

**5.**       

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image025.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image027.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image029.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image031.jpg)

**七、讨论、心得（可选）**

##  实验4  Java异常处理 

**一、实验目的和要求（必填）**

掌握异常的概念，以及如何定义、抛出和捕获处理异常。

**二、实验内容和原理（必填）**

（1）做实验之前要求思考以下问题，作为预习内容；

①　错误和异常有何区别？查看Java异常类的关系图。

②　异常是如何抛出、捕获和处理的？

③　Java捕获和处理异常的结构式怎样的？

④　Try语句如何嵌套？Trow语句有何作用？Finally程序快的作用是什么？

(2) 运行下面的程序，理解异常的抛出、捕获与处理。

Import java.io.*;

public class void main(String args[]){

  public staic void main(String args[]){

​    for(int i=0;i<4;i++){

​       int k;

​       try{

​         switch(i){

​           case 0: //divided by zero

​             int zero=0;

​            k=911  //zero

​            break;

​          case 1://null pointer

​            int b[]=null;

​            k=b[0];

​            break;

​          case 2; //array index out of bound

​            int c[]=new int[2];

​            k=c[9];

​            break;

​          case 3: //string index out of bound

​            char ch="abc".charAt(99);

​            break;

​         }

​        }catch(Exception e){

​         System.out.println("\nTestcase#"+i+"\n");

​         System.out.println(e);

​        }

​      }

   }

 }

(3）在实验三中的超市、商品类中创建一个自定义异常类。

 要求：在定义商品类时，若销售商品数量大于余额则作为异常处理（InsufficientFundsException）。

提示：

①　产生异常条件是某类商品销售数量大于库存额，因此是否抛出异常要先判断该条件。

②　确定产生异常的方法，应该在sale方法中产生异常Insufficient Funds Exception。

③　处理异常安排在调用sale的时候，因此sale方法要声明异常，由上级方法捕获并处理。

要定义好自己的异常

**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**

 

**五、实验数据记录和处理（可选）**

```
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
```

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image034.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image036.jpg)

**七、讨论、心得（可选）** 

## 实验5  多线程编程 

**一、实验目的和要求（必填）**

(1) 现成的概念、线程的生命周期。

(2) 多线程的编程：扩展Thread类与使用Runnable接口。

(3) 使用多线程机制实现动画

**二、实验内容和原理（必填）**

(1) 运行下面的程序，理解用创建Thread子类的方法实现多线程。

//S09_01_Thread.Java

Import java.util.*;

class S09_01_Thread extends Thread {

  int pauseTime;

  String name;

  public S09_01_Thread(int x,String n){

​    pauseTime=x;

​    name=n;

}

public void run(){

  while(true){

  try{

  system.out.println(name+":"+new Date(System.currentTimeMillis()));

​    Tread.sleep(pauseTime);

  }catch(Exception e){System.out.println(e);}

 }

}

static public void main(String srgs[]){

  S09_01_Thread tp1=new S09_01_Thread(1000,"Fast");

  tp1.start();

  S09_01_Thread tp2=new S09_01_Thread(3000,"Slow");

  tp2.start();

 }

}

(2) 运行下面的程序，理解用实现Runnable接口的方法实现多线程。

//S09_02_Thread.Java

Import java.util.*;

class S09_02_Thread implements Runnable {

  int pauseTime;

  String name;

  public S09_02_Thread(int x,String n){

​    pauseTime=x;

​    name=n;

}

public void run(){

  while(true){

  try{

  system.out.println(name+":"+new Date(System.currentTimeMillis()));

​    Tread.sleep(pauseTime);

  }catch(Exception e){System.out.println(e);}

 }

}

static public void main(String srgs[]){

  Thread t1=new Thread(new S09_02_Thread(1000,"Fast"));

  t1.start();

  Thread t2=new Thread(new S09_02_Thread(3000,"Slow"));

  t2.start();

 }

}

(3) 创建简单的程序ThreeThread.java，该程序将创建三个线程，每个线程应当显示它所运行的时间（可以考虑使用Date类或Calendar类）。

**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**

**五、实验数据记录和处理（可选）**

```
package labreport;



import java.util.Calendar;



/**

 * 创建简单的程序ThreeThread.java，该程序将创建三个线程，

 * 每个线程应当显示它所运行的时间（可以考虑使用Date类或Calendar类）

 */

public class Test5_3 {

    public static void main(String args[])

    {

        Thread1 t1= new Thread1("t1");

        Thread1 t2= new Thread1("t2");

        Thread1 t3= new Thread1("t3");

        t1.start();

        t2.start();

        t3.start();





    }



}

class Thread1 extends Thread

{String name;



    public Thread1(String str)

    {

        name = str;



    }

    public void run()

    {

        long time1,time2;

        time1 = Calendar.getInstance().getTimeInMillis();

        System.out .println(name+"开始"+time1);

        for(int i=0;i<44455555;i++)

        {



        }

        time2 = Calendar.getInstance().getTimeInMillis();

        System.out .println(name+"结束"+time2);

        System.out .println(name+"运行完毕!用时:"+(time2-time1)+"ms");





    }

}
```

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image039.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image041.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image043.jpg)

**七、讨论、心得（可选）** 

## 实验6  图形用户界面编程  

**一、实验目的和要求（必填）**

掌握文本组件、按钮和单、复选按钮组件的使用；掌握列表的使用，鼠标、键盘事件的处理；掌握布局控制的方法。

**二、实验内容和原理（必填）**

(1) 编写一个程序响应鼠标事件，当鼠标事件发生时，在状态条显示相应的时间信息。提示：使用showStatus(字符串)方法。

(2) 试设计一窗口，内含一个按钮。开始运行时，按钮显示“Click Me”字样，当按钮按下时，按钮显示为“Click Me Again”字样，再按一次，则按钮显示“Click Me”字样，依次循环。

(3) 仿照Windows 2000/XP系统提供扫雷游戏编写一个类似功能和界面的扫雷程序。**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**

 

**五、实验数据记录和处理（可选）**

```
package labreport;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.*;



public class Test6_2{



    public static void main(String[] args) {



        JFrame f=new JFrame();

        FlowLayout flow =new FlowLayout();

        f.setLayout(flow);//设置布局



        JButton b=new JButton("Click Me");

        b.addActionListener(new ActionListener(){//利用匿名类



            public void actionPerformed(ActionEvent e) {

                if(b.getText().equals("Click Me"))

                    b.setText("Click Me Again");

                else b.setText("Click Me");

            }



        });



        f.add(b);

        f.setBounds(20,20,400,200);

        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
```

 

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image045.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image047.jpg)

**七、讨论、心得（可选）** 

#  实验7  输入与输出

**一、实验目的和要求（必填）**

(1) 掌握Java两种基本输入/输出流类的使用。

(2) 掌握Java文件类型的使用。

(3) 掌握文件的输入、输出方法。

**二、实验内容和原理（必填）**

(1) 编写程序，实现从键盘输入字符串并在屏幕上输出。

(2) 利用Java文件类File的方法，获取磁盘文件的文件名、长度、大小等特性。

(3) 编写程序，利用Java字符流文件输入/输出类，实现将源程序复制到另一个文件中。

（4）编写一个程序，比较两个文件的内容是否相同。

（5）编写一个程序，求2~200之间的素数，并将结果保存在文件prime.dat中。再从该文件中读取内容并在屏幕上显示出来。

**三、主要仪器设备（必填）**

笔记本电脑

**四、操作方法与实验步骤（可选）**

 

**五、实验数据记录和处理（可选）**

```
1.  package labreport;



import java.util.Scanner;



public class Test7_1 {

        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(a);

    }

}
2.  import java.io.File;



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
3.  package labreport;



import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;



public class Test7_3 {

    public static void main(String args[]) throws IOException

    {

        FileReader fr = new FileReader("F:\\1.txt");

        FileWriter fw = new FileWriter("F:\\2.txt");

        int cha;

        while((cha=fr.read())!=-1)

        {

            System.out .print((char)cha);

            fw.write(cha);

        }

        fr.close();

        fw.close();

    }



}
4.  package labreport;



import java.io.FileReader;

import java.io.IOException;



public class Test7_4 {

    public static void main(String args[]) throws IOException

    {

        FileReader fr = new FileReader("F:\\1.txt");

        FileReader fw = new FileReader("F:\\1.txt");

        int cha1=0,cha2=0;

        boolean judge =true;

        while(true)

        {

            cha1=fr.read();

            cha2=fw.read();

            if(cha1==-1&&cha2==-1)

                break;

            if(cha1!=cha2)

            {

                judge = false;

                break;

            }

        }

        if(cha1!=-1||cha2!=-1)

            judge=false;



        if(judge==false)

            System.out.println("文件内容不相同！");

        else

            System.out.println("文件内容完全相同！");



        fr.close();

        fw.close();





    }

}
5.  package labreport;



/**

 * 编写一个程序，求2~200之间的素数，并将结果保存在文件prime.dat中。

 * 再从该文件中读取内容并在屏幕上显示出来。

 */

import java.io.*;



public class Test7_5{



    private Isprim sushu = null;

    FileOutputStream fos = null;

    public  Test7_5() {

        try {

            fos = new FileOutputStream("F://prime.dat");

            sushu = new Isprim();

            for(int i=2;i<=200;i++)

            {

                if(sushu.isPrim(i)){

                    fos.write(i);

                    System.out.println(i);

                }



            }

            fos.close();

        } catch (FileNotFoundException e) {

            // TODO Auto-generated catch block

            System.out.println("找不到指定文件"); System.exit(-1);

        }catch (IOException e){

            System.out.println("文件写入错误"); System.exit(-1);

        }



        System.out.println("文件写入完毕！");



    }





    public static void main(String[] args) {

        Test7_5 tip = new Test7_5();





    }



    //定义Isprime类用于判断一个数是否是素数

    class Isprim {

        public Isprim(){



        }

        public  boolean  isPrim(int m)

        {

            int i=2;

            boolean flag=true;

            while(i<m-1)

            {

                if(m%i==0)

                {

                    flag=false;

                    break;

                }

                i++;



            }

            return flag;

        }



    }

}
```

 

**六、实验结果与分析（必填）**

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image049.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image051.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image053.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image055.jpg)

![img](file:///C:/Users/张利云/AppData/Local/Temp/msohtmlclip1/01/clip_image057.jpg)

**七、讨论、心得（可选）**
