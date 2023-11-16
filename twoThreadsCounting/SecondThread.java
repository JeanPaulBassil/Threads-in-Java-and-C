public class SecondThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Message from second thread: " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Second thread interrupted while sleeping: " + e);
            }
        }
    }
}
