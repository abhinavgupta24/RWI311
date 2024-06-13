public class ThreadMeth1 extends Thread {
    @Override
    public void run() {
        System.out.println("this is the task");
    }

    public static void main(String[] args) {
        System.out.println(currentThread());
        Thread t1 = new Thread("first thread but on the basis of priority it will be after main");
        // t1.start();
        System.out.println(currentThread());
        t1.run();
        t1.setPriority(10);
        Thread t2 = new Thread();
        t2.start();
        System.out.println(t1.getName() + " " + t1.getPriority() + " " + t1.getState());
        System.out.println(t2.getPriority() + " " + t2.getName() + " " + t2.getState());
        System.out.println(t2.getStackTrace());
        System.out.println(t1.getStackTrace());
        System.out.println(
                currentThread().getName() + " " + currentThread().getState() + " " + currentThread().getPriority());
    }
}
