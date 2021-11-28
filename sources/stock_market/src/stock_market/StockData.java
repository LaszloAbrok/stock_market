package stock_market;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StockData extends AbstractTableModel {

    private List<Stock> stocks;
    private List<JButton> buttons;
    private String[] columnNames={"Ticker","Industry","Price","Action"};

    public StockData(List<Stock> stocks){
        this.stocks=stocks;
        this.buttons=new ArrayList<JButton>();
        for(int i=0; i<this.stocks.size(); i++){
            buttons.add(new JButton());
        }
        for(int i=0; i<buttons.size(); i++){
            buttons.get(i).addActionListener(ae->System.out.println("Button pressed"));
        }
    }

    @Override
    public int getRowCount() {
        return stocks.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Stock stock=stocks.get(rowIndex);
        switch(columnIndex){
            case 0: return stock.getTicker();
            case 1: return stock.getIndustry();
            case 2 : return stock.getPrice();
            default: return buttons.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Class getColumnClass(int col) {
        return getValueAt(0,col).getClass();
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }

    public void UpdateData(ArrayList<Stock> updated){
        int rowIndex=0;
        for(Stock s: updated){
            setValueAt(s.getPrice(),rowIndex++,2);
        }
        fireTableDataChanged();
    }
}
