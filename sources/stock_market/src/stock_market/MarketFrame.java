package stock_market;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class MarketFrame extends JFrame {
    private Market market;
    private JTable stockTable;
    private StockData stockData;
    private Trader trader;

    public MarketFrame(StockData stockData){

        trader=new Trader();
        trader.setTraderBalance(500);

        Market market=new Market();

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

        //market data
        JPanel pane1=new JPanel();
        pane1.add(label1);
        //interactive panel
        JPanel pane2=new JPanel();
        pane2.add(label2);
        //trader data
        JPanel pane3=new JPanel();
        JLabel balance=new JLabel(trader.getTraderBalance()+" $");
        //balance.setText();
        balance.setForeground(Color.RED);
        pane3.add(balance,BorderLayout.EAST);



        //time
        JPanel timePane=new JPanel();

        //time components
        JButton nextDayButton=new JButton("NEXT DAY");
        nextDayButton.setBackground(Color.ORANGE);
        JLabel timeLabel=new JLabel("Day "+market.getCurrentTime());

        nextDayButton.addActionListener(ae->{market.nextDayOnMarket();
            timeLabel.setText("Day "+ market.getCurrentTime());});


        timePane.add(timeLabel,BorderLayout.CENTER);
        timePane.add(nextDayButton,BorderLayout.EAST);

        super.add(scrollpane, BorderLayout.CENTER);
        super.add(pane1,BorderLayout.WEST);
        super.add(pane2,BorderLayout.EAST);
        super.add(pane3,BorderLayout.NORTH);
        super.add(timePane,BorderLayout.SOUTH);
        super.pack();
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(800,600);
    }





}
