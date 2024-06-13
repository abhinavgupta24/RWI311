public class ThreadMeth3 extends Thread {
    public void run() {
        System.out.println("this is child Thread");
    }

    public static void main(String[] args) {
        System.out.println("parent thread");
        ThreadMeth3 d = new ThreadMeth3();
        d.setDaemon(true);
        d.start();

    }
}
