/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codideep.app.form;

import com.codideep.app.business.OperationBusiness;
import com.codideep.app.business.OperationOneBusiness;
import javax.swing.DefaultListModel;

/**
 *
 * @author KAAF0
 */
public class FrmOperation extends javax.swing.JFrame {

     DefaultListModel<String> listOneModel = new DefaultListModel<>();
     DefaultListModel<String> listTwoModel = new DefaultListModel<>();
    
    /**
     * Creates new form FrmOperation
     */
    public FrmOperation() {
        initComponents();
        
        listOne.setModel(listOneModel);
        listTwo.setModel(listTwoModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listOne = new javax.swing.JList<>();
        btnInitProcess = new javax.swing.JButton();
        btnInitProcessTwo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTwo = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listOne);

        btnInitProcess.setText("Iniciar proceso");
        btnInitProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitProcessActionPerformed(evt);
            }
        });

        btnInitProcessTwo.setText("Iniciar proceso");
        btnInitProcessTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitProcessTwoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listTwo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInitProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInitProcessTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInitProcessTwo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInitProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitProcessActionPerformed
        new OperationBusiness().onClickBtnInitProcess(listOneModel);
    }//GEN-LAST:event_btnInitProcessActionPerformed

    private void btnInitProcessTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitProcessTwoActionPerformed
        new OperationOneBusiness(listTwo, listTwoModel).start();
    }//GEN-LAST:event_btnInitProcessTwoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitProcess;
    private javax.swing.JButton btnInitProcessTwo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listOne;
    private javax.swing.JList<String> listTwo;
    // End of variables declaration//GEN-END:variables
}