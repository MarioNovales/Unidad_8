import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;

public class VentanaEjercicio4 extends JFrame {


    JLabel lbCalculadora = new JLabel(new ImageIcon("src/main/resources/1455210497_368194_1455210536_noticia_normal.jpg"));
    JLabel lbDato1 = new JLabel("Dato 1:");
    JLabel lbDato2 = new JLabel("Dato 2:");
    JLabel lbResultado = new JLabel("Resultado");
    JLabel lbExit = new JLabel(new ImageIcon("src/main/resources/istockphoto-1303004257-170667a.jpg"));
    JLabel lbUsuario = new JLabel(new ImageIcon("src/main/resources/585e4bcdcb11b227491c3396.png"));


    JTextField tfDato1 = new JTextField();
    JTextField tfDato2 = new JTextField();
    JTextField tfResultado = new JTextField();

    JButton btnSumar = new JButton("+");
    JButton btnRestar = new JButton("-");
    JButton btnMulti = new JButton("X");
    JButton btnDividir = new JButton("/");
    public VentanaEjercicio4(){


        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);


        lbCalculadora.setBounds(50,0,70,50);

        lbDato1.setBounds(10,100,60,20);
        tfDato1.setBounds(130,100,80,30);

        lbDato2.setBounds(10,140,60,20);
        tfDato2.setBounds(130,140,80,30);

        lbResultado.setBounds(10,180,60,20);
        tfResultado.setBounds(130,180,80,30);

        lbExit.setBounds(130,210,50,50);
        lbUsuario.setBounds(130,270,50,50);






        add(lbCalculadora);

        add(lbDato1);
        add(tfDato1);

        add(lbDato2);
        add(tfDato2);

        add(lbResultado);
        add(tfResultado);

        add(lbExit);
        add(lbUsuario);

        add(btnSumar);
        add(btnRestar);
        add(btnMulti);
        add(btnDividir);
        setVisible(true);
    }


}
