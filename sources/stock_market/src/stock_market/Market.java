package stock_market;

import java.util.ArrayList;

public class Market {
    private Trader trader;
    private ArrayList<Stock> stocks;

    public void Market(ArrayList<Stock> stocks, Trader trader){
        this.stocks=stocks;
        this.trader=trader;
    }

    public void transferToTrader(Stock s, double amount){

    }

    public Stock[] getPortfolio(){
        return (Stock[]) stocks.toArray();
    }

}
