/**
 * Copyright (C) 2016 Rizki Mufrizal (https://rizkimufrizal.github.io/) (mufrizalrizki@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rizki.mufrizal.aplikasi.inventory.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Rizki Mufrizal <mufrizalrizki@gmail.com>
 */
public class MenuUtama extends javax.swing.JFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuUtama.class);

    private BarangView barangView;
    private PenjualanView penjualanView;
    private PenjualanSimpanView penjualanSimpanView;
    private PembelianView pembelianView;
    private PembelianSimpanView pembelianSimpanView;
    private AboutView aboutView;

    public MenuUtama() {
        initComponents();

        java.awt.EventQueue.invokeLater(() -> {
            LoginView dialog = new LoginView(new javax.swing.JFrame(), Boolean.TRUE);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(Boolean.TRUE);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        menuBarang = new javax.swing.JMenu();
        menuItemBarang = new javax.swing.JMenuItem();
        menuPenjualan = new javax.swing.JMenu();
        menuItemPenjualan = new javax.swing.JMenuItem();
        menuItemTambahDataPenjualan = new javax.swing.JMenuItem();
        menuPembelian = new javax.swing.JMenu();
        menuItemPembelian = new javax.swing.JMenuItem();
        menuItemTambahDataPembelian = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        file.setText("File");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        menu.add(file);

        menuBarang.setText("Barang");

        menuItemBarang.setText("Data Barang");
        menuItemBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBarangActionPerformed(evt);
            }
        });
        menuBarang.add(menuItemBarang);

        menu.add(menuBarang);

        menuPenjualan.setText("Penjualan");

        menuItemPenjualan.setText("Data Penjualan");
        menuItemPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPenjualanActionPerformed(evt);
            }
        });
        menuPenjualan.add(menuItemPenjualan);

        menuItemTambahDataPenjualan.setText("Tambah Data Penjualan");
        menuItemTambahDataPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahDataPenjualanActionPerformed(evt);
            }
        });
        menuPenjualan.add(menuItemTambahDataPenjualan);

        menu.add(menuPenjualan);

        menuPembelian.setText("Pembelian");

        menuItemPembelian.setText("Data Pembelian");
        menuItemPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPembelianActionPerformed(evt);
            }
        });
        menuPembelian.add(menuItemPembelian);

        menuItemTambahDataPembelian.setText("Tambah Data Pembelian");
        menuItemTambahDataPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahDataPembelianActionPerformed(evt);
            }
        });
        menuPembelian.add(menuItemTambahDataPembelian);

        menu.add(menuPembelian);

        help.setText("Help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        menu.add(help);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBarangActionPerformed
        barangView = BarangView.getInstanceBarangView();
        if (barangView.isVisible()) {
            LOGGER.info("udh ada broe");
        } else {
            desktopPane.add(barangView);
            barangView.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_menuItemBarangActionPerformed

    private void menuItemPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPenjualanActionPerformed
        penjualanView = PenjualanView.getInstancePenjualanView();
        if (penjualanView.isVisible()) {
            LOGGER.info("udh ada broe");
        } else {
            desktopPane.add(penjualanView);
            penjualanView.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_menuItemPenjualanActionPerformed

    private void menuItemPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPembelianActionPerformed
        pembelianView = PembelianView.getInstancePembelianView();
        if (pembelianView.isVisible()) {
            LOGGER.info("udh ada broe");
        } else {
            desktopPane.add(pembelianView);
            pembelianView.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_menuItemPembelianActionPerformed

    private void menuItemTambahDataPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahDataPenjualanActionPerformed
        penjualanSimpanView = PenjualanSimpanView.getInstancePenjualanSimpanView();
        if (penjualanSimpanView.isVisible()) {
            LOGGER.info("udh ada broe");
        } else {
            desktopPane.add(penjualanSimpanView);
            penjualanSimpanView.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_menuItemTambahDataPenjualanActionPerformed

    private void menuItemTambahDataPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahDataPembelianActionPerformed
        pembelianSimpanView = PembelianSimpanView.getInstancePembelianSimpanView();
        if (pembelianSimpanView.isVisible()) {
            LOGGER.info("udh ada broe");
        } else {
            desktopPane.add(pembelianSimpanView);
            pembelianSimpanView.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_menuItemTambahDataPembelianActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        aboutView = AboutView.getInstanceAboutView();
        if (aboutView.isVisible()) {
            LOGGER.info("udh ada broe");
        } else {
            desktopPane.add(aboutView);
            aboutView.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuBarang;
    private javax.swing.JMenuItem menuItemBarang;
    private javax.swing.JMenuItem menuItemPembelian;
    private javax.swing.JMenuItem menuItemPenjualan;
    private javax.swing.JMenuItem menuItemTambahDataPembelian;
    private javax.swing.JMenuItem menuItemTambahDataPenjualan;
    private javax.swing.JMenu menuPembelian;
    private javax.swing.JMenu menuPenjualan;
    // End of variables declaration//GEN-END:variables
}
