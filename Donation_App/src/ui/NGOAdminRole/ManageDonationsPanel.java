/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminRole;

import Business.Ecosystem;
import Business.NGO.Donation;
import Business.NGO.NGO;
import Business.NGO.NGODirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class ManageDonationsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonationsPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    NGODirectory ngodir;
    
    public ManageDonationsPanel(JPanel container,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        populatecombo();
        populatescheduletbl();
        jButton2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/NGO.jpeg").getImage().getScaledInstance(870, 520, Image.SCALE_DEFAULT)));

      //  populateStandingsTable();
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
        scheduletblnew = new javax.swing.JTable();
        ngocmbbx = new javax.swing.JComboBox<>();
        noofcomptf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        scheduletf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 102));

        scheduletblnew.setBackground(new java.awt.Color(255, 153, 51));
        scheduletblnew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Donation_No", "Company", "Venue", "Date"
            }
        ));
        jScrollPane1.setViewportView(scheduletblnew);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 500, 100));

        ngocmbbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ngocmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngocmbbxActionPerformed(evt);
            }
        });
        add(ngocmbbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));
        add(noofcomptf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, 20));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Generate Schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("NGO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("No of Companies");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 100, 50));
        add(scheduletf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 130, 20));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Schedule Status");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/NGO.jpeg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 870, 520));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("NGO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void ngocmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngocmbbxActionPerformed
        // TODO add your handling code here:
        NGO ngo = ngodir.getNGO((String) ngocmbbx.getSelectedItem());
        noofcomptf.setText(String.valueOf(ngo.getNoOfcompany()));
        scheduletf.setText(ngo.getScheduleType());
        
    }//GEN-LAST:event_ngocmbbxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"adminWorkarea");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
      NGO ngo = ngodir.getNGO((String) ngocmbbx.getSelectedItem());
      
      
      ngo.generateSchedule();
      
      
       String ngoName = (String) ngocmbbx.getSelectedItem();
        ngo = ngodir.getNGO(ngoName);
        String venname,date;
        ArrayList<Donation> donations = ngo.getDonations();
        DefaultTableModel df = (DefaultTableModel) scheduletblnew.getModel();
        df.setRowCount(0);
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
               
        for(Donation m: donations)
        {
            if(m.getVenueStatus() == null) m.setVenueStatus("Not Selected");
         //  schedulestat = m.getVenueStatus();
           if(m.getVenue() == null) 
               
           {venname = "Not Selected"; date = "Not Selected";}
           else {
               
               venname = m.getVenue().getVenueName();
               
               date = datef.format(m.getDate());
           }
           
            String[] row = {String.valueOf(m.getDonation_no()),m.getComp().getCompanyName(),venname,date};
            df.addRow(row);
        }
        scheduletblnew.setModel(df);
    

     // populatescheduletbl();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> ngocmbbx;
    private javax.swing.JTextField noofcomptf;
    private javax.swing.JTable scheduletblnew;
    private javax.swing.JTextField scheduletf;
    // End of variables declaration//GEN-END:variables

    private void populatescheduletbl() {
        
        System.out.println("inside populate table");
        
        NGO ngo = ngodir.getNGO((String) ngocmbbx.getSelectedItem());
        ArrayList<Donation> donations = ngo.getDonations();
        

        String venue,date;
        DefaultTableModel df = (DefaultTableModel) scheduletblnew.getModel();
        df.setRowCount(0);
        if(ngo.getScheduleType() == null) ngo.setScheduleType("Not Selected");
        
        if(ngo.getScheduleType().equals("Not Selected"))
        {
            return;
        }  
        else{
            
        for(Donation m: donations)
        {
             System.out.println("else statememt IN");
            DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
               
            if(m.getVenue() == null) venue = "Not Selected";
            else venue = m.getVenue().getVenueName();
            
            System.out.println("venue not selected is printed");
            if(m.getDate() == null) date= "Not Selected";
            
            
            
            else date = datef.format(m.getDate());
            if(date == null) date = "Not Selected";
            
            System.out.println("one step before populating");
             String[] row = {String.valueOf(m.getDonation_no()),m.getComp().getCompanyName(),venue,date};
             df.addRow(row);

            
            System.out.println("after adding to the row");
   
        }
        scheduletblnew.setModel(df);
        }
        
        
    }

    private void populatecombo() {
        
        ArrayList<NGO> ngo = ngodir.getNgolist();
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
    
        for(NGO s: ngo)
        {
            dc.addElement(s.getNGOName());
        }
        
        ngocmbbx.setModel(dc);
       
        
    }
}
