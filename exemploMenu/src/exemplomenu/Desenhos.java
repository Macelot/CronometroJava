/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomenu;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author marcelo
 */
public class Desenhos extends javax.swing.JInternalFrame {

    static class roda implements Runnable{

        @Override
        public void run() {
            for (;;) {
                int r,g,b;
                double x,y,s;
                for (int i = 0; i < 10; i++) {
                     r =(int)(Math.random()*255);
                     g =(int)(Math.random()*255);
                     b =(int)(Math.random()*255);
                     x=(double)(Math.random()*.9);
                     y=(double)(Math.random()*.9);
                     s=(double)(Math.random()*.3);
                     StdDraw.setPenColor(new Color(r,g,b));
                     StdDraw.filledSquare(x,y,s);
                 }    
                try {
                    Thread.sleep(jSlider1.getValue()*10);
                } catch (Exception e) {
                }
            }
        }
    
    }
    /**
     * Creates new form Desenhos
     */
    public Desenhos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Brasil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(36, 36, 36)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double p;
        for (double i = .5; i < 10; i++) {
            p=i/10;
            int r,g,b;
            Random sorteio;
            sorteio = new Random();
            r=(int)sorteio.nextInt(255);
            g=(int)sorteio.nextInt(255);
            b=(int)sorteio.nextInt(255);
            StdDraw.setPenColor(r,g,b);
            StdDraw.filledSquare(p, p, .05);
            r=(int)sorteio.nextInt(255);
            g=(int)sorteio.nextInt(255);
            b=(int)sorteio.nextInt(255);
            StdDraw.setPenColor(r,g,b);
            StdDraw.filledSquare(p, 1-p, .05);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int r,g,b;
       double x,y;
       for (int i = 0; i < 10; i++) {
            r =(int)(Math.random()*255);
            g =(int)(Math.random()*255);
            b =(int)(Math.random()*255);
            x=(i+1)/10.0;
            y=(i+1)/10.0;
            StdDraw.setPenColor(new Color(r,g,b));
            StdDraw.filledSquare(x,y, .2);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        StdDraw.setPenColor(new Color(0,153,0));
        double[] x1 = { .1, .1, .9, .9};
        double[] y1 = { .3, .7, .7, .3};
        StdDraw.filledPolygon(x1, y1);
       
        StdDraw.setPenColor(Color.YELLOW);
        double[] x = { .1, .5, .9, .5};
        double[] y = { .5, .7, .5, .3};
        StdDraw.filledPolygon(x, y);

        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledCircle(.5, .5, .17);
        
        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.arc(.42, .06, .5, 61, 98);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         int r,g,b;
       double x,y,s;
       for (int i = 0; i < 10; i++) {
            r =(int)(Math.random()*255);
            g =(int)(Math.random()*255);
            b =(int)(Math.random()*255);
            x=(double)(Math.random()*.9);
            y=(double)(Math.random()*.9);
            s=(double)(Math.random()*.3);
            StdDraw.setPenColor(new Color(r,g,b));
            StdDraw.filledSquare(x,y,s);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        roda r;
        r = new roda();
        Thread t;
        t = new Thread(r);
        t.start();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}