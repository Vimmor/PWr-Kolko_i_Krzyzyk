import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Plansza extends JPanel {
    Border czarna_linia;
    Pole[][] tab;
    private GridLayout layout = new GridLayout();
    private int zwyciestwo;

    public Plansza(){
        czarna_linia = BorderFactory.createLineBorder(Color.BLACK);
        this.setLayout(layout);
        this.setVisible(false);
    }

    public void setSize(int wielkosc){
        layout.setColumns(wielkosc);
        layout.setRows(wielkosc);
        tab = new Pole[wielkosc][wielkosc];
        wypelnijPlansze(wielkosc);
    }

    public void wypelnijPlansze(int wielkosc){
        for(int i=0;i<wielkosc;i++){
            for(int j=0;j<wielkosc;j++){
                Pole panel = new Pole(this);
                panel.setWielkosc(wielkosc);
                panel.setX(j);
                panel.setY(i);
                panel.setBackground(Color.RED);
                panel.setBorder(czarna_linia);
                tab[i][j]=panel;
                this.add(panel);
            }
        }

    }
}
