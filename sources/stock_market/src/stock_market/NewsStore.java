package stock_market;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class NewsStore {
    private ArrayList<News> news;

    public NewsStore(){
        news=new ArrayList<News>();
    }

    public void listNews() {
        for (News n : news) {
            System.out.println(n);
        }
    }

    public News[] getNews() {
        return news.toArray(new News[0]);
    }

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("news.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(news);
            fos.close();
            oos.close();
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }

    public void load(){
        try {
            FileInputStream fis = new FileInputStream("news.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            news = (ArrayList<News>) ois.readObject();
            fis.close();
            ois.close();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public void add(News n){
        news.add(n);
    }

    public News popRandom(){
        Random rand=new Random();
        int rand_idx= rand.nextInt(news.size());
        News ret=news.get(rand_idx);
        System.out.println(ret.toString());
        return ret;
    }

}