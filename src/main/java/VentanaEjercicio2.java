import javax.swing.*;
import java.awt.*;

public class VentanaEjercicio2 extends JFrame {

    JLabel lbNum1 = new JLabel("Num1");
    JLabel lbNum2 = new JLabel("Num2");
    JLabel lbresultado = new JLabel();

    JTextField tfNum1 = new JTextField();
    JTextField tfNum2 = new JTextField();

    JButton btnSumar = new JButton("+");
    JButton btnRestar = new JButton("-");


    public VentanaEjercicio2(){

        JFrame marco = new JFrame("Sumar y restar reales");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(350,200);
        marco.setLayout(null);
        marco.setResizable(false);

        lbNum1.setBounds(20, 30,40,20);
        tfNum1.setBounds(70, 30,100,20);

        lbNum2.setBounds(20, 80,40,20);
        tfNum2.setBounds(70,80,100,20);

        btnSumar.setBounds(80,130,50,30);
        btnRestar.setBounds(135,130,50,30);
        lbresultado.setBounds(190,130,100,30);



        btnSumar.addActionListener(e ->{
            double resultado;

            if ((tfNum1.getText()).matches("[0-9 | .]{1,100}") && (tfNum2.getText()).matches("[0-9 | .]{1,100}")){

                resultado = (Double.parseDouble(tfNum1.getText()) + Double.parseDouble(tfNum2.getText()));

                lbresultado.setText(String.valueOf(resultado));
                lbresultado.setForeground(Color.BLACK);
            }else {
                lbresultado.setText("¡Error!");
                lbresultado.setForeground(Color.RED);
            }


        });

        btnRestar.addActionListener(e ->{
            double resultado;

            if ((tfNum1.getText()).matches("[0-9 | .]{1,100}") && (tfNum2.getText()).matches("[0-9 | .]{1,100}")){

                resultado = (Double.parseDouble(tfNum1.getText()) - Double.parseDouble(tfNum2.getText()));

                lbresultado.setText(String.valueOf(resultado));
                lbresultado.setForeground(Color.RED);
            }else {
                lbresultado.setText("¡Error!");
                lbresultado.setForeground(Color.RED);
            }
        });


        marco.add(lbNum1);
        marco.add(tfNum1);

        marco.add(lbNum2);
        marco.add(tfNum2);

        marco.add(btnSumar);
        marco.add(btnRestar);
        marco.add(lbresultado);

        marco.setVisible(true);

    }
}