/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EquipmentSupplierRole;

import Business.Ecosystem;
import Business.Logistics.Logistic;
import Business.Supplier.Order;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class ManageOrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    SupplierDirectory supplierdir;
    Supplier supplier;
    
    public ManageOrdersPanel(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        supplierdir = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        supplier = supplierdir.getSupplier(ua);
        populatetable();
        populatecombo();
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
        manageorderstbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        orderidcmbbx = new javax.swing.JComboBox<>();
        companytf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        equipmenttf = new javax.swing.JTextField();
        logisticscmbbx = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        manageorderstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Equipment_Type", "Quantity", "Company name", "Status", "Review", "Logistics", "Updated date", "Order_ID"
            }
        ));
        jScrollPane1.setViewportView(manageorderstbl);

        jButton1.setText("Back");

        jButton2.setText("Accept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Decline");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        orderidcmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderidcmbbxActionPerformed(evt);
            }
        });

        jLabel1.setText("Order_ID");

        jLabel2.setText("Company");

        jLabel3.setText("Equipment");

        jLabel4.setText("Logistics");

        jButton4.setText("Assign");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(184, 574, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(companytf)
                            .addComponent(orderidcmbbx, 0, 143, Short.MAX_VALUE)
                            .addComponent(equipmenttf)
                            .addComponent(logisticscmbbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(297, 297, 297))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderidcmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(companytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipmenttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logisticscmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderidcmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidcmbbxActionPerformed
        // TODO add your handling code here:
        Order order = supplierdir.getOrder((String) orderidcmbbx.getSelectedItem());
        equipmenttf.setText(order.getItem());
        companytf.setText(order.getCompanyName());
    }//GEN-LAST:event_orderidcmbbxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Order order = supplierdir.getOrder((String) orderidcmbbx.getSelectedItem());
        order.setLogistics((String) logisticscmbbx.getSelectedItem());
        populatetable();
        equipmenttf.setText("");
        companytf.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) manageorderstbl.getModel();
        int selectedRow = manageorderstbl.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select and proceed");return;}
        String orderId = df.getValueAt(selectedRow,7).toString();
        String item = df.getValueAt(selectedRow,0).toString();
        int quantity = Integer.parseInt(df.getValueAt(selectedRow,1).toString());
        Order order = supplierdir.getOrder(orderId);
        order.setStatus("Order Accepted");
        HashMap<String,Integer> equipment = supplier.getEquipment();
        int count = equipment.get(item);
        count = count - quantity;
        equipment.put(item, count);
        populatetable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) manageorderstbl.getModel();
        int selectedRow = manageorderstbl.getSelectedRow();
        String orderId = df.getValueAt(selectedRow,7).toString();
        Order order = supplierdir.getOrder(orderId);
        order.setStatus("Order Declined");
        
        populatetable();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField companytf;
    private javax.swing.JTextField equipmenttf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> logisticscmbbx;
    private javax.swing.JTable manageorderstbl;
    private javax.swing.JComboBox<String> orderidcmbbx;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        ArrayList<Order> orders = supplierdir.getOrders();
        DefaultTableModel df = (DefaultTableModel) manageorderstbl.getModel();
        df.setRowCount(0);
        for(Order o: orders)
        {
            if(o.getSupplierName().equals(supplier.getSupplierName()))
            {
            String[] row = {o.getItem(),String.valueOf(o.getQuantity()),o.getCompanyName(),o.getStatus(),o.getReview(),
               o.getLogistics()
            ,o.getLocaldatetime().toString(),String.valueOf(o.getOrderId())};
            df.addRow(row);
            }
        }
        manageorderstbl.setModel(df);
    }

    private void populatecombo() {
        ArrayList<Order> orders = supplierdir.getOrders();
        DefaultComboBoxModel dx = new DefaultComboBoxModel();
        for(Order o: orders)
        {
            dx.addElement(String.valueOf(o.getOrderId()));
        }
        orderidcmbbx.setModel(dx);
        
        
        ArrayList<Logistic> logistics = supplierdir.getLogistics();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
        for(Logistic l: logistics)
        {
            df.addElement(l.getLogisticCompany());
        }
        logisticscmbbx.setModel(df);
    }
    }

