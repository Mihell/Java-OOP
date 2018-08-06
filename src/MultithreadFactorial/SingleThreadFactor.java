package MultithreadFactorial;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class SingleThreadFactor implements Runnable {
    private int x;

    public SingleThreadFactor(int x){
        this.x = x;
    }

    public BigInteger factor(){
        if(x < 0){
            throw new IllegalArgumentException("Negative argument");
        }
        BigInteger result = new BigInteger("1");
        for(int i = 2; i <= x; i++){
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }

    public void factorInFile(){
        String fileName = "factorial " + x + ".txt";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());

        try(PrintWriter out = new PrintWriter(file)){
            file.createNewFile();
            out.println(factor());
        } catch(IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public void run(){
        factorInFile();
    }
}
