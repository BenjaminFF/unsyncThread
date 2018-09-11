public class Main {
    static Bank bank;
    public static void main(String[] args){
        bank=new Bank(100,10000);

        TransferRunnable runnable1=new TransferRunnable();
        TransferRunnable runnable2=new TransferRunnable();
        TransferRunnable runnable3=new TransferRunnable();
        TransferRunnable runnable4=new TransferRunnable();
        TransferRunnable runnable5=new TransferRunnable();
        new Thread(runnable1).start();
        new Thread(runnable2).start();
        new Thread(runnable3).start();
        new Thread(runnable4).start();
        new Thread(runnable5).start();
    }

    static class TransferRunnable implements Runnable{
        @Override
        public void run() {
            while (true){
                int accountSize=bank.getAccountSize();
                int from=(int)(Math.random()*accountSize);
                int to=(int)(Math.random()*accountSize);
                int randomAmount=(int)(Math.random()*100);
                bank.transfer(from,to,randomAmount);
            }
        }
    }
}
