import java.util.ArrayList;

public class Bank {

    private double[] accounts;
    public Bank(int n,double initialBalance) {       //n代表账户的个数
        accounts=new double[n];
        for(int i=0;i<n;i++){
            accounts[i]=initialBalance;
        }
    }

    public void transfer(int from,int to,double amount){
        if(accounts[from]<amount){
            return;
        }
        accounts[from]-=amount;
        accounts[to]+=amount;
        System.out.println("Total Balance: "+getTotalBalance());
    }

    public double getTotalBalance(){
        double sum=0;
        for(int i=0;i<accounts.length;i++){
            sum+=accounts[i];
        }
        return sum;
    }

    public int getAccountSize(){
        return accounts.length;
    }
}
