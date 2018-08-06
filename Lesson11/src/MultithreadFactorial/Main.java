package MultithreadFactorial;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int k = 1000;
        
        long timeStart = System.currentTimeMillis();
        for (int i = 1; i <= n; i++){
            SingleThreadFactor fact = new SingleThreadFactor(i * k);
            fact.factorInFile();
        }
        long timeFinish = System.currentTimeMillis();
        long time = timeFinish - timeStart;
        System.out.println("Single thread program time - " + time + " milliseconds");

        timeStart = System.currentTimeMillis();
        MultiThreadFactor mtf = new MultiThreadFactor(n,k);
        mtf.start();
        timeFinish = System.currentTimeMillis();
        time = timeFinish - timeStart;
        System.out.println("Multi thread program time - " + time + " milliseconds");
    }
}
