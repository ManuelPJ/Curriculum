
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyC
 */
public class Act8 extends javax.swing.JPanel {

    /**
     * Creates new form Act8
     */
    public Act8() {
        initComponents();
    }

    DEF123 def = new DEF123();
    Hilo2 hilo2 = new Hilo2();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Comenzar = new javax.swing.JButton();
        InterrumpirHilo1 = new javax.swing.JButton();
        InterrumpirHilo2 = new javax.swing.JButton();
        Hilo1 = new javax.swing.JTextField();
        Hilo2 = new javax.swing.JTextField();
        Terminar = new javax.swing.JButton();
        RenaudarH1 = new javax.swing.JButton();
        RenaudarH2 = new javax.swing.JButton();
        Hilo2est = new javax.swing.JLabel();
        Hilo1est = new javax.swing.JLabel();

        Comenzar.setText("Comenzar Proceso");
        Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarActionPerformed(evt);
            }
        });

        InterrumpirHilo1.setText("Interrumpir");
        InterrumpirHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterrumpirHilo1ActionPerformed(evt);
            }
        });

        InterrumpirHilo2.setText("Interrumpir");
        InterrumpirHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterrumpirHilo2ActionPerformed(evt);
            }
        });

        Hilo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Hilo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Terminar.setText("Terminar Proceso");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });

        RenaudarH1.setText("RenaudarH1");
        RenaudarH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenaudarH1ActionPerformed(evt);
            }
        });

        RenaudarH2.setText("RenaudarH2");
        RenaudarH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenaudarH2ActionPerformed(evt);
            }
        });

        Hilo2est.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hilo2est.setText("Hilo 2");

        Hilo1est.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hilo1est.setText("Hilo 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InterrumpirHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RenaudarH1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hilo1est, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hilo2est, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterrumpirHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(RenaudarH2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hilo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Comenzar)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InterrumpirHilo1)
                        .addGap(18, 18, 18)
                        .addComponent(RenaudarH1)
                        .addGap(25, 25, 25)
                        .addComponent(Hilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hilo1est, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InterrumpirHilo2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RenaudarH2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(Hilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hilo2est, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(Terminar)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarActionPerformed
        if (def.getContador() == 0) {

            def.start();
            hilo2.start();
            Terminar.setEnabled(true);
            Comenzar.setEnabled(false);
            RenaudarH1.setEnabled(false);
            RenaudarH2.setEnabled(false);
            InterrumpirHilo1.setEnabled(true);
            InterrumpirHilo2.setEnabled(true);
            Hilo1est.setText(String.valueOf(def.getState()));
            Hilo2est.setText(String.valueOf(hilo2.getState()));
        }else{
            def.resume();
            hilo2.resume();
            Terminar.setEnabled(true);
            Comenzar.setEnabled(false);
            RenaudarH1.setEnabled(false);
            RenaudarH2.setEnabled(false);
            InterrumpirHilo1.setEnabled(true);
            InterrumpirHilo2.setEnabled(true);
            Hilo1est.setText(String.valueOf(def.getState()));
            Hilo2est.setText(String.valueOf(hilo2.getState()));

        }

    }//GEN-LAST:event_ComenzarActionPerformed

    public void correr(int contador){
        Hilo1.setText(Integer.toString(contador));
    }
    public void correr2(int contador){
        Hilo2.setText(Integer.toString(contador));
    }
    private void InterrumpirHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterrumpirHilo1ActionPerformed
        def.suspend();
        RenaudarH1.setEnabled(true);
        Hilo1est.setText(String.valueOf(def.getState()));

    }//GEN-LAST:event_InterrumpirHilo1ActionPerformed

    private void InterrumpirHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterrumpirHilo2ActionPerformed
        hilo2.suspend();
        RenaudarH2.setEnabled(true);
        Hilo2est.setText(String.valueOf(hilo2.getState()));
    }//GEN-LAST:event_InterrumpirHilo2ActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed
        def.suspend();
        hilo2.suspend();
        Terminar.setEnabled(false);
        Comenzar.setEnabled(true);
        RenaudarH1.setEnabled(true);
        RenaudarH2.setEnabled(true);
        InterrumpirHilo1.setEnabled(false);
        InterrumpirHilo2.setEnabled(false);
        Hilo1est.setText(String.valueOf(def.getState()));
        Hilo2est.setText(String.valueOf(hilo2.getState()));
    }//GEN-LAST:event_TerminarActionPerformed

    private void RenaudarH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenaudarH1ActionPerformed
        def.resume();
        RenaudarH1.setEnabled(false);
        InterrumpirHilo1.setEnabled(true);
        Hilo1est.setText(String.valueOf(def.getState()));
    }//GEN-LAST:event_RenaudarH1ActionPerformed

    private void RenaudarH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenaudarH2ActionPerformed
        hilo2.resume();
        RenaudarH2.setEnabled(false);
        InterrumpirHilo2.setEnabled(true);
        Hilo2est.setText(String.valueOf(hilo2.getState()));
    }//GEN-LAST:event_RenaudarH2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comenzar;
    private javax.swing.JTextField Hilo1;
    private javax.swing.JLabel Hilo1est;
    private javax.swing.JTextField Hilo2;
    private javax.swing.JLabel Hilo2est;
    private javax.swing.JButton InterrumpirHilo1;
    private javax.swing.JButton InterrumpirHilo2;
    private javax.swing.JButton RenaudarH1;
    private javax.swing.JButton RenaudarH2;
    private javax.swing.JButton Terminar;
    // End of variables declaration//GEN-END:variables
}
