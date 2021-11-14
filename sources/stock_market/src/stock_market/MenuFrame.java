package stock_market;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {
    private JButton newSimulationButton;
    private JButton loadButton;
    private JPanel panel;

    public MenuFrame(StockData stockData){

        this.newSimulationButton=new JButton("New simulation");
        this.loadButton=new JButton("Load simulation");
        this.panel=new JPanel();

        newSimulationButton.addActionListener(ae-> {MarketFrame mf=new MarketFrame(stockData); mf.setVisible(true); dispose();});

        JLabel label=new JLabel();
        label.setText("Stock Market");

        panel.add(label,BorderLayout.NORTH);
        panel.add(newSimulationButton,BorderLayout.WEST);
        panel.add(loadButton,BorderLayout.EAST);

        super.add(panel);

        super.pack();
        super.setTitle("Stock Market");
        super.setSize(800,600);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }

}
