package stock_market;

import javax.swing.*;
import java.sql.Array;
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


        //MenuFrame mf=new MenuFrame(stockData);
        //mf.setVisible(true);

        News n1=new News("TECH","Global chip shortage around the world.",1.56,2);
        News n2=new News("OIL AND GAS","Oil tower on the Northern seas demolished by storm.", -2.01,3);
        News n3=new News("FOOD", "McDonald's and BurgerKing faces charges of making too unhealthy food.", -3.19,8);

        //StockMarketSystem sms=new StockMarketSystem();
        //sms.debugData();
        Stock s=new Stock("aapl",Industry.Tech,2.0);
        s.addEffectingNews(n1);
        s.addEffectingNews(n2);
        s.addEffectingNews(n3);
        s.upDate();
        s.upDate();
        s.upDate();
        s.upDate();
    }
}
