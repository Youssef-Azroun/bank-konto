public class account {
    private double balance;
    private String name;



    public  account(){

    }

    public account(double balance){
        this.balance = balance;
    }

    public void withdraw(double w){
        this.balance-=w;
    }
    public void deposit(double d){
        this.balance+=d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public account (double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public String toString(){
        return name + " har en saldå: "+ balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


