/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Member;
import java.awt.Component;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author RinaA
 */
public class bookClass extends javax.swing.JFrame {
 public String Book = "" ;
    /**
     * Creates new form bookClass
     */
    public bookClass() {
        initComponents();
		        this.setLocationRelativeTo(null);

       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Period = new javax.swing.ButtonGroup();
        Class = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AM = new javax.swing.JRadioButton();
        PM = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        spinning = new javax.swing.JRadioButton();
        ABS = new javax.swing.JRadioButton();
        cardio = new javax.swing.JRadioButton();
        body = new javax.swing.JRadioButton();
        bootcamp = new javax.swing.JRadioButton();
        zumba = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/profile.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEMBER - book classes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book.setBackground(new java.awt.Color(139, 184, 139));
        book.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("BOOK");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 220, 60));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("choose the time period : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        Period.add(AM);
        AM.setText("AM");
        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });
        getContentPane().add(AM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        Period.add(PM);
        PM.setText("PM");
        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });
        getContentPane().add(PM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("choose a class to book : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        Class.add(spinning);
        spinning.setText("spinning Class");
        spinning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinningActionPerformed(evt);
            }
        });
        getContentPane().add(spinning, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 110, 20));

        Class.add(ABS);
        ABS.setText("ABS Class");
        ABS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABSActionPerformed(evt);
            }
        });
        getContentPane().add(ABS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        Class.add(cardio);
        cardio.setText("cardio Class");
        cardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioActionPerformed(evt);
            }
        });
        getContentPane().add(cardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        Class.add(body);
        body.setText("body Class");
        body.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyActionPerformed(evt);
            }
        });
        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        Class.add(bootcamp);
        bootcamp.setText("bootcamp Class");
        bootcamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bootcampActionPerformed(evt);
            }
        });
        getContentPane().add(bootcamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        Class.add(zumba);
        zumba.setText("zumba Class");
        zumba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zumbaActionPerformed(evt);
            }
        });
        getContentPane().add(zumba, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/profile.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/back.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/home.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/msg.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/book.JPG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PMActionPerformed

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AMActionPerformed

    private void spinningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spinningActionPerformed

    private void ABSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ABSActionPerformed

    private void cardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardioActionPerformed

    private void bodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyActionPerformed

    private void bootcampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bootcampActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bootcampActionPerformed

    private void zumbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zumbaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zumbaActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        String result="";

        if (PM.isSelected()) {
            if (spinning.isSelected()) {
                result=GymSystem.member.bookClass(102);

            }
            if (ABS.isSelected()) {
                result= GymSystem.member.bookClass(202);
            }
            if (cardio.isSelected()) {
                result= GymSystem.member.bookClass(302);
            }
            if (body.isSelected()) {
                result= GymSystem.member.bookClass(602);
            }
            if (bootcamp.isSelected()) {
                result=GymSystem.member.bookClass(402);
            }
            if (zumba.isSelected()) {
                result=GymSystem.member.bookClass(502);
            }
        }
        //AM
        if (AM.isSelected()) {
            if (spinning.isSelected()) {
                result= GymSystem.member.bookClass(101);
            }
            if (ABS.isSelected()) {
                result= GymSystem.member.bookClass(201);
            }
            if (cardio.isSelected()) {
                result= GymSystem.member.bookClass(301);
            }
            if (body.isSelected()) {
                result=GymSystem.member.bookClass(601);
            }
            if (bootcamp.isSelected()) {
                result= GymSystem.member.bookClass(401);
            }
            if (zumba.isSelected()) {
                result= GymSystem.member.bookClass(501);
            }
        }
        if(!result.isEmpty()){
			
			        Detiles4 s = new  Detiles4(1);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();	
		
	
	  
		
		}

		
		

    }//GEN-LAST:event_bookActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new userpage().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new userpage().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 MemberMenu us = new MemberMenu();
        us.setVisible(true);
        us.setLocationRelativeTo(null);
        this.dispose();    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new MemberMenu().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new CostumreService().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //new bookClass().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ABS;
    private javax.swing.JRadioButton AM;
    private javax.swing.ButtonGroup Class;
    private javax.swing.JRadioButton PM;
    private javax.swing.ButtonGroup Period;
    private javax.swing.JRadioButton body;
    private javax.swing.JButton book;
    private javax.swing.JRadioButton bootcamp;
    private javax.swing.JRadioButton cardio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton spinning;
    private javax.swing.JRadioButton zumba;
    // End of variables declaration//GEN-END:variables

}