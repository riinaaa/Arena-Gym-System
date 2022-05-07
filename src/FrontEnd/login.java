package FrontEnd;

import BackEnd.*;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/back.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 50));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 260, 50));

        login.setBackground(new java.awt.Color(255, 204, 204));
        login.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("CONTINUE");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/IMG/login.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String userName = UserName.getText();
        String password = Password.getText();
        //we want to check if the data are correct
        int ID = User.Login(userName, password);
        if (ID!=-1) {
            //Trainer
		 //Member
                for (int i = 0; i < GymSystem.membersAr.size(); i++) {
                    if (GymSystem.membersAr.get(i).getId() == ID) {
                        GymSystem.member = GymSystem.membersAr.get(i);
                        break;
                    }

                }
                MemberMenu Mmenu = new MemberMenu();
                Mmenu.setVisible(true);
                Mmenu.setLocationRelativeTo(null);
                this.dispose();
            
        }else{

			new signFailPOP().setVisible(true);
		UserName.setText("");
        Password.setText("");
        }

    }//GEN-LAST:event_loginActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        LOGsign us = new LOGsign();
        us.setVisible(true);
        us.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables


}
