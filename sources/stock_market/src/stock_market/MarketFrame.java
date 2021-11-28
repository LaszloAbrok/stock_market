package stock_market;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.ArrayList;

public class MarketFrame extends JFrame {
    private Market market;
    private JTable stockTable;
    private StockData stockData;
    //private Trader trader;
    private StockMarketSystem marketSystem;

    public MarketFrame(StockMarketSystem sms) {

        //trader=new Trader();
        //trader.setTraderBalance(500);

        Market market=new Market();
        marketSystem=sms;

       // this.market=market;
        this.stockData=new StockData(sms.getStocksList());
        stockTable=new JTable();
        stockTable.setModel(stockData);
        TableRowSorter<TableModel> sorter= new TableRowSorter<TableModel>(stockTable.getModel());
        stockTable.setRowSorter(sorter);

        //TableCellRenderer tableCellRenderer;
        //tableCellRenderer = stockTable.getDefaultRenderer(JButton.class);
        //stockTable.setDefaultRenderer(JButton.class, new StockDataButton(tableCellRenderer));
        ListSelectionListener lsl=new StockListSelection();
        stockTable.getSelectionModel().addListSelectionListener(lsl);


        stockTable.setFillsViewportHeight(true);
        JScrollPane scrollpane=new JScrollPane(stockTable);

        JLabel label1=new JLabel("market data");
        JLabel label2=new JLabel("interactive panel");
        JLabel label3=new JLabel("trader data");
        JLabel label4=new JLabel("time");

        //market data
        JPanel pane1=new JPanel();
        JTextArea newsArea=new JTextArea();
        newsArea.setText("Alma");
        newsArea.setEditable(false);
        pane1.add(newsArea);


        //pane1.add(label1);


        //interactive panel
        JPanel pane2=new JPanel();
        pane2.add(label2);
        //trader data
        JPanel pane3=new JPanel();
        JLabel balance=new JLabel(marketSystem.getTrader().getTraderBalance()+" $");
        //balance.setText();
        balance.setForeground(Color.RED);
        pane3.add(balance,BorderLayout.EAST);



        //time
        JPanel timePane=new JPanel();

        //time components
        JButton nextDayButton=new JButton("NEXT DAY");
        nextDayButton.setBackground(Color.ORANGE);
        JLabel timeLabel=new JLabel("Day "+market.getCurrentTime());

        nextDayButton.addActionListener(ae->{
            marketSystem.upDate();
            timeLabel.setText("Day "+marketSystem.getTime());
            stockData.UpdateData(marketSystem.getStocksList());
            balance.setText(marketSystem.getTrader().getTraderBalance()+" $");
            newsArea.setText(marketSystem.getActiveNews().toString());
        });

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

class StockListSelection implements ListSelectionListener{

    @Override
    public void valueChanged(ListSelectionEvent e) {
        System.out.println("this is a test");
    }
}



