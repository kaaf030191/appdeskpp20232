/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app;

import com.codideep.app.form.FrmOperation;
import com.codideep.app.process.OperationMethodOne;
import com.codideep.app.process.Operation;
import com.codideep.app.process.OperationMethodTwo;

/**
 *
 * @author KAAF0
 */
public class Main {

    public static void main(String[] args) {

//        OperationMethodOne operationMethodOne = new OperationMethodOne(1000000);
//        operationMethodOne.start();
//        
//        OperationMethodTwo operationMethodTwo = new OperationMethodTwo(1000000);
//        Thread thread = new Thread(operationMethodTwo);
//        thread.start();
//        
//        Operation operation = new Operation();
//        operation.printNumbers(100000);
        
        FrmOperation frmOperation = new FrmOperation();
        
        frmOperation.setVisible(true);
    }
}
