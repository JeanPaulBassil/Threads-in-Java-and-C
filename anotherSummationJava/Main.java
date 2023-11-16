public class Main {
    public static void main(String[] args){
        if(args.length > 0){
            if(Integer.parseInt(args[0]) < 0){
                System.err.println(args[0] + "Must be a number <= 0.");
            } else {
                Sum subObj = new Sum();
                int upper = Integer.parseInt(args[0]);
                Thread t = new Thread(new Summation(upper, subObj));
                t.start();

                try {
                    t.join();
                    System.out.println("The sum of " + upper + " is " + subObj.getSum());
                } catch (InterruptedException e){
                    System.out.println("Thread interrupted.");
                }
            }
        } else {
            System.err.println("Usage: Summation <integer value>");
        }
    }
}
