public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        System.out.println("Running Thread from main");
        t1.start(); // t1.run() doesn't start a new thread it just executes the method.
    }
}