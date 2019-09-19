/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Dominio.Linea;
import Dominio.Punto;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Galindo
 */
public class pnlTablero extends javax.swing.JPanel implements MouseListener {

    List<Linea> lineas = new ArrayList<>();
    List<Punto> puntos = new ArrayList<>();

    int jugadores = 0;
    double distanciaEntrePuntos = 0;

    Punto puntoInicio;

    /**
     * Creates new form panelTablero
     */
    public pnlTablero() {
        initComponents();
        this.setVisible(true);

        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setBackground(Color.WHITE);

        //Empezar a dibujar
        for (Punto punt : puntos) {
            g2.setColor(Color.BLACK);
            g2.fillOval(punt.getA(), punt.getB(), 10 - jugadores, 10 - jugadores);
        }

        for (Linea linea : lineas) {
            g2.setColor(Color.BLUE);
            g2.drawLine(linea.getPuntoA().getA() + (10 - jugadores)/2, linea.getPuntoA().getB() + (10 - jugadores)/2,
                     linea.getPuntoB().getA() + (10 - jugadores)/2, linea.getPuntoB().getB() + (10 - jugadores)/2);
        }
    }

    public void estableceTablero(int jugadores) {
        puntos.clear();
        lineas.clear();

        creaPuntos(jugadores);
    }

    private void creaPuntos(int numJugadores) {
        // Crea una variable para saber la distanciaEntrePuntos entre los puntos a dibujar
        // En un tablero de 10x10, es el 92% dividido entre 9
        // En un tablero de 20x20, es el 92% dividido entre 19
        // En un tablero de 40x40, es el 92% dividido entre 39

        this.jugadores = numJugadores;

        switch (this.jugadores) {
            case 2:
                distanciaEntrePuntos = (getHeight() * .92) / 9;
                break;
            case 3:
                distanciaEntrePuntos = (getHeight() * .92) / 19;
                break;
            case 4:
                distanciaEntrePuntos = (getHeight() * .92) / 39;
                break;
        }

        // Crea los puntos del tablero y los guarda en el arrayList
        // Empieza 3% del tamano total a la derecha y abajo, en la esquina superior izquierda y termina dejando un margen de 3%
        // Doble for, primero para vertical y luego para horizontal
        for (double i = (getHeight() * .03); i <= (getHeight() * .97); i += distanciaEntrePuntos) {
            for (double j = (getWidth() * .03); j <= (getWidth() * .97); j += distanciaEntrePuntos) {
                // Crea y guarda el punto
                puntos.add(new Punto((int) i, (int) j));
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mouseClicked(MouseEvent me) {
        Point click = me.getPoint();
        Punto puntoClick = new Punto((int) click.getX(), (int) click.getY());
        System.out.println("Picando! " + puntoClick.getA() + " - " + puntoClick.getB());
        
        if(this.puntoInicio != null){
            for (Punto punto : puntos) {
                if(tocaPunto(punto, puntoClick)){
                    Linea linea = new Linea(puntoInicio, punto);
                    if(distanciaEntreDosPuntos(puntoInicio, punto) > distanciaEntrePuntos || lineas.contains(linea)){
                        return;
                    }
                    
                    lineas.add(linea);
                    puntoInicio = null;
                    repaint();
                    return;
                }
            }
        }else{
            for (Punto punto : puntos) {
                if(tocaPunto(punto, puntoClick)){
                    this.puntoInicio = punto;
                    return;
                }
            }
        }
    }

    private double distanciaEntreDosPuntos(Punto A, Punto B) {
        return Math.sqrt(Math.pow((A.getA() - B.getA()), 2) + Math.pow((A.getB() - B.getB()), 2));
    }
    
    private boolean tocaPunto(Punto A, Punto B){
        if ((B.getA() > A.getA() && B.getA() < A.getA() + (10 - jugadores))
                && (B.getB() > A.getB() && B.getB() < A.getB() + (10 - jugadores))){
            return true;
        }
        return false;
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
