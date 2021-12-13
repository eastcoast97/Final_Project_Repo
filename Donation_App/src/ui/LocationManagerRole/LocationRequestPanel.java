/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.LocationManagerRole;

import Business.Ecosystem;
import Business.NGO.Donation;
import Business.NGO.NGODirectory;
import Business.UserAccount.UserAccount;
import Business.Venue.Venue;
import Business.Venue.VenueDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class LocationRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form LocationRequestPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    VenueDirectory vd;
    NGODirectory ngodir;
    
    public LocationRequestPanel(JPanel container,Ecosystem ecosystem, UserAccount ua) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.ua = ua;
      //  date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        vd = ecosystem.getEnterpriseDirectory().getVenueDirectory();
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        populatetable();
        jButton3.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.jpeg").getImage().getScaledInstance(100,50, Image.SCALE_DEFAULT)));
        jLabel2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/gradnew10.png").getImage().getScaledInstance(1000,900, Image.SCALE_DEFAULT)));

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
        venuereqtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        venuereqtbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        venuereqtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NGO", "Company", "Donation_No", "Date", "Status"
            }
        ));
        venuereqtbl.setGridColor(new java.awt.Color(255, 153, 102));
        venuereqtbl.setShowGrid(true);
        jScrollPane1.setViewportView(venuereqtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 630, 90));

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 50));

        jButton2.setText("Reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 150, 50));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Location Request Panel  ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/gradnew10.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 900));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) venuereqtbl.getModel();
        int selectedRow = venuereqtbl.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Please select a donation for the venue ");return;}
        Date dates = new Date();
        String ngoName = df.getValueAt(selectedRow,0).toString();
        String donationNo = df.getValueAt(selectedRow, 2).toString();
        String date = df.getValueAt(selectedRow,3).toString();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        try {
               dates = formatter.parse(date);
         }catch (ParseException e) {
           e.printStackTrace();
         }
        Donation donation = ngodir.getDonation(donationNo, ngoName);
        Venue v = vd.getVenueUser(ua);
        vd.assignVenue(v, dates, donation);
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"venueManager");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) venuereqtbl.getModel();
        int selectedRow = venuereqtbl.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Please Select a Donation Request");return;}
        String ngoName = df.getValueAt(selectedRow,0).toString();
        String donationNo = df.getValueAt(selectedRow,2).toString();
        Donation donation = ngodir.getDonation(donationNo,ngoName);
        donation.setVenueStatus("Declined");
        populatetable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable venuereqtbl;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        ArrayList<Venue> venues = vd.getVenueList();
        DefaultTableModel df = (DefaultTableModel) venuereqtbl.getModel();
        df.setRowCount(0);
        String date;
        HashMap<Donation,Date>  venueRequests;
        for(Venue v: venues)
        {
            if(v.getUserAccount().equals(ua))
            {
            if(v.getVenueName().equals("venue1")) continue;
            venueRequests = v.getDonationRequests();
            
            Set<Donation> donations = venueRequests.keySet();
            for(Donation m: donations)
            {
               DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
               date = datef.format(venueRequests.get(m));
               
               
            String[] row = {m.getNgo(),m.getComp().getCompanyName(),String.valueOf(m.getDonation_no()),date,m.getVenueStatus()};
             df.addRow(row);
            }
            }
        }
        venuereqtbl.setModel(df);
    }
    }

