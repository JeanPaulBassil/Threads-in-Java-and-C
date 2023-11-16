public class FirstThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Message from first thread: " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("First Thread interrupted while sleeping: " + e);
            }
        }
    }
}