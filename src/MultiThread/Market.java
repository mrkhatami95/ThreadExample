package MultiThread;

/**
 * Created by MR on 1/16/2020.
 */
public class Market {
    int n;
    boolean valSet = false;

    synchronized int get() throws InterruptedException {
        if (!valSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Got : " + n);
        valSet = false;
        notifyAll();
        return n;
    }

    synchronized void put(int n) throws InterruptedException {
       if (valSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            valSet = true;
            this.n = n;
            System.out.println("Put : " + n);
            notifyAll();
        }
    }
}

class Producer implements Runnable {
    Market m;

    public Producer(Market m){
        this.m = m;
        new Thread(this,"Producer").start();
    }

    public void run(){
        int i = 0;
        while(true)
            try {
                m.put(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

class Consumer implements Runnable {
    Market m;

    public Consumer(Market m){
        this.m = m;
        new Thread(this,"Consumer").start();
    }

    public void run(){
        while(true)
            try {
                m.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

class PandC1{
    public static void main(String[] args) {
        Market market = new Market();
        new Producer(market);
        new Consumer(market);
        System.out.println("Stop by pressing Ctrl-C");
    }
}
