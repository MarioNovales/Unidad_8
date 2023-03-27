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

        JFrame marco = new JFrame();
        marco.setLayout(new FlowLayout());
        marco.setSize(200,200);
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);

        lbBase.setText("Base");
        lbAltura.setText("Altura");

        btnCalcular.addActionListener(e -> {
            int area;

            area = (Integer.parseInt(String.valueOf((tfBase)))*Integer.parseInt(String.valueOf(tfAltura)))/2;

            lbResultado.setText("El area del triangulo es:" + area);
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
