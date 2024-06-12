public class Thread5 implements Runnable {
    public void run() {
        System.out.println("task one");
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new Thread5());
        Thread t2 = new Thread(new Thread5());

        t1.start();
        t2.start();

    }
}
