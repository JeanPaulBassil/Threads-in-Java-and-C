public class Main {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        Thread first = new Thread(t1);

        first.start();

        try{first.join();} catch (InterruptedException e){}
            
        MyThread t2 = new MyThread();
        Thread second = new Thread(t2);

        second.start();

        try{second.join();} catch (InterruptedException e){}

        MyThread t3 = new MyThread();
        Thread third = new Thread(t3);

        third.start();

        try{third.join();} catch (InterruptedException e){}
    }
}
