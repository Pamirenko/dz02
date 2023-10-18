public class LimitException extends RuntimeException{
    private  double remainingAmout;

    public double getRemainingAmout() {
        return remainingAmout;
    }

    public  LimitException(String message , double remainingAmout){
        super(message);
        this.remainingAmout = remainingAmout;

    }


}
