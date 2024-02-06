/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apptxt;

import java.io.*;
import javax.swing.JFileChooser;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AplikasiTXT extends javax.swing.JFrame {
JFileChooser txtq = new JFileChooser();
    /**
     * Creates new form AplikasiTXT
     */
    public AplikasiTXT() {
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

        txtPath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIsi = new javax.swing.JTextArea();
        btnMod = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 160));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        btnBrowse.setText("Browse");
        btnBrowse.setPreferredSize(new java.awt.Dimension(85, 23));
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnTampil.setText("Tampilkan");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });

        txtIsi.setColumns(20);
        txtIsi.setRows(5);
        jScrollPane1.setViewportView(txtIsi);

        btnMod.setText("Modifikasi");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(85, 23));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(85, 23));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Text Craft");

        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPath))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTampil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTampil)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        int xfile = txtq.showOpenDialog(this);
        
        if(xfile == JFileChooser.APPROVE_OPTION){
            File file = txtq.getSelectedFile();
            try{
                txtPath.setText("" +file);
            }catch (Exception e){
                System.out.println("Error: " +e.getMessage());
            }
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
       txtIsi.setText(null);
    String p = txtPath.getText();
    File file = new File(p);
    try {
        FileInputStream fs = new FileInputStream(file);
        DataInputStream in = new DataInputStream(fs);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strline;
        while ((strline = br.readLine()) != null) {
            txtIsi.append(strline + "\n"); // Menambahkan baris secara keseluruhan ke JTextArea
        }
        in.close();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        String q = txtPath.getText();
        File file = new File(q);
        try{
            String text = txtIsi.getText();
            FileWriter fw = new FileWriter(q);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text,0,text.length());
            bw.newLine();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        txtIsi.setText("Data Sudah dimodifikasi, Tekan Tombol Tampilkan");
    }//GEN-LAST:event_btnModActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtPath.setText("");
        txtIsi.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
   String searchText = JOptionPane.showInputDialog(this, "Masukkan teks yang ingin Anda cari:", "Pencarian", JOptionPane.QUESTION_MESSAGE);
    if (searchText != null && !searchText.isEmpty()) {
        String originalText = txtIsi.getText(); // Menyimpan teks asli dari JTextArea

        String text = originalText;
        String[] sentences = text.split("[.!?]");
        ArrayList<String> foundSentences = new ArrayList<>();
        int count = 0; // Untuk menyimpan jumlah kemunculan kata yang dicari

        // Melakukan pencarian dan menambahkan kalimat yang mengandung kata yang dicari ke dalam ArrayList
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(searchText.toLowerCase())) {
                foundSentences.add(sentence.trim());
                count++;
            }
        }

        // Menampilkan kalimat-kalimat yang mengandung kata yang dicari dengan memberi tanda bold
        String formattedText = originalText; // Menggunakan teks asli untuk dimodifikasi
        for (String foundSentence : foundSentences) {
            if (foundSentence.toLowerCase().contains(searchText.toLowerCase())) {
                int startIndex = foundSentence.toLowerCase().indexOf(searchText.toLowerCase());
                int endIndex = startIndex + searchText.length();
                String boldText = "< ' " + foundSentence.substring(startIndex, endIndex) + " ' >";
                formattedText = formattedText.replace(foundSentence, foundSentence.substring(0, startIndex) + boldText + foundSentence.substring(endIndex));
            }
        }

        txtIsi.setText(formattedText);

        if (count > 0) {
            JOptionPane.showMessageDialog(this, "Teks ditemukan. Jumlah kemunculan: " + count, "Pencarian", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Teks tidak ditemukan.", "Pencarian", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AplikasiTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiTXT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtIsi;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}