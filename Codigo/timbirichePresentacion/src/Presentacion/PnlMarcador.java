/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Dominio.Jugador;
import Dominio.Marcador;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro Galindo
 */
public class PnlMarcador extends javax.swing.JPanel implements ComponenteSala, Runnable {

    private Marcador marcador;

    private List<javax.swing.JPanel> pnlsFondo;
    private List<PnlJugador> pnlsJugador;

    /**
     * Creates new form PnlMarcador
     *
     * @param marcador
     */
    public PnlMarcador(Marcador marcador) {
        this.marcador = marcador;
        this.pnlsJugador = new ArrayList<>();
        this.pnlsFondo = new ArrayList<>();
        initComponents();
        this.setPreferredSize(new Dimension(300, 400));

        this.pnlsFondo.add(pnlJugador1Fondo);
        this.pnlsFondo.add(pnlJugador2Fondo);
        this.pnlsFondo.add(pnlJugador3Fondo);
        this.pnlsFondo.add(pnlJugador4Fondo);
        
        for (JPanel fondo : pnlsFondo) {
            fondo.setVisible(false);
        }
        
        establecerPnlsDeMarcador();

    }

    private synchronized void establecerPnlsDeMarcador() {
        for (int i = 0; i < this.marcador.getJugadores().size(); i++) {
            PnlJugador pnlJugador = new PnlJugador(this.marcador.getJugadores().get(i));
//            pnlJugador.setSize(pnlsFondo.get(i).getSize());
            pnlJugador.setBorder(pnlsFondo.get(i).getBorder());
            pnlsFondo.get(i).add(pnlJugador);
            pnlsFondo.get(i).setVisible(true);
            pnlsJugador.add(pnlJugador);
            
            pnlJugador.setVisible(true);
            pnlJugador.repaint();
        }
    }

    public Marcador getMarcador() {
        return marcador;
    }

    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJugador1Fondo = new javax.swing.JPanel();
        pnlJugador2Fondo = new javax.swing.JPanel();
        pnlJugador3Fondo = new javax.swing.JPanel();
        pnlJugador4Fondo = new javax.swing.JPanel();

        pnlJugador1Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador1Fondo.setMaximumSize(new java.awt.Dimension(280, 80));
        pnlJugador1Fondo.setMinimumSize(new java.awt.Dimension(280, 80));
        pnlJugador1Fondo.setPreferredSize(new java.awt.Dimension(280, 80));

        javax.swing.GroupLayout pnlJugador1FondoLayout = new javax.swing.GroupLayout(pnlJugador1Fondo);
        pnlJugador1Fondo.setLayout(pnlJugador1FondoLayout);
        pnlJugador1FondoLayout.setHorizontalGroup(
            pnlJugador1FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        pnlJugador1FondoLayout.setVerticalGroup(
            pnlJugador1FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        pnlJugador2Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador2Fondo.setMaximumSize(new java.awt.Dimension(280, 80));
        pnlJugador2Fondo.setMinimumSize(new java.awt.Dimension(280, 80));
        pnlJugador2Fondo.setPreferredSize(new java.awt.Dimension(280, 80));

        javax.swing.GroupLayout pnlJugador2FondoLayout = new javax.swing.GroupLayout(pnlJugador2Fondo);
        pnlJugador2Fondo.setLayout(pnlJugador2FondoLayout);
        pnlJugador2FondoLayout.setHorizontalGroup(
            pnlJugador2FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        pnlJugador2FondoLayout.setVerticalGroup(
            pnlJugador2FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        pnlJugador3Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador3Fondo.setMaximumSize(new java.awt.Dimension(280, 80));
        pnlJugador3Fondo.setMinimumSize(new java.awt.Dimension(280, 80));
        pnlJugador3Fondo.setPreferredSize(new java.awt.Dimension(280, 80));

        javax.swing.GroupLayout pnlJugador3FondoLayout = new javax.swing.GroupLayout(pnlJugador3Fondo);
        pnlJugador3Fondo.setLayout(pnlJugador3FondoLayout);
        pnlJugador3FondoLayout.setHorizontalGroup(
            pnlJugador3FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        pnlJugador3FondoLayout.setVerticalGroup(
            pnlJugador3FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        pnlJugador4Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador4Fondo.setMaximumSize(new java.awt.Dimension(280, 80));
        pnlJugador4Fondo.setMinimumSize(new java.awt.Dimension(280, 80));
        pnlJugador4Fondo.setPreferredSize(new java.awt.Dimension(280, 80));

        javax.swing.GroupLayout pnlJugador4FondoLayout = new javax.swing.GroupLayout(pnlJugador4Fondo);
        pnlJugador4Fondo.setLayout(pnlJugador4FondoLayout);
        pnlJugador4FondoLayout.setHorizontalGroup(
            pnlJugador4FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        pnlJugador4FondoLayout.setVerticalGroup(
            pnlJugador4FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlJugador1Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJugador2Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJugador4Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJugador3Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJugador1Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlJugador2Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlJugador3Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlJugador4Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actualizar() {
        establecerPnlsDeMarcador();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlJugador1Fondo;
    private javax.swing.JPanel pnlJugador2Fondo;
    private javax.swing.JPanel pnlJugador3Fondo;
    private javax.swing.JPanel pnlJugador4Fondo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        establecerPnlsDeMarcador();
    }
}
