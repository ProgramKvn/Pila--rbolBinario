package proyectomed;

import AppPackage.AnimationClass;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Pila extends javax.swing.JFrame {
private Stack<Integer> Pila = new Stack<Integer>();

    public Pila() {
        initComponents();
        this.setLocationRelativeTo(null);
        C1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtV = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA1 = new javax.swing.JTextArea();
        C1 = new javax.swing.JButton();
        T1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        A = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 128, 114));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/menu.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cancel.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lista.setBackground(new java.awt.Color(255, 204, 204));
        Lista.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(Lista);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 200, 120));

        txtV.setBackground(new java.awt.Color(255, 204, 204));
        txtV.setColumns(20);
        txtV.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtV.setRows(5);
        jScrollPane2.setViewportView(txtV);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 200, 120));

        txtA1.setBackground(new java.awt.Color(255, 204, 204));
        txtA1.setColumns(20);
        txtA1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtA1.setRows(5);
        jScrollPane3.setViewportView(txtA1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 200, 120));

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Canjear.png"))); // NOI18N
        C1.setBorder(null);
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C1MouseExited(evt);
            }
        });
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel2.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, -1, -1));

        T1.setBackground(new java.awt.Color(255, 255, 255));
        T1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ticket.png"))); // NOI18N
        T1.setBorder(null);
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T1MouseExited(evt);
            }
        });
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        jPanel2.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 510, 10));
        jPanel6.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 260, 10));
        jPanel6.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 10));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 470));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 260, 470));

        A.setBackground(new java.awt.Color(255, 255, 255));
        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AB.png"))); // NOI18N
        A.setBorder(null);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        jPanel2.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 110, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        AnimationClass Ticket = new AnimationClass();
        Ticket.jButtonXRight(-40, 10, 10, 5, T1);

        AnimationClass Ticket1 = new AnimationClass();
        Ticket1.jButtonXLeft(10, -40, 10, 5, T1);

        AnimationClass Canjear = new AnimationClass();
        Canjear.jButtonXRight(-40, 10, 10, 5, C1);

        AnimationClass Canjear1 = new AnimationClass();
        Canjear1.jButtonXLeft(10, -40, 10, 5, C1);
        
        AnimationClass Arbolito = new AnimationClass();
        Arbolito.jButtonXRight(-40, 10, 10, 5, A);

        AnimationClass Arbolito1 = new AnimationClass();
        Arbolito1.jButtonXLeft(10, -40, 10, 5, A);
    }//GEN-LAST:event_jLabel1MouseClicked
         
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel3MouseExited
    int count = 1;
    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
       if(count > 8){
           JOptionPane.showMessageDialog(null, "Tickets agotados");
       }else{
           Pila.push(count++);
           Actualizar();
           C1.setEnabled(true);
           
           int S = Pila.peek();
           txtV.setText(" ------------------------------------------- \n"
                + " El siguiente ticket en ser atentido es: \n" 
                + " Cargando... \n"
                + " ... \n"
                + " R-" + S);
                
       }
    }//GEN-LAST:event_T1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        try {
            int C = Pila.pop();
            String Canjear = String.valueOf(C);
            
            if(C <= 1){
                txtA1.setText(" ------------------------------------------- \n"
                        + " Canjeando ticket... \n"
                        + " Cargando... \n"
                        + " ... \n"
                        + "Ticket canjeado: R-" + Canjear);
                
                Actualizar();
            }
            C1.setEnabled(false);
            txtV.setText(" ");
            if(C > 1){
                txtA1.setText(" ------------------------------------------- \n"
                        + " Canjeando ticket... \n"
                        + " Cargando... \n"
                        + " ... \n"
                        + "Ticket canjeado: R-" + Canjear);
                
                Actualizar();
                
                int V = Pila.peek();
                if(V >= 1){
            txtV.setText(" ------------------------------------------- \n"
                + " El siguiente ticket en ser atentido es: \n" 
                + " Cargando... \n"
                + " ... \n"
                + " R-" + V);
                }
                C1.setEnabled(true);
            }
        } catch (Exception e) {
        } 
    }//GEN-LAST:event_C1ActionPerformed

    private void C1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_C1MouseEntered

    private void C1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_C1MouseExited

    private void T1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_T1MouseEntered

    private void T1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_T1MouseExited
    Arbol NArbol = new Arbol();
    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        if(!NArbol.Vacío()){
            JOptionPane.showMessageDialog(null, " ");
        }else{
            for(int AB : Pila){
            NArbol.agregar(AB, "Ticket");
            NArbol.InOrder(NArbol.raiz);
        }
        }
    }//GEN-LAST:event_AActionPerformed
    private void Actualizar(){
        DefaultListModel nl = new DefaultListModel();
        for(Integer i : Pila){
            nl.addElement(" ------------------------------------------- ");
            nl.addElement(" Obtienendo ticket...");
            nl.addElement(" Cargando...");
            nl.addElement(" ...");
            nl.addElement(" Su ticket es: R-"+i);
        }Lista.setModel(nl);   
    }
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
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton C1;
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton T1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea txtA1;
    private javax.swing.JTextArea txtV;
    // End of variables declaration//GEN-END:variables
}
