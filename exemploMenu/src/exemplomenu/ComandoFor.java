/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomenu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcelo
 */
public class ComandoFor extends javax.swing.JInternalFrame {
    static class A implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000000000; i++) {
                System.out.println("AAAAAAAAAAAAAAAAAA");
            }
        }
    }
    static class B implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100000000; i++) {
                System.out.println("BBBBBBBBBBBBBBBBB");
            }
        }
    }
    static class Roda implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                int v;
                v=i+1;
                jTextField1.setText(v+"");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
        
    }
    static class Cron implements Runnable{
        @Override
        public void run() {
            int i=Integer.parseInt(txtSeg.getText());
            for (;;) {
                txtSeg.setText(i+"");
                i++;
                if(i==59)
                    i=0;
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    
                }
            }
        }
    }
        
    static class CronMinuto implements Runnable{
        @Override
        public void run() {
            int i=Integer.parseInt(txtMin.getText());
            for (;;) {
                txtMin.setText(i+"");
                i++;
                if(i==59)
                    i=0;
                try {
                    Thread.sleep(60000);
                } catch (Exception e) {
                    
                }
            }
        }
    }
    static class CronMilesimo implements Runnable{
        @Override
        public void run() {
            int i=Integer.parseInt(txtMil.getText());
            for (;;) {
                txtMil.setText(i+"");
                i++;
                if(i==1000)
                    i=0;
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    
                }
            }
        }
        
    }
    
    /**
     * Creates new form ComandoFor
     */
    public ComandoFor() {
        initComponents();
    }
    Thread t,t2,t3;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        txtMin = new javax.swing.JTextField();
        txtSeg = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        txtMil = new javax.swing.JTextField();
        btnVolta = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton1.setText("1 até 10");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Comando FOR");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setText("0");

        jButton2.setText("1 até 10 Thread");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Duas Thread");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Max Int");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Alfabeto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtMin.setText("0");

        txtSeg.setText("0");

        btnIniciar.setBackground(new java.awt.Color(102, 255, 0));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        txtMil.setText("0");

        btnVolta.setText("Volta");
        btnVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaActionPerformed(evt);
            }
        });

        jButton6.setText("Stop");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Start");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7)
                                    .addComponent(jButton6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(197, 197, 197))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(84, 84, 84))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton7)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMil, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
            int v=i+1;
            jTextField1.setText(v+"");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
             
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Roda r;
        r=new Roda();
        Thread t;
        t=new Thread(r);
        t.start();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        A a;
        a=new A();
        Thread t;
        t=new Thread(a);
        t.start();
        B b;
        b=new B();
        Thread t2;
        t2=new Thread(b);
        t2.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a;
        a=Integer.MAX_VALUE;
        System.out.println(a);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Object[] c;
        c=new Object[2];
        Object[][] l;
        l=new Object[26][2];
        c[0]="Posição";
        c[1]="Letra";
        int letra=65;
        for (int i = 0; i < 26; i++) {
            l[i][0]=(i+1);
            l[i][1]=(char)letra++;
        }
        DefaultTableModel d;
        d=new DefaultTableModel(l, c);
        jTable1.setModel(d);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        btnIniciar.setBackground(Color.RED);
        Cron cron;
        cron = new Cron();
       
        t = new Thread(cron);
        t.start();
        
        CronMinuto cronMinuto;
        cronMinuto = new CronMinuto();
       
        t2 = new Thread(cronMinuto);
        t2.start();
        
        CronMilesimo cronMilesimo;
        cronMilesimo = new CronMilesimo();
       
        t3 = new Thread(cronMilesimo);
        t3.start();
        
    }//GEN-LAST:event_btnIniciarActionPerformed
    int clicou=0;
    private void btnVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaActionPerformed
        // TODO add your handling code here:
        if(clicou==0){
           Object[] col;
           col = new Object[3];
           col[0]="Volta";
           col[1]="Hora";
           col[2]="Duração Total";
           Object[][] lin;
           lin=new Object[1][3];
           lin[0][0]="1";
           lin[0][1]=txtMin.getText()+":"+txtSeg.getText()+":"+txtMil.getText();
           lin[0][2]=txtMin.getText()+":"+txtSeg.getText()+":"+txtMil.getText();
           DefaultTableModel tm;
           tm = new DefaultTableModel(lin, col);
           jTable1.setModel(tm);
           clicou=1;
        }else{
            //JOptionPane.showMessageDialog(this, "clicou");
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            Object[] lin;
            lin = new Object[3];
            lin[0]=tm.getRowCount()+1;
            //lin[1]=txtMin.getText()+":"+txtSeg.getText()+":"+txtMil.getText();
            lin[2]=txtMin.getText()+":"+txtSeg.getText()+":"+txtMil.getText();
            System.out.println("Somar");
            int min=Integer.parseInt(txtMin.getText());
            int seg=Integer.parseInt(txtSeg.getText());
            int mil=Integer.parseInt(txtMil.getText());
            
            System.out.println(min+" "+seg+" "+mil);
            Object tudo = jTable1.getModel().getValueAt(tm.getRowCount()-1, 2);
            System.out.println(tudo);
            String minSegMil = (String)tudo;
            String[] tem=minSegMil.split(":");
            int min2=Integer.parseInt(tem[0]);
            int seg2=Integer.parseInt(tem[1]);
            int mil2=Integer.parseInt(tem[2]);
            
            int minResp;
            int segResp;
            int milResp;
            minResp=min-min2;
            segResp=seg-seg2;
            milResp=mil-mil2;
            System.out.println("..."+segResp);
            
            lin[1]=minResp+":"+segResp+":"+Math.abs(milResp);
            tm.addRow(lin);
        }
    }//GEN-LAST:event_btnVoltaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
            t.stop();
            t2.stop();
            t3.stop();
        
        
                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            t.notify();
            t2.notify();
            t3.notify();
        } catch (Exception ex) {
            Logger.getLogger(ComandoFor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVolta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField txtMil;
    public static javax.swing.JTextField txtMin;
    public static javax.swing.JTextField txtSeg;
    // End of variables declaration//GEN-END:variables
}