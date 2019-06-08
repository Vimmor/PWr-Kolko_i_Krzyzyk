package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Startowe extends JFrame {
    private JButton StartButton;
    private JButton SizeButton;
    private JButton WinButton;
    private JTextField WelcomeText;
    private JPanel Panel_startowy;
    private Wybor_wielkosci wielkosc;
    private Wybor_wartosci zwyciestwo;
    private Plansza plansza;

    public Menu_Startowe() {
        SizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                wielkosc = new Wybor_wielkosci();
                frame.setContentPane(wielkosc.getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(300,300);
                frame.setLocation(700  ,300);
                frame.setVisible(true);
            }
        });

        WinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                zwyciestwo = new Wybor_wartosci();
                frame.setContentPane(zwyciestwo.getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               // frame.setSize(300,300);
                frame.pack();
                frame.setLocation(700,300);
                frame.setVisible(true);
            }
        });

        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plansza = new Plansza();
                JFrame frame = new JFrame();
                plansza.removeAll();
                plansza.setSize(wielkosc.getWielkosc());
                plansza.revalidate();
                plansza.repaint();
                frame.setContentPane(plansza);
                frame.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
    }

    public static void main(String[] args){
        JFrame myFrame = new JFrame("Kolko i krzyzyk");
        myFrame.setContentPane(new Menu_Startowe().Panel_startowy);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300,300);
        myFrame.setLocation(700,300);
        myFrame.setVisible(true);
    }
}