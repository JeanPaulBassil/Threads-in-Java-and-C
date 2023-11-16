public class MyThread implements Runnable {
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName() + " ID: " + Thread.currentThread().getId() + " running ");
        System.out.println("Priority " + Thread.currentThread().getPriority() + "- state: " + Thread.currentThread().getState());
        for(int i = 0; i < 3; i++)
            System.out.println("Thread ID= " + Thread.currentThread().getId() + ": " + i);
    }
}