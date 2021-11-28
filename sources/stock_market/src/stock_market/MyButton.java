package stock_market;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MyButton a gombok használatára.
 */

public class MyButton extends AbstractCellEditor implements TableCellEditor, ActionListener{

    private JButton button;

    public MyButton(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}