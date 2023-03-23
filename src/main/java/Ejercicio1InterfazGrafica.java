/*
    Interfaz grafica del ejercicio 1
 */

import javax.swing.*;
import java.awt.*;


public class Ejercicio1InterfazGrafica {


    public void interfazGrafica(){

        JFrame marco = new JFrame();
        marco.setLayout(new FlowLayout());
        marco.setSize(300,400);
        //marco.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textBase = new JLabel();
        JLabel textAltura= new JLabel();
        JLabel lResultado = new JLabel();

        textBase.setText("Base");
        textAltura.setText("Altura");

        JTextField tfBase = new JTextField();
        JTextField tfAltura = new JTextField();

        tfBase.addActionListener(new Ejercicio1Escuchador());
        tfAltura.addActionListener(new Ejercicio1Escuchador());

        JButton buttonCalcular = new JButton("Area");

        buttonCalcular.addActionListener(new Ejercicio1Escuchador());


        marco.add(textBase);
        marco.add(tfBase);
        marco.add(textAltura);
        marco.add(tfAltura);

    }

}
