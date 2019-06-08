package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wybor_wartosci {
    private JTextArea JTextArea;
    private JTextField textField1;
    private JButton button1;
    private JPanel Panel;
    private int wygrana;

    public Wybor_wartosci() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Nie udalo sie wybrac zwycieskiej wartosci. sprobuj ponownie.");
                else {
                    wygrana = Integer.parseInt(getText());
                    System.out.println("Zwycieska wartosc:"+wygrana);
                }
            }
        });
    }

    public void setWygrana(int wygrana) {
        this.wygrana = wygrana;
    }

    public int getWygrana() {
        return wygrana;
    }

    public String getText(){
        return textField1.getText();
    }

    public JPanel getPanel() {
        return Panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
