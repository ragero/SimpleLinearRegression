/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import configuracao.ConfiguracaoGeral;
import regressao.Regressao;

/**
 *
 * @author rafael
 */
public class Formulario_Algoritmos extends javax.swing.JInternalFrame {

    private ConfiguracaoGeral configuracao;
    
    public Formulario_Algoritmos() {
        initComponents();
        configuracao = new ConfiguracaoGeral();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cCorrelacao = new javax.swing.JCheckBox();
        cPerceptron = new javax.swing.JCheckBox();
        bRegredir = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Algoritmos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Algoritmos"));

        cCorrelacao.setText("Correlação");

        cPerceptron.setText("Perceptron");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cCorrelacao)
                    .addComponent(cPerceptron))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cCorrelacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPerceptron)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bRegredir.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bRegredir.setText("Regredir");
        bRegredir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegredirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(bRegredir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bRegredir)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegredirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegredirActionPerformed
        
        configuracao.setCorrelacao(cCorrelacao.isSelected());
        configuracao.setPerceptron(cPerceptron.isSelected());
        
        Regressao regressao = new Regressao();
        regressao.aprender(configuracao);
        
    }//GEN-LAST:event_bRegredirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegredir;
    private javax.swing.JCheckBox cCorrelacao;
    private javax.swing.JCheckBox cPerceptron;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}