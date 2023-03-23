/*
    Escuchador de los botones del ejercicio 1
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Ejercicio1Escuchador implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "hola");
    }
}
