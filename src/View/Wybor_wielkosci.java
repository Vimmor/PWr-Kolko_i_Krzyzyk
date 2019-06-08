package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wybor_wielkosci extends JFrame {
    private JTextField JTextField;
    private JTextArea size_button;
    private JButton confirm_button;
    private JPanel Panel;
    private int wielkosc;

    public JPanel getPanel() {
        return Panel;
    }

    public String getText(){
        return size_button.getText();
    }

    public int getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }

    public Wybor_wielkosci(){
        confirm_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(size_button.equals(""))
                    JOptionPane.showMessageDialog(null, "Nie udalo sie wybrac wielkosci planszy. sprobuj ponownie.");
                else {
                    wielkosc = Integer.parseInt(getText());
                    System.out.println("Wielkosc planszy:"+wielkosc);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
