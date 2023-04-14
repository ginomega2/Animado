package MoverConteclado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    Image enemy;
    ImageIcon titan = new ImageIcon(getClass().getResource("titanPatadaMini1.png"));
//    ImageIcon whastapp = new ImageIcon(getClass().getResource("whatsapp.png"));
    JLabel lblTitan = new JLabel("itan");
    JLabel lblTitan2 = new JLabel("itan");

    int inicio =0;
    int fin =10;
    int contador=0;
    ImageIcon [] sprites = new ImageIcon[fin];
    ImageIcon [] sprites2 = new ImageIcon[fin];

    MyFrame(){
//
////        enemy=new ImageIcon(getClass().getResource("titanPatadaMini1.png")).getImage();
        sprites[0]=new ImageIcon(getClass().getResource("titanPatadaMini1.png"));
        sprites[1]=new ImageIcon(getClass().getResource("titanPatadaMini2.png"));
        sprites[2]=new ImageIcon(getClass().getResource("titanPatadaMini3.png"));
        sprites[3]=new ImageIcon(getClass().getResource("titanPatadaMini4.png"));
        sprites[4]=new ImageIcon(getClass().getResource("titanPatadaMini5.png"));
        sprites[5]=new ImageIcon(getClass().getResource("titanPatadaMini4.png"));
        sprites[6]=new ImageIcon(getClass().getResource("titanPatadaMini3.png"));
        sprites[7]=new ImageIcon(getClass().getResource("titanPatadaMini2.png"));
        sprites[8]=new ImageIcon(getClass().getResource("titanPatadaMini1.png"));
        sprites[9]=new ImageIcon(getClass().getResource("titanPatadaMini1.png"));


//        enemy=new ImageIcon(getClass().getResource("titanPatadaMini1.png")).getImage();
        sprites2[0]=new ImageIcon(getClass().getResource("titanpoder1.png"));
        sprites2[1]=new ImageIcon(getClass().getResource("titanpoder2.png"));
        sprites2[2]=new ImageIcon(getClass().getResource("titanpoder3.png"));
        sprites2[3]=new ImageIcon(getClass().getResource("titanpoder4.png"));
        sprites2[4]=new ImageIcon(getClass().getResource("titanpoder5.png"));
        sprites2[5]=new ImageIcon(getClass().getResource("titanpoder6.png"));
        sprites2[6]=new ImageIcon(getClass().getResource("titanpoder5.png"));
        sprites2[7]=new ImageIcon(getClass().getResource("titanpoder4.png"));
        sprites2[8]=new ImageIcon(getClass().getResource("titanpoder3.png"));
        sprites2[9]=new ImageIcon(getClass().getResource("titanpoder2.png"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500 );
        this.addKeyListener(this);
        this.setLayout(null);


        lblTitan= new JLabel();
        lblTitan.setBounds(0,0,300,200);
        lblTitan.setIcon(sprites[0]);
//        lblTitan.setBackground(Color.red);
        lblTitan.setOpaque(true);
        this.add(lblTitan);


        lblTitan2=new JLabel();
        lblTitan2.setBounds(0,300,300,200);
        lblTitan2.setIcon(sprites2[0]);
//        lblTitan.setBackground(Color.red);
        lblTitan2.setOpaque(true);
        this.add(lblTitan2);


        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("se escribio con una tecka");
        switch (e.getKeyChar()){
            case 'a':
                if(contador==fin-1){
                    contador=0;
                }else contador++;
                lblTitan.setIcon(sprites[contador]);
                lblTitan.setLocation(lblTitan.getX()-1,lblTitan.getY());
                lblTitan2.setIcon(sprites2[contador]);
                lblTitan2.setLocation(lblTitan2.getX()-1,lblTitan2.getY());

                break;
            case 'd':
                lblTitan.setLocation(lblTitan.getX()+1,lblTitan.getY());
                lblTitan2.setLocation(lblTitan2.getX()+1,lblTitan2.getY());

                break;
            case 'w':
                lblTitan.setLocation(lblTitan.getX(),lblTitan.getY()-1);
                lblTitan2.setLocation(lblTitan2.getX(),lblTitan2.getY()-1);

                break;
            case 's':
                lblTitan.setLocation(lblTitan.getX(),lblTitan.getY()+1);
                lblTitan2.setLocation(lblTitan2.getX(),lblTitan2.getY()+1);

                break;



        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("tecla presinada");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("teclaliberada " +e.getKeyChar());
        System.out.println("codigo de tecla "+e.getKeyCode());

    }
}
