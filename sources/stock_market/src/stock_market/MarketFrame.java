package stock_market;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class MarketFrame extends JFrame {
    //private Market market;
    private JTable stockTable;
    private StockData stockData;

    public MarketFrame(StockData stockData){
       // this.market=market;
        this.stockData=stockData;
        stockTable=new JTable();
        stockTable.setModel(stockData);

        stockTable.setFillsViewportHeight(true);
        JScrollPane scrollpane=new JScrollPane(stockTable);

        JLabel label1=new JLabel("market data");
        JLabel label2=new JLabel("interactive panel");
        JLabel label3=new JLabel("trader data");
        JLabel label4=new JLabel("time");

        JPanel pane1=new JPanel();
        pane1.add(label1);
        JPanel pane2=new JPanel();
        pane2.add(label2);
        JPanel pane3=new JPanel();
        pane3.add(label3);
        JPanel pane4=new JPanel();
        pane4.add(label4);

        super.add(scrollpane, BorderLayout.CENTER);
        super.add(pane1,BorderLayout.WEST);
        super.add(pane2,BorderLayout.EAST);
        super.add(pane3,BorderLayout.NORTH);
        super.add(pane4,BorderLayout.SOUTH);
        super.pack();
        super.setSize(800,600);
    }



}
