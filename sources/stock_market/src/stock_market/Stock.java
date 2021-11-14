package stock_market;

import java.io.Serializable;

public class Stock implements Serializable {
    private String ticker;
    private Industry industry;
    double price;
    static final long setialVersionUID=1;

    public Stock(String ticker, Industry industry, double price) {
        this.ticker = ticker;
        this.industry = industry;
        this.price = price;
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
