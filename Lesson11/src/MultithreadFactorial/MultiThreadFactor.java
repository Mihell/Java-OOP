package MultithreadFactorial;

public class MultiThreadFactor {
    private int n;
    private int k;

    public MultiThreadFactor(int n, int k){
        this.n = n;
        this.k = k;
    }

    public void start(){
        Thread[] array = new Thread[n];
        for (int i = 1; i <= n; i++){
            array[i-1] = new Thread( new SingleThreadFactor(i * k));
            array[i-1].start();
        }
        try {
            for (Thread thread : array) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
