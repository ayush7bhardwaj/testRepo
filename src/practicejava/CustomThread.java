package practicejava;

public class CustomThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 running");
            }
        };

        Runnable runnable1 = () -> System.out.println("Thread 2 running");

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(thread.currentThread().getState());
    }
}
