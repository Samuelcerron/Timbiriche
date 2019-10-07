/**
 * PnlJugador.java
 */
package Presentacion;

import Dominio.Jugador;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 * JPanel que despliega la informacion de un jugador.
 * 
 * @author Alejandro Galindo
 */
public class PnlJugador extends javax.swing.JPanel {

    /**
     * Instancia del jugador al desplegar.
     */
    private Jugador jugador;

    /**
     * Crea PnlJugador.
     */
    public PnlJugador(Jugador jugador) {
        initComponents();
        this.setSize(new Dimension(280, 80));
        this.jugador = jugador;
        if(!this.jugador.getRutaAvatar().equalsIgnoreCase("")){
            this.labelAvt.setIcon(new ImageIcon("src\\Avatares\\" + this.jugador.getRutaAvatar()));
        }
        this.labelNick.setText(this.jugador.getNombre());
        this.labelPtj.setText(this.jugador.getPuntaje() + "");
        if(this.jugador.getColor() != null){
            this.setBackground(Color.decode(this.jugador.getColor()));
        }
    }
    
    /**
     * Establece el jugador.
     * @param jugador 
     */
    public void setJugador(Jugador jugador){
        this.jugador = jugador;
    }
    
    /**
     * Establece el puntaje de un jugador.
     * @param puntaje 
     */
    public void setPuntaje(int puntaje){
        this.jugador.setPuntaje(puntaje);
        this.labelPtj.setText(puntaje + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAvt = new javax.swing.JLabel();
        labelPtj = new javax.swing.JLabel();
        labelNick = new javax.swing.JLabel();

        labelAvt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelAvt.setMaximumSize(new java.awt.Dimension(50, 50));
        labelAvt.setMinimumSize(new java.awt.Dimension(50, 50));
        labelAvt.setPreferredSize(new java.awt.Dimension(50, 50));

        labelPtj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPtj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPtj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPtj.setMaximumSize(new java.awt.Dimension(50, 50));
        labelPtj.setMinimumSize(new java.awt.Dimension(50, 50));
        labelPtj.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNick, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPtj, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPtj, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAvt;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelPtj;
    // End of variables declaration//GEN-END:variables
}