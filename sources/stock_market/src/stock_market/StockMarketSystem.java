package stock_market;

public class StockMarketSystem {
    Market market;
    Trader trader;
    NewsStore news;

    public StockMarketSystem(){
        market=new Market();
        trader=new Trader();
        news=new NewsStore();
        news.load();
    }

    public void debugData(){
        news.listNews();
    }

}
