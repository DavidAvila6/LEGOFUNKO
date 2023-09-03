/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Fabrica.Factoria;
import Fabrica.Partes;
import controlador.puente;
import javax.swing.ImageIcon;
/**
 *
 * @author David
 */
public class Pecho extends javax.swing.JFrame  {
     Partes f = Factoria.getParte("cuerpo");

    /**
     * Creates new form Scrollbar
     */
    public Pecho() {
        initComponents();
        
       
        
         ImageIcon ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo1p.png"));
         puente.controladorico(PB1,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo2p.png"));
         puente.controladorico(PB2,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo3p.png"));
         puente.controladorico(PB3,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo4p.png"));
         puente.controladorico(PB4,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo5p.png"));
         puente.controladorico(PB5,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo6p.png"));
         puente.controladorico(PB6,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo7p.png"));
         puente.controladorico(PB7,ico);
        
         ico = new ImageIcon(getClass().getResource("/imgpecho/cuerpo8p.png"));
         puente.controladorico(PB8,ico);
         puente.controladorfon(jPanel1,"/img/fp.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PB1 = new javax.swing.JButton();
        PB2 = new javax.swing.JButton();
        PB3 = new javax.swing.JButton();
        PB4 = new javax.swing.JButton();
        PB5 = new javax.swing.JButton();
        PB6 = new javax.swing.JButton();
        PB7 = new javax.swing.JButton();
        PB8 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ropa");

        PB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB1ActionPerformed(evt);
            }
        });

        PB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB2ActionPerformed(evt);
            }
        });

        PB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB3ActionPerformed(evt);
            }
        });

        PB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB4ActionPerformed(evt);
            }
        });

        PB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB5ActionPerformed(evt);
            }
        });

        PB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB6ActionPerformed(evt);
            }
        });

        PB7.setText(" ");
        PB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB7ActionPerformed(evt);
            }
        });

        PB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PB7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PB8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PB4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PB5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(PB6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(PB1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PB2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(251, 251, 251)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(PB3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PB2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PB1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PB3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PB5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PB4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PB6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PB7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PB8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB2ActionPerformed
        puente.controladorimg(f, "2");
    }//GEN-LAST:event_PB2ActionPerformed

    private void PB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB1ActionPerformed
         puente.controladorimg(f, "1");
    }//GEN-LAST:event_PB1ActionPerformed

    private void PB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB3ActionPerformed
         puente.controladorimg(f, "3");
    }//GEN-LAST:event_PB3ActionPerformed

    private void PB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB4ActionPerformed
         puente.controladorimg(f, "4");
    }//GEN-LAST:event_PB4ActionPerformed

    private void PB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB5ActionPerformed
        puente.controladorimg(f, "5");
    }//GEN-LAST:event_PB5ActionPerformed

    private void PB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB6ActionPerformed
         puente.controladorimg(f, "6");
    }//GEN-LAST:event_PB6ActionPerformed

    private void PB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB7ActionPerformed
         puente.controladorimg(f, "7");
    }//GEN-LAST:event_PB7ActionPerformed

    private void PB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB8ActionPerformed
        puente.controladorimg(f, "8");
    }//GEN-LAST:event_PB8ActionPerformed
       
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PB1;
    private javax.swing.JButton PB2;
    private javax.swing.JButton PB3;
    private javax.swing.JButton PB4;
    private javax.swing.JButton PB5;
    private javax.swing.JButton PB6;
    private javax.swing.JButton PB7;
    private javax.swing.JButton PB8;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
