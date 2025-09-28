package Com.BA;

class BankAccount {
    private static int balance = 10000;
    void withdraw (int amt) {
//        System.out.println("Hello Customer ");
//        System.out.println("Pin Verification ");
//        System.out.println("Hello Customer ");
//        System.out.println("Pin Verification ");
        synchronized (this) {
        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amt);
            balance -= amt;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Not enough balance!");
        }
        }
    }
}
//Thread Class
class WithdrawThreads extends Thread {
        BankAccount account;
        int amount;
        WithdrawThreads (BankAccount account, int amount) {
            this.account = account;
            this.amount  = amount;
        }

        public void run() {
            account.withdraw(amount);
        }
}
public class SynchronizedExample {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        WithdrawThreads t1 = new WithdrawThreads(acc1, 4000);
        WithdrawThreads t2 = new WithdrawThreads(acc1, 3000);
        t1.start();
        t2.start();

        BankAccount acc2 = new BankAccount();
        WithdrawThreads t3 = new WithdrawThreads(acc2, 4000);
        WithdrawThreads t4 = new WithdrawThreads(acc2, 3000);
        t3.start();
        t4.start();
    }
}

