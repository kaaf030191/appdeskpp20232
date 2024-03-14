/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.process;

/**
 *
 * @author KAAF0
 */
public class OperationMethodTwo implements Runnable {

    private final int x;

    public OperationMethodTwo(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 1; i <= x; i++) {
            System.out.println("Número asíncrono con Runnable: " + i);
        }
    }

}
