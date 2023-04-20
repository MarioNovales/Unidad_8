import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba {


    private JTextArea lasCondicinesDePrivacidadTextArea;
    private JCheckBox aceptarLasCondicionesDeCheckBox;
    private JButton aceptarButton;

    public static void main(String[] args) {
        new Prueba();
    }

    public Prueba() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        aceptarLasCondicionesDeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
