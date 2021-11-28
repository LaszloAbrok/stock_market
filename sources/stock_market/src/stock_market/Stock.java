package stock_market;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

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
       /*debug*/  System.out.println("Effecting news on "+ ticker);
        for(int i=0; i<effectingNews.size(); i++){
            double newPrice=getPrice()+(1+effectingNews.get(i).getBaseRate());
            setPrice(newPrice);
            effectingNews.get(i).decreaseTime();

            /*debug*/ System.out.println(effectingNews.get(i).toString());

            if(effectingNews.get(i).getTime()==0){

                /*debug*/ System.out.println("Removing: "+effectingNews.get(i).toString());

                effectingNews.remove(i);
                /*debug*/ System.out.println("removed");}
        }
        System.out.println("new price: "+ price);
    }

    public void addEffectingNews(News n){
        if(n.getType().equals(industry.toString()))
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

    public ArrayList<News> getActiveNews(){
        return effectingNews;
    }
}
