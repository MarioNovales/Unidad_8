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


    JTextField tfDato1 = new JTextField(15);
    JTextField tfDato2 = new JTextField(15);
    JTextField tfResultado = new JTextField(15);

    JButton btnSumar = new JButton("+");
    JButton btnRestar = new JButton("-");
    JButton btnMulti = new JButton("X");
    JButton btnDividir = new JButton("/");
    public VentanaEjercicio4(){


        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        lbUsuario.setSize(20,20);
        lbExit.setSize(20,20);

        //Panel 1 (Foto calculador)
            JPanel p1 = new JPanel();
            p1.setLayout(new FlowLayout());
            p1.add(lbCalculadora);

        //Panel 2 (Contiene izquierda)
            JPanel p2 = new JPanel();
            p2.setMinimumSize(new Dimension(200,600));
            p2.setLayout(new GridLayout(5,2));
        p2.add(new JLabel());
            p2.add(lbDato1);
        p2.add(new JLabel());
            p2.add(lbDato2);
        p2.add(new JLabel());
            p2.add(lbResultado);


        //panel 3 (centro)
            JPanel p3 = new JPanel();
            p3.setLayout(new GridLayout(5,1));
            p3.add(tfDato1);
            p3.add(tfDato2);
            p3.add(tfResultado);
            p3.add(lbUsuario);
            p3.add(lbExit);


        //Panel 4 (derecha)
            JPanel p4 = new JPanel();
            p4.setLayout(new GridLayout(4,2));
            p4.setMinimumSize(new Dimension(400,600));
            p4.add(btnSumar);
            p4.add(new JLabel());
            p4.add(btnRestar);
            p4.add(new JLabel());
            p4.add(btnMulti);
            p4.add(new JLabel());
            p4.add(btnDividir);
            p4.add(new JLabel());






        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.WEST);
        add(p3);
        add(p4, BorderLayout.EAST);
        add(new JPanel(), BorderLayout.SOUTH);

        setVisible(true);
    }


}
