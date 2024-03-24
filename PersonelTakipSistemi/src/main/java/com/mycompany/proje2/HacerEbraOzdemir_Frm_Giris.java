/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje2;

import javax.swing.JOptionPane;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Frm_Giris extends javax.swing.JFrame {

    public HacerEbraOzdemir_Frm_Giris() {
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

        pnl_giris = new javax.swing.JPanel();
        tabbedp_giris = new javax.swing.JTabbedPane();
        pnl_yönetici = new javax.swing.JPanel();
        lbl_mailY = new javax.swing.JLabel();
        lbl_sifreY = new javax.swing.JLabel();
        txt_mailYönetici = new javax.swing.JTextField();
        txt_sifreYönetici = new javax.swing.JPasswordField();
        btn_girisYönetici = new javax.swing.JButton();
        pnl_personel = new javax.swing.JPanel();
        lbl_mailP = new javax.swing.JLabel();
        lbl_sifreP = new javax.swing.JLabel();
        txt_mailPersonel = new javax.swing.JTextField();
        txt_sifrePersonel = new javax.swing.JPasswordField();
        btn_girisPersonel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnl_giris.setBackground(new java.awt.Color(102, 0, 204));
        pnl_giris.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GİRİŞ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        tabbedp_giris.setBackground(new java.awt.Color(102, 102, 255));
        tabbedp_giris.setForeground(new java.awt.Color(255, 255, 51));
        tabbedp_giris.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N

        pnl_yönetici.setBackground(new java.awt.Color(204, 204, 255));

        lbl_mailY.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbl_mailY.setForeground(new java.awt.Color(51, 0, 153));
        lbl_mailY.setText("MAİL");

        lbl_sifreY.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbl_sifreY.setForeground(new java.awt.Color(51, 0, 153));
        lbl_sifreY.setText("ŞİFRE");

        btn_girisYönetici.setBackground(new java.awt.Color(102, 0, 204));
        btn_girisYönetici.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btn_girisYönetici.setForeground(new java.awt.Color(255, 255, 0));
        btn_girisYönetici.setText("GİRİŞ YAP");
        btn_girisYönetici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisYöneticiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_yöneticiLayout = new javax.swing.GroupLayout(pnl_yönetici);
        pnl_yönetici.setLayout(pnl_yöneticiLayout);
        pnl_yöneticiLayout.setHorizontalGroup(
            pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_yöneticiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_yöneticiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_girisYönetici))
                    .addGroup(pnl_yöneticiLayout.createSequentialGroup()
                        .addGroup(pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sifreY)
                            .addComponent(lbl_mailY))
                        .addGap(50, 50, 50)
                        .addGroup(pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sifreYönetici, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txt_mailYönetici))))
                .addContainerGap())
        );
        pnl_yöneticiLayout.setVerticalGroup(
            pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_yöneticiLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mailYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mailY))
                .addGap(24, 24, 24)
                .addGroup(pnl_yöneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sifreY)
                    .addComponent(txt_sifreYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_girisYönetici)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tabbedp_giris.addTab("YÖNETİCİ", pnl_yönetici);

        pnl_personel.setBackground(new java.awt.Color(204, 204, 255));

        lbl_mailP.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbl_mailP.setForeground(new java.awt.Color(51, 0, 153));
        lbl_mailP.setText("MAİL");

        lbl_sifreP.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbl_sifreP.setForeground(new java.awt.Color(51, 0, 153));
        lbl_sifreP.setText("ŞİFRE");

        btn_girisPersonel.setBackground(new java.awt.Color(102, 0, 204));
        btn_girisPersonel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btn_girisPersonel.setForeground(new java.awt.Color(255, 255, 0));
        btn_girisPersonel.setText("GİRİŞ YAP");
        btn_girisPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisPersonelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_personelLayout = new javax.swing.GroupLayout(pnl_personel);
        pnl_personel.setLayout(pnl_personelLayout);
        pnl_personelLayout.setHorizontalGroup(
            pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_personelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_personelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_girisPersonel))
                    .addGroup(pnl_personelLayout.createSequentialGroup()
                        .addGroup(pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sifreP)
                            .addComponent(lbl_mailP))
                        .addGap(50, 50, 50)
                        .addGroup(pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_mailPersonel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txt_sifrePersonel))))
                .addContainerGap())
        );
        pnl_personelLayout.setVerticalGroup(
            pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_personelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mailPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mailP))
                .addGap(18, 18, 18)
                .addGroup(pnl_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sifreP)
                    .addComponent(txt_sifrePersonel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_girisPersonel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tabbedp_giris.addTab("PERSONEL", pnl_personel);

        javax.swing.GroupLayout pnl_girisLayout = new javax.swing.GroupLayout(pnl_giris);
        pnl_giris.setLayout(pnl_girisLayout);
        pnl_girisLayout.setHorizontalGroup(
            pnl_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_girisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedp_giris)
                .addContainerGap())
        );
        pnl_girisLayout.setVerticalGroup(
            pnl_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_girisLayout.createSequentialGroup()
                .addComponent(tabbedp_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_giris);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Kullanicinin girdigi e-posta ve sifreyle bir yonetici girisini dogrular ve basariliysa yonetici penceresi acilir. Aksi takdirde, hatali giris durumunda kullaniciya bir hata mesaji gosterir.
    private void btn_girisYöneticiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisYöneticiActionPerformed

        String mail = txt_mailYönetici.getText();//Mail girisi alinir.
        String sifre = txt_sifreYönetici.getText();//Sifre girisi alinir.
        HacerEbraOzdemir_Yonetici yonetici = HacerEbraOzdemir_DB_PersonelTakip.YoneticiGiris(mail, sifre);//DB_PersonelTakip adli bir sinifindan YoneticiGiris methodu cagirilir. Bu yontem, verilen mail ve sifre parametreleriyle bir Yonetici nesnesi dondurur.

        if (yonetici != null) {
            //yonetici nesnesi null degilse (yani gecerli bir yonetici nesnesi dondurulduyse), kullaniciya "Giris Basarili" mesaji gosterilir.
            JOptionPane.showMessageDialog(rootPane, "Giriş Başarılı");
            HacerEbraOzdemir_Frm_Yonetici frm_yonetici = new HacerEbraOzdemir_Frm_Yonetici(yonetici);//Frm_Yonetici adli bir pencere olusturulur ve bu pencereye yonetici nesnesi parametre olarak verilir.
            frm_yonetici.setVisible(true);//frm_yonetici penceresi gorunur hale getirilir.

        } else {
            JOptionPane.showMessageDialog(rootPane, "Giriş Başarısız");//yonetici nesnesi null ise (yani gecerli bir yonetici nesnesi dondurulmediyse), kullaniciya "Giris Basarisiz" mesaji gosterilir.
        }
    }//GEN-LAST:event_btn_girisYöneticiActionPerformed

    //Kullanicinin girdigi e-posta ve sifreyle bir personel girisini dogrular ve basariliysa personele ozel bir pencere acar. Aksi takdirde, hatali giris durumunda kullaniciya bir hata mesaji gosterir.
    private void btn_girisPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisPersonelActionPerformed

        String mail = txt_mailPersonel.getText();//Mail girisi alinir.
        String sifre = txt_sifrePersonel.getText();//Sifre girisi alinir.
        HacerEbraOzdemir_Personel personel = HacerEbraOzdemir_DB_PersonelTakip.PersonelGiris(mail, sifre);//DB_PersonelTakip adli bir sinifindan PersonelGiris methodu cagirilir. Bu yontem, verilen mail ve sifre parametreleriyle bir Personel nesnesi dondurur.

        if (personel != null) {
            //personel nesnesi null degilse (yani gecerli bir personel nesnesi dondurulduyse), kullaniciya "Giris Basarili" mesaji gosterilir.
            JOptionPane.showMessageDialog(rootPane, "Giriş Başarılı");
            HacerEbraOzdemir_Frm_Personel frm_personel = new HacerEbraOzdemir_Frm_Personel(personel);//Frm_Personel adli bir pencere olusturulur ve bu pencereye personel nesnesi parametre olarak verilir.
            frm_personel.setVisible(true);//frm_personel penceresi gorunur hale getirilir.
        } else {
            JOptionPane.showMessageDialog(rootPane, "Giriş Başarısız");//personel nesnesi null ise (yani gecerli bir personel nesnesi dondurulmediyse), kullaniciya "Giris Basarisiz" mesaji gosterilir.
        }
    }//GEN-LAST:event_btn_girisPersonelActionPerformed

    /**
     * @param args the command line arguments
     */
    //Main methodu.
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(HacerEbraOzdemir_Frm_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerEbraOzdemir_Frm_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerEbraOzdemir_Frm_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerEbraOzdemir_Frm_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerEbraOzdemir_Frm_Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_girisPersonel;
    private javax.swing.JButton btn_girisYönetici;
    private javax.swing.JLabel lbl_mailP;
    private javax.swing.JLabel lbl_mailY;
    private javax.swing.JLabel lbl_sifreP;
    private javax.swing.JLabel lbl_sifreY;
    private javax.swing.JPanel pnl_giris;
    private javax.swing.JPanel pnl_personel;
    private javax.swing.JPanel pnl_yönetici;
    private javax.swing.JTabbedPane tabbedp_giris;
    private javax.swing.JTextField txt_mailPersonel;
    private javax.swing.JTextField txt_mailYönetici;
    private javax.swing.JPasswordField txt_sifrePersonel;
    private javax.swing.JPasswordField txt_sifreYönetici;
    // End of variables declaration//GEN-END:variables
}
