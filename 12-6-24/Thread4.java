public class Thread4 extends Thread {
    public void run() {
        System.out.println("task one");
    }

    public static void main(String args[]) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();

        t1.start();
        t2.start();
        t3.start();
    }
}
