public class TransactionListener implements Listener {
    
    public void onLoading(){
        System.out.println("YOUR REQUEST IS BEING PROCESSED.....");
    }
    public void onError(){
        System.out.println("YOUR REQUEST WAS NOT PROCESSED.....");
    }
    public void onSuccess(int value) {
        System.out.println("YOUR BALANCE IS " + value);
    }
}
