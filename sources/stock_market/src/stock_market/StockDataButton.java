package stock_market;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class StockDataButton implements TableCellRenderer {
    private TableCellRenderer renderer;

    public StockDataButton(TableCellRenderer renderer){
        this.renderer=renderer;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof Component){
            return (Component)value;}
        else{
            return renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
}
