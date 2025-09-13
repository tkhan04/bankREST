package main.java.com.example.BankREST;

public class BankInfo {

    private int accId;
    private String pass;
    private int balance;

    public BankInfo(int accId, String pass, int balance){

        this.accId = accId;
        this.pass = pass;
        this.balance = balance;

    }

    public int getAcc(){
        return accId;
    }

    public String getPass(){
        return pass;
    }

    public int getBal(){
        return balance;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }




    
}
