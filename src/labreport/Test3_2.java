package labreport;

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