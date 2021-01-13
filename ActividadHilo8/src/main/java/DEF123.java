/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author MyC
 */
public class DEF123 extends Thread {
    public boolean c1 = true;
    static Act8 Actdef = new Act8();
    int contador = 0;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    @Override
    public void run() {
       while (c1) {
           contador = contador + 1;
           Actdef.correr(getContador());
           try {
               sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500 , 350);
        frame.add(Actdef);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}