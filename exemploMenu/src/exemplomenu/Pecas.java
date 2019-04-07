/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomenu;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JList;

/**
 *
 * @author marcelo
 */
public class Pecas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pecas
     */
    public Pecas() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lisCarro = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        txtCarro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnCor = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Peças");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 105, 44);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome da peça");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 200, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 70, 370, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 110, 200, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Original");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(220, 110, 130, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Paralela");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(370, 110, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direita", "Esquerda", "Cima", "Baixo" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(220, 150, 370, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Posição");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 200, 30);

        jScrollPane1.setViewportView(lisCarro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 230, 160, 80);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Carros que aceitam a peça");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 190, 200, 30);
        getContentPane().add(txtCarro);
        txtCarro.setBounds(220, 190, 310, 30);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 190, 41, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(2);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(220, 320, 310, 60);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Observações");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 320, 200, 30);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 390, 200, 30);

        jButton2.setText("Selecione a cor da peça");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 390, 230, 30);

        btnCor.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btnCor);
        btnCor.setBounds(460, 390, 70, 30);

        setBounds(0, 0, 635, 569);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Color cor;
        cor = JColorChooser.showDialog(this, "Selecione a cor da peça", Color.BLACK);
        btnCor.setBackground(cor);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList cont;
        cont = new ArrayList();
        int quant;
        quant =lisCarro.getModel().getSize();
        
        for (int j=0; j<quant; j++){
            cont.add(lisCarro.getModel().getElementAt(j));
        }
        DefaultListModel listModel;
        listModel = new DefaultListModel();
        listModel.removeAllElements();
        lisCarro = new JList(listModel);  
        jScrollPane1.setViewportView(lisCarro);

        for (int j=0; j<quant; j++){
              listModel.addElement(cont.get(j));
        }
        
        listModel.addElement(txtCarro.getText());

        lisCarro = new JList(listModel);  
        jScrollPane1.setViewportView(lisCarro);
        txtCarro.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lisCarro;
    private javax.swing.JTextField txtCarro;
    // End of variables declaration//GEN-END:variables
}