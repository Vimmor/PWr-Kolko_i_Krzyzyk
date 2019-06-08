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

    public Menu_Startowe() {
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { ;
            }
        });
        SizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame m = new JFrame();
                m.setSize(200,200);
                m.setLocation(100,100);
                JTextField j = new JTextField();
                j.setText("Podaj wielkosc planszy:");
                m.add(j);
                m.setVisible(true);
            }
        });
        WinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame m = new JFrame();
                m.setSize(200,200);
                m.setLocation(100,100);
                JTextField j = new JTextField();
                j.setText("Podaj ilosc znakow w rzedzie by zwyciezyc:");
                m.add(j);
                m.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
    }

    public static void main(String[] args){
        JFrame myFrame = new JFrame("Kolko i krzyzyk");
        myFrame.setContentPane(new Menu_Startowe().Panel_startowy);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}