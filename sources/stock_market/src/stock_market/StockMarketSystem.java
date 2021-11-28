package stock_market;

import java.util.ArrayList;

public class StockMarketSystem {
    private Market market;
    private Trader trader;
    private NewsStore news;
    private ArrayList<Stock> stocks;
    private int time=1;

    public StockMarketSystem(){
        init();
        //news.load();
        //próbadatok, később fájlból töltöm be őket
        //próbaadatok amíg nem végleges a news
        News n1=new News("Tech","tech +",0.56,2);
        News n2=new News("OilandGas","oilandgas -", -0.01,2);
        News n3=new News("Food", "food +", -1.19,2);
        News n4=new News("Pharmaceutical", "parm -", -1.19,2);
        News n5=new News("Tech", "tech -", -0.99,2);
        News n6=new News("OilandGas", "oilandgas -", 0.29,2);
        News n7=new News("Food", "food -", 1.99,2);
        News n8=new News("Pharmaceutical", "parm +", 2.03,2);
        News n9=new News("Finance", "finance +", 3.99,2);
        News n10=new News("Finance", "finance -", -8.01,2);
        news.add(n1);
        news.add(n2);
        news.add(n3);
        news.add(n4);
        news.add(n5);
        news.add(n6);
        news.add(n7);
        news.add(n8);
        news.add(n9);
        news.add(n10);
        //próbadatok amíg nem végleges a stock
        Stock aapl=new Stock("AAPL",Industry.Tech,10);
        Stock cvx=new Stock("CVX",Industry.OilandGas,10);
        Stock mcd=new Stock("MCD",Industry.Food,10);
        Stock gs=new Stock("GS",Industry.Finance,10);
        Stock pfe=new Stock("Pfizer",Industry.Pharmaceutical,10);
        stocks.add(aapl);
        stocks.add(cvx);
        stocks.add(mcd);
        stocks.add(gs);
        stocks.add(pfe);
    }

    public void debugData(){
        news.listNews();
    }

    public Stock[] getMarketPortfolio(){
        return market.getPortfolio();
    }

    public Stock[] getTraderPortfolio(){
        return trader.getPortfolio();
    }

    public Stock[] getStocks(){
        return (Stock[]) stocks.toArray();
    }

    public ArrayList<Stock> getStocksList(){
        return stocks;
    }

    public StockData stocksToStockData(){
        StockData sd=new StockData(stocks);
        return sd;
    }

    public void upDate(){
        //todo
        //banki adatok frissítése

        //hír hozzáadása
        News n= news.popRandom();
        System.out.println(System.currentTimeMillis()+" *** Sorsolt hir: "+n.toString());
        for(Stock s: stocks){
            s.addEffectingNews(n);
            s.upDate();
        }
        time++;
        taxation();
    }

    public int getTime(){
        return time;
    }

    public Trader getTrader() {
        return trader;
    }

    public void init(){
        market=new Market();
        trader=new Trader(500.0);
        news=new NewsStore();
        stocks=new ArrayList<Stock>();
    }

    public void taxation(){
        trader.setTraderBalance(trader.getTraderBalance()*0.78);
    }

    public ArrayList<News> getActiveNews(){
        ArrayList<News> news=new ArrayList<News>();
        for(Stock s: stocks){
            news.addAll(s.getActiveNews());
        }
        for(int i=0; i<news.size()-1; i++){
            for(int j=i+1; j<news.size(); j++){
                if (news.get(i)==news.get(j)){
                    news.remove(j);
                    System.out.println("**************************");
                }
            }
        }

        return news;
    }
}
