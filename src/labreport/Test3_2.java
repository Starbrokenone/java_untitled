package labreport;

/**
 * ���������˺�Account�࣬
 * ʵ�ִ��(balance)�Ĵ�(deposit)��ȡ(withdraw)�Ͳ�ѯ(getbalance)�ȹ���
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
        System.out.println("���ĵ�ǰ���Ϊ"+balance);
    }
    public double deposit(double a){
        this.balance += a;
        System.out.println("�����������Ϊ"+balance);
        return balance;
    }
    public void getbalance(){
        System.out.println("���ĵ�ǰ���Ϊ"+balance);
    }
    public void withdraw(double b){
        this.balance -=b;
        System.out.println("ȡ����������Ϊ"+balance);
    }
}