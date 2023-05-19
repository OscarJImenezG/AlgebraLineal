package mx.unam.algebraLineal;

import java.awt.FlowLayout;
import static java.awt.Frame.E_RESIZE_CURSOR;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramEncrip extends JFrame {

    private JLabel lblEtiqueta1;
    private JTextField txtEmisor;
    private JTextField txtReceptor;
    private JLabel lblEtiqueta2;
    private JButton botonEncriptar;
    private JButton botonDesencriptar;
    private JButton botonCerrar;
    private JButton botonIntroducirMatriz;
    private ProgramEncrip print;
    
    public ProgramEncrip() throws HeadlessException {
        super("INDEX");
        this.setSize(300, 150);
        setLayout(new FlowLayout());
        lblEtiqueta1 = new JLabel("¿Que deseas hacer?");
        this.getContentPane().add(lblEtiqueta1);
        botonEncriptar = new JButton("Encriptar");
        this.getContentPane().add(botonEncriptar);
        botonDesencriptar = new JButton("Desencriptar");
        this.getContentPane().add(botonDesencriptar);
        botonCerrar = new JButton("Cerrar");
        this.getContentPane().add(botonCerrar);
        
        botonEncriptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                print = new ProgramEncrip("Encriptar");
                
            }
        });
        
        botonDesencriptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                print = new ProgramEncrip("Encriptar");
                
            }
        });
        
        botonCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public ProgramEncrip(String title) throws HeadlessException {
        super("INDEX");
        this.setSize(300, 200);
        setLayout(new FlowLayout());
        lblEtiqueta1 = new JLabel("Escribe el codigo:");
        this.getContentPane().add(lblEtiqueta1);

        KeyListener escuchaTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                lblEtiqueta2.setText(txtEmisor.getText());
                char[] digitos = txtEmisor.getText().toCharArray();
                for (int i = 0; i < txtEmisor.getText().length(); i++) {
                    if (digitos[0] == '1' || digitos[0] == '2' || digitos[0] == '3' || digitos[0] == '4' || digitos[0] == '5' || digitos[0] == '6' || digitos[0] == '7' || digitos[0] == '8' || digitos[0] == '9' || digitos[0] == '0') {
                    } else {
                        txtReceptor.setText("Por favor solo escriba numeros");
                    }
                }
            }
        };
        txtEmisor = new JTextField(25);
        txtEmisor.addKeyListener(escuchaTeclado);
        this.getContentPane().add(txtEmisor);
        lblEtiqueta2 = new JLabel("Aqui se mostrara lo que escribas");
        this.getContentPane().add(lblEtiqueta2);
        txtReceptor = new JTextField(20);
        this.getContentPane().add(txtReceptor);
        this.setVisible(true);
        this.setDefaultCloseOperation(E_RESIZE_CURSOR);
    }

    public static void main(String args[]) {
        ProgramEncrip ventana = new ProgramEncrip();
    }
}
