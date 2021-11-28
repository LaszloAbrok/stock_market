package stock_market;

import java.io.Serializable;

public class News implements Serializable {
    private String type;
    private String text;
    private double baseRate;
    private int time;
    static final long setialVersionUID=1;

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public News(String type, String text, double baseRate, int time) {
        this.type = type;
        this.text = text;
        this.baseRate = baseRate;
        this.time=time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return type+" "+" "+text+" " + " "+baseRate+"\n";
    }

    public void decreaseTime(){
        time--;
    }

}
