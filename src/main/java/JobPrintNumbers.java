public class JobPrintNumbers implements Runnable {
    private Counter counter;

    public JobPrintNumbers(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + counter.incrementCount());
        }
    }
}
