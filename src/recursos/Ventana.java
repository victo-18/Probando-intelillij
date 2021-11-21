package recursos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Ventana.
 */
public class Ventana extends JFrame {
    private JButton boton,salir;
    private JPanel panel;
    private  String nombre = "Jefe";
    private JLabel etiqueta;
    private Logica ob;

    /**
     * Instantiates a new Ventana.
     */
    public Ventana(){
        initGUI();
        this.setTitle("Using IntelliJ Idea");
        this.setSize(400,300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void initGUI() {
        panel = new JPanel();
        boton = new JButton("Accept");
        salir = new JButton("Exit");
        etiqueta = new JLabel(nombre);
        ob = new Logica();
        etiqueta.setHorizontalAlignment(0);
        etiqueta.setVerticalAlignment(0);
        etiqueta.setBackground(Color.DARK_GRAY);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setText(String.valueOf(ob.menu()));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
                System.out.println("Painting the  panel");
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(panel);
        add(etiqueta,BorderLayout.NORTH);
        add(boton,BorderLayout.SOUTH);
        add(salir,BorderLayout.WEST);
    }

}
