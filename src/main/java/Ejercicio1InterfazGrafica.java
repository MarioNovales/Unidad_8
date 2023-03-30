/*
    Interfaz grafica del ejercicio 1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ejercicio1InterfazGrafica extends JFrame {


    static JLabel lbBase = new JLabel();
    static JLabel lbAltura = new JLabel();
    static JLabel lbResultado = new JLabel();

    static JTextField tfBase = new JTextField(12);
    static JTextField tfAltura = new JTextField(12);

    static JButton btnCalcular = new JButton("Area");

    public Ejercicio1InterfazGrafica(){


        super("Calculadora de areas de un triangulo");

        JFrame marco = new JFrame();
        marco.setLayout(null);
        marco.setSize(350,300);
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        marco.setResizable(false);

        lbBase.setText("Base");
        lbAltura.setText("Altura");

        lbBase.setBounds(100,50,50,20);
        tfBase.setBounds(150,50,70,20);
        lbAltura.setBounds(100,80,50,20);
        tfAltura.setBounds(150,80,70,20);
        lbResultado.setBounds(100,110,200,20);
        btnCalcular.setBounds(120,150,70,30);

        btnCalcular.addActionListener(e -> {
            int area;

            if ((tfBase.getText()).matches("[a-z]{1,100}") || (tfAltura.getText()).matches("[a-z]{1,100}")){
                lbResultado.setText("Valor introducido no valido");
            }else {
                area = (Integer.parseInt(tfBase.getText())*Integer.parseInt(tfAltura.getText()))/2;

                lbResultado.setText("El area del triangulo es: " + area);
            }

        });



        marco.add(lbBase);
        marco.add(tfBase);
        marco.add(lbAltura);
        marco.add(tfAltura);
        marco.add(btnCalcular);
        marco.add(lbResultado);


        marco.setVisible(true);

    }


}
