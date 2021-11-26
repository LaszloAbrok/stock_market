package stock_market;

import java.io.Serializable;
import java.util.ArrayList;

public class Stock implements Serializable {
    private String ticker;
    private Industry industry;
    double price;
    private String owner;
    private ArrayList<News> effectingNews;
    static final long setialVersionUID=1;

    public Stock(String ticker, Industry industry, double price) {
        this.ticker = ticker;
        this.industry = industry;
        this.price = price;
        this.owner="market";
        this.effectingNews=new ArrayList<News>();
    }

    public void upDate(){

        for(News n: effectingNews){
            setPrice(getPrice()+n.getBaseRate());
            n.decreaseTime();
        }
        setPrice(getPrice()+Math.random()+10);
        System.out.println(getTicker()+" debug: currentPrice: "+getPrice()+"\n ***");
        for(News n: effectingNews){
            System.out.println(n.getType()+" "+" "+n.getText()+" "+" "+n.getTime());

        }
    }

    public void addEffectingNews(News n){
        effectingNews.add(n);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Industry getIndustry() {
        return industry;
    }

    public Object getTicker() {
        return ticker;
    }
}
