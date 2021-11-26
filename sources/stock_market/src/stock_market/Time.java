package stock_market;

public class Time {
    private int day;

    public Time(){
        day=1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void nextDay(){
        day++;
    }
}
