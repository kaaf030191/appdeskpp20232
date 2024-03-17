/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.business;

import javax.swing.DefaultListModel;

/**
 *
 * @author KAAF0
 */
public class OperationBusiness {

    public void onClickBtnInitProcess(DefaultListModel listOneModel) {
        for (int i = 1; i <= 10000000; i++) {
            listOneModel.addElement("Iteración: " + i);
        }
    }
}
