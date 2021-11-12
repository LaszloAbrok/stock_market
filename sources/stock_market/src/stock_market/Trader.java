package stock_market;

import java.io.Serializable;
import java.util.ArrayList;

public class Trader implements Serializable {
    private BankAccount bankAccount;
    private ArrayList<Stock> stocks;
    private Market market;
    static final long setialVersionUID=1;

    public Trader() {
        this.bankAccount=new BankAccount();
        this.stocks=new ArrayList<>();
    }

    public double getTraderBalance(){
        return bankAccount.getBalance();
    }

    public Stock[] getPortfolio(){
        return (Stock[]) stocks.toArray();
    }



    public void purchase(Stock s, int amount) {
        
    }


    public void sell() {

    }
}