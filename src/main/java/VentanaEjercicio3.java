import javax.swing.*;
import java.awt.*;

public class VentanaEjercicio3 extends JFrame{

    JLabel lbUsuario = new JLabel("Usuario:");
    JLabel lbContraseña = new JLabel("Contraseña:");

    JTextField tfUsuario = new JTextField();
    JPasswordField pfContraseña = new JPasswordField();

    JButton btnValidar = new JButton("Validar");


    public VentanaEjercicio3() {

        super("Iniciar Sesion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLayout(null);
        setResizable(false);


        lbUsuario.setBounds(10,30,100,15);
        tfUsuario.setBounds(120,30,100,30);

        lbContraseña.setBounds(10,70,100,15);
        pfContraseña.setBounds(120,70,100,30);

        btnValidar.setBounds(120,120,100,30);



        btnValidar.addActionListener(e -> {
            if ((tfUsuario.getText()).equals("daw")){
                if ((String.valueOf(pfContraseña.getPassword())).equals("daw1")){
                    super.setTitle("Validacíon correcta");
                }else {
                    super.setTitle("Validacíon incorrecta");
                }
            }else {
                super.setTitle("Validacíon incorrecta");
            }
        });

        add(lbUsuario);
        add(tfUsuario);

        add(lbContraseña);
        add(pfContraseña);

        add(btnValidar);

        setVisible(true);
    }

}
