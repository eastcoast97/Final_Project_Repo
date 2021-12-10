/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminRole;

import Business.Ecosystem;
import Business.NGO.NGO;
import Business.NGO.NGODirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class ManageNGOsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGOsPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    NGODirectory ngodir;
    
    public ManageNGOsPanel(JPanel container,Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.container = container;
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
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
        ngotbl = new javax.swing.JTable();
        ngotf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ngotbl.setBackground(new java.awt.Color(255, 204, 204));
        ngotbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NGO", "Contributing Companies"
            }
        ));
        jScrollPane1.setViewportView(ngotbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 490, 90));
        add(ngotf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 180, 40));

        jButton1.setText("Add NGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 300, 40));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/rohinibalasubramanian/Downloads/back.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 371, 121, -1));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NGO ngo = new NGO(ngotf.getText());
        ngodir.addNGO(ngo);
        populatetable();
        ngotf.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ngotbl;
    private javax.swing.JTextField ngotf;
    // End of variables declaration//GEN-END:variables

 

    private void populatetable() {
        
        ArrayList<NGO> ngolist = ngodir.getNgolist();
        DefaultTableModel dt = (DefaultTableModel) ngotbl.getModel();
        dt.setRowCount(0);
        for(NGO s: ngolist)
        {
            String[] row = {s.getNGOName(),String.valueOf(s.getNoOfcompany())};
            dt.addRow(row);
        }
        ngotbl.setModel(dt);
    }
    }
