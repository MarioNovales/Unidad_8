import javax.swing.*;

public class VentanaEjercicio5 extends JFrame{

    JCheckBox cbAceptar = new JCheckBox("He leido y acepto las condiciones");
    JButton btnAceptar = new JButton("Aceptar");
    JTextArea txCondicieones = new JTextArea();

    public VentanaEjercicio5() {

        super("Condiciones de seguridad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400,400);


        txCondicieones.setBounds(0,0,400,180);

        cbAceptar.setBounds(20,250,220,50);
        btnAceptar.setBounds(240,250,100,50);

        txCondicieones.setText("Las condicines de seguridad son las siguientes:\n 1-sdsadasd\n2-dsdsadsadsa\n3-sdfsfsdfsd\n4-sdsadasd\n5-dsdsadsadsa\n6-sdfsfsdfsd");


        add(txCondicieones);
        add(cbAceptar);
        add(btnAceptar);
        btnAceptar.setEnabled(false);
        setVisible(true);

        cbAceptar.addActionListener(e -> {
            btnAceptar.setEnabled(true);
        });

        btnAceptar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Gracias por aceptar las condiciones");
            dispose();
        });
    }

}
