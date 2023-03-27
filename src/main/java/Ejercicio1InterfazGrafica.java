/*
    Interfaz grafica del ejercicio 1
 */

import javax.swing.*;
import java.awt.*;


public class Ejercicio1InterfazGrafica {


    public static void interfazGrafica(){

        JFrame marco = new JFrame();
        marco.setLayout(new FlowLayout());
        marco.setSize(200,200);
        //marco.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textBase = new JLabel();
        JLabel textAltura= new JLabel();
        JLabel textResultado = new JLabel();

        textBase.setText("Base");
        textAltura.setText("Altura");


        JTextField tfBase = new JTextField(12);
        JTextField tfAltura = new JTextField(12);


        tfBase.addActionListener(new Ejercicio1Escuchador());
        tfAltura.addActionListener(new Ejercicio1Escuchador());

        JButton buttonCalcular = new JButton("Area");

        buttonCalcular.addActionListener(new Ejercicio1Escuchador());

        textResultado.setText(Ejercicio1.areaTriandulo(tfBase.getText(), tfAltura.getText()));

        marco.add(textBase);
        marco.add(tfBase);
        marco.add(textAltura);
        marco.add(tfAltura);
        marco.add(buttonCalcular);
        marco.add(textResultado);


        marco.setVisible(true);
    }

}
