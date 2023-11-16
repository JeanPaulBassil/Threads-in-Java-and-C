public class Main {
    public static void main(String[] args){
        System.out.println("Thread 1: ");
        Summation s1 = new Summation(20);
        Summation s2 = new Summation(15);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        System.out.println("Thread 1:");
        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted Thread!");
        }

        System.out.println("Thread 2:");
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted Thread");
        }

        System.out.println("After t1 - The sum is: " + s1.getSum());
        System.out.println("After t2 - The sum is: " + s2.getSum());
    }
}
