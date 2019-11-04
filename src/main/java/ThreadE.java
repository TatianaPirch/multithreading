public class ThreadE extends Thread {
    private Counter counter;

    public ThreadE(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + counter.incrementCount());
        }
    }
}
