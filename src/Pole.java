import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pole extends JPanel {
    private int stan,x,y,wielkosc;

    public Pole(Plansza plansza){
        super();
        stan = -1;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                stan = 0;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });
    }

    public void rysujFigure(Graphics grafika){
        super.paintComponent(grafika);
        Graphics2D grafika2D = (Graphics2D) grafika;
        grafika2D.setStroke(new BasicStroke(3));
        if (stan==0){
            grafika2D.drawLine(0,0,(600+40)/wielkosc,600/wielkosc);
            grafika2D.drawLine(640/wielkosc,0,0,560/wielkosc);
        }
        if(stan==1){
            grafika2D.drawOval(0,0,640/wielkosc,580/wielkosc);
        }
    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }

    public int getStan() {
        return stan;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public int getWielkosc() {
        return wielkosc;
    }
}
