import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value, TransactionListener transactionListener) {
        
        transactionListener.onLoading();
        try {
            int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    account.setTotal(account.getTotal() - value);
                    transactionListener.onSuccess(account.getTotal());
                }
            }, time);                
        } catch (Exception e) {
            transactionListener.onError();
        }
    }
}
