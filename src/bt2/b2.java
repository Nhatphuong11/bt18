package bt2;

public class b2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();

        t1.start();
        t1.join();
        t2.start();
    }
}
