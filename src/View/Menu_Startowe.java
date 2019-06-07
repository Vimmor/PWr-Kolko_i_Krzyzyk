package View;

import javax.swing.*;
import java.awt.*;

public class Menu_Startowe extends JFrame {
    private JButton StartButton;
    private JButton SizeButton;
    private JButton WinButton;
    private JTextField WelcomeText;
    private JPanel Panel_startowy;

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