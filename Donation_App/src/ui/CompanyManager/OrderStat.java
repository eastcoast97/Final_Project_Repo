/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CompanyManager;

import Business.Company.Company;
import Business.Ecosystem;
import Business.Supplier.Order;
import Business.Supplier.SupplierDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class OrderStat extends javax.swing.JPanel {

    /**
     * Creates new form OrderStat
     */
    JPanel container;
    Ecosystem ecosystem;
    Company company;
    SupplierDirectory supplierdir;
    
    public OrderStat(JPanel container,Ecosystem ecosystem,Company company) {
        initComponents();
        this.container = container;
        this.company = company;
        this.ecosystem = ecosystem;
        supplierdir = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        populatetable();
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
        ordertbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ordercmbbx = new javax.swing.JComboBox<>();
        equipmenttf = new javax.swing.JTextField();
        supptf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        reviewta = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Equipment", "Supplier", "Status", "Review", "Order_ID", "Logistics", "Updates"
            }
        ));
        ordertbl.setGridColor(new java.awt.Color(0, 102, 153));
        ordertbl.setShowGrid(true);
        jScrollPane1.setViewportView(ordertbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 740, 210));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        ordercmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordercmbbxActionPerformed(evt);
            }
        });
        add(ordercmbbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 200, -1));
        add(equipmenttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 190, -1));
        add(supptf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 190, -1));

        jScrollPane2.setViewportView(reviewta);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 290, 97));

        jButton2.setText("Update Review");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, 50));

        jLabel1.setText("Order_ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel2.setText("Equipment");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel3.setText("Supplier");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/sarveshzeke/Downloads/bg.jpeg")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 2, 3, new java.awt.Color(0, 0, 0)));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void ordercmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordercmbbxActionPerformed
        // TODO add your handling code here:
        String orderId = (String) ordercmbbx.getSelectedItem();
        Order order = supplierdir.getOrder(orderId);
        equipmenttf.setText(order.getItem());
        supptf.setText(order.getSupplierName());
    }//GEN-LAST:event_ordercmbbxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"companyManager");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String orderId = (String) ordercmbbx.getSelectedItem();
        Order order = supplierdir.getOrder(orderId);
        order.setReview(reviewta.getText());
        populatetable();
        equipmenttf.setText("");
        reviewta.setText("");
        supptf.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField equipmenttf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> ordercmbbx;
    private javax.swing.JTable ordertbl;
    private javax.swing.JTextPane reviewta;
    private javax.swing.JTextField supptf;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        ArrayList<Order> orders = supplierdir.getOrders();
        DefaultComboBoxModel dt = new DefaultComboBoxModel();
        DefaultTableModel df = (DefaultTableModel) ordertbl.getModel();
        df.setRowCount(0);
        for(Order o: orders)
        {
            String[] row = {o.getItem(),o.getSupplierName(),o.getStatus(),o.getReview(),String.valueOf(o.getOrderId())
            ,o.getLogistics(),o.getLocaldatetime().toString()};
            df.addRow(row);
            dt.addElement(String.valueOf(o.getOrderId()));
        }
        ordertbl.setModel(df);
        ordercmbbx.setModel(dt);
        
    }
}
