package stock_market;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
      /*  Stock aapl=new Stock("AAPL",Industry.Tech,149.88);
        Stock cvx=new Stock("CVX",Industry.OilandGas,114.00);
        Stock mcd=new Stock("MCD",Industry.Food,250.34);
        ArrayList<Stock> stocks=new ArrayList<Stock>();
        stocks.add(aapl);
        stocks.add(cvx);
        stocks.add(mcd);
        Trader trader=new Trader();
       */

        //MenuFrame mf=new MenuFrame();
        //mf.setVisible(true);
        Stock aapl=new Stock("AAPL",Industry.Tech,149.88);
        Stock cvx=new Stock("CVX",Industry.OilandGas,114.00);
        Stock mcd=new Stock("MCD",Industry.Food,250.34);

        List<Stock> stocks=new ArrayList<Stock>();
        stocks.add(aapl);
        stocks.add(cvx);
        stocks.add(mcd);
        StockData stockData=new StockData(stocks);
        /*MarketFrame mf=new MarketFrame(stockData);
        mf.setVisible(true);*/
        MenuFrame mf=new MenuFrame(stockData);
        mf.setVisible(true);
    }
}
