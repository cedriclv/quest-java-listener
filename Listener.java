public interface Listener {
    void onLoading();
    void onError();
    void onSuccess(int value);
}
