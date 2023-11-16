public class Summation implements Runnable {
    private int upper;
    private Sum sum;

    public Summation(int upper, Sum sumValue){
        this.upper = upper;
        this.sum = sumValue;
    }

    public void run(){
        int sum = 0;
        for(int i = 1; i <= upper; i++)
            sum += i;

        this.sum.setSum(sum);
    }
}
