package stock_market;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class StockData extends AbstractTableModel {

    List<Stock> stocks=new ArrayList<Stock>();
    private String[] columnNames={"Ticker","Industry"};

    public StockData(List<Stock> stocks){
        this.stocks=stocks;
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
            default: return stock.getIndustry();
        }
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0,c).getClass();
    }

}
