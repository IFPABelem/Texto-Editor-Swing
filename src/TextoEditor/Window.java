/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextoEditor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.Action;
import javax.swing.text.DefaultEditorKit;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author tiago
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Action copyAction = new DefaultEditorKit.CopyAction();
        jMenuItem1 = new javax.swing.JMenuItem();
        Action pasteAction = new DefaultEditorKit.PasteAction();
        jMenuItem2 = new javax.swing.JMenuItem();
        Action cutAction = new DefaultEditorKit.CutAction();
        jMenuItem3 = new javax.swing.JMenuItem();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuItem4 = new javax.swing.JMenuItem( jEditorPane1.getActionMap().get(DefaultEditorKit.selectAllAction) );
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem( jEditorPane1.getActionMap().get(DefaultEditorKit.beginLineAction) );
        jMenuItem6 = new javax.swing.JMenuItem( jEditorPane1.getActionMap().get(DefaultEditorKit.endLineAction) );
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem( jEditorPane1.getActionMap().get(DefaultEditorKit.beginAction) );
        jMenuItem8 = new javax.swing.JMenuItem( jEditorPane1.getActionMap().get(DefaultEditorKit.endAction) );
        jScrollPane1 = new javax.swing.JScrollPane();
        /* Corrigindo o Lixo do NetBeans
        jEditorPane1 = new javax.swing.JEditorPane();
        */
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem1.setAction(copyAction);
        jMenuItem1.setText("Copiar");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setAction(pasteAction);
        jMenuItem2.setText("Colar");
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setAction(cutAction);
        jMenuItem3.setText("Recortar");
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setText("Selecionar tudo");
        jMenuItem4.setToolTipText("");
        jPopupMenu1.add(jMenuItem4);

        jMenu3.setText("Ir para");

        jMenu4.setText("Linha");

        jMenuItem5.setText("Começo");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Fim");
        jMenu4.add(jMenuItem6);

        jMenu3.add(jMenu4);

        jMenu5.setText("Texto");

        jMenuItem7.setText("Começo");
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Fim");
        jMenu5.add(jMenuItem8);

        jMenu3.add(jMenu5);

        jPopupMenu1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        jEditorPane1.setBackground(new java.awt.Color(51, 63, 70));
        jEditorPane1.setForeground(new java.awt.Color(255, 255, 255));
        jEditorPane1.setCaretColor(new java.awt.Color(255, 255, 255));
        jEditorPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jEditorPane1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1);

        jMenuBar2.setBackground(new java.awt.Color(82, 96, 105));
        jMenuBar2.setForeground(new java.awt.Color(212, 214, 215));
        jMenuBar2.setToolTipText("");

        jMenu1.setForeground(new java.awt.Color(212, 214, 215));
        jMenu1.setText("Novo");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar2.add(jMenu1);

        jMenu6.setForeground(new java.awt.Color(212, 214, 215));
        jMenu6.setText("Abrir");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(212, 214, 215));
        jMenu7.setText("salvar");
        jMenu7.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu7MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEditorPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditorPane1MousePressed
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }

    static void writeFile(String content, String path, Charset encoding) throws IOException {
       Files.write(Paths.get(path), content.getBytes(encoding));
    }

    // https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file
    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }//GEN-LAST:event_jEditorPane1MousePressed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        jEditorPane1.setText("");
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int res = fileChooser.showOpenDialog(null); 
        if (res == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            try {
                String content = jEditorPane1.getText();
                writeFile(content, path, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Uma falha occoreu em seu sistema!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uma falha occoreu em seu sistema!");
        }
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int res = fileChooser.showOpenDialog(null); 
        if (res == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            try {
                String content = readFile(path, StandardCharsets.UTF_8);
                jEditorPane1.setText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tenta abrir");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao tenta abrir");
        }
    }//GEN-LAST:event_jMenu6MenuSelected

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
