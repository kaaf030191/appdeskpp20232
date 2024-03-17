/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.business;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author KAAF0
 */
public class OperationOneBusiness extends Thread {

    private JList listTwo = null;
    private DefaultListModel<String> listTwoModel = null;

    public OperationOneBusiness(JList listOne, DefaultListModel<String> listTwoModel) {
        this.listTwo = listOne;
        this.listTwoModel = listTwoModel;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000000; i++) {
            listTwoModel.addElement("Iteración: " + i);

            int ultimoIndice = listTwo.getModel().getSize() - 1;

            if (ultimoIndice >= 0) {
                listTwo.ensureIndexIsVisible(ultimoIndice);
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(OperationOneBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
