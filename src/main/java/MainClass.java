public class MainClass {
    public static void main(String[] args) {
        Counter counter = new Counter();
        JobPrintNumbers job = new JobPrintNumbers(counter);
        ThreadE threadE = new ThreadE(counter);
        Thread threadR = new Thread(job);
        threadE.start();
        threadR.start();
    }
}
