class Summation implements Runnable {
    private int upper;
    private int sum;
    
    public Summation(int u){
        upper = u;
        sum = 0;
    }

    public void run(){
        System.out.println("Thread Running");
        int s = 0;
        for(int i = 0; i <= upper; i++)
            s += i;   

        sum = s;

        System.out.println("Thread Completed");
    }

    public int getSum(){
        return sum;
    }
}