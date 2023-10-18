public class BankAccount {
    private  double amout;
    public  BankAccount(double amout){
        this.amout = amout;
    }

    public double getAmout() {
        return amout;
    }

    public  void deposit(double sun){
        amout += sun;
    }
    public void withdraw(double sum){
        if (sum > amout){
            throw new LimitException("Requested amout exceeds account balance", amout);
        }
        amout -=sum;
    }

}
