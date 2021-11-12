package stock_market;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {
    JButton newSimulationButton;
    JButton loadButton;
    JPanel panel;

    public void MenuFrame(){
        this.newSimulationButton=new JButton("New simulation");
        this.loadButton=new JButton("Load simulation");
        panel=new JPanel();
        panel.add(newSimulationButton);
        panel.add(loadButton);

        super.setSize(600,800);
        super.add(panel);
        super.pack();
    }

}
