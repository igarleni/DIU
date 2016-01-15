/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica9;

import java.util.Collections;
import java.util.List;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Italo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        GrupoBotones.add(Modo1);
        GrupoBotones.add(Modo2);
        GrupoBotones.add(Modo3);
        Modo3.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelDato = new javax.swing.JPanel();
        Dato = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        Lista1Pane = new javax.swing.JPanel();
        GrupoBotones = new javax.swing.JPanel();
        Modo1 = new javax.swing.JToggleButton();
        Modo2 = new javax.swing.JToggleButton();
        Modo3 = new javax.swing.JToggleButton();
        Reset1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista1 = new javax.swing.JList();
        Lista2Pane = new javax.swing.JPanel();
        ResetLista2 = new javax.swing.JButton();
        BorraLista2 = new javax.swing.JButton();
        Ordena = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista2 = new javax.swing.JList();
        Boton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Botones y Listas");

        PanelDato.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));

        javax.swing.GroupLayout PanelDatoLayout = new javax.swing.GroupLayout(PanelDato);
        PanelDato.setLayout(PanelDatoLayout);
        PanelDatoLayout.setHorizontalGroup(
            PanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dato, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        PanelDatoLayout.setVerticalGroup(
            PanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatoLayout.createSequentialGroup()
                .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Boton1.setText("A Lista 1 -->");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Lista1Pane.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista 1"));
        Lista1Pane.setToolTipText("");

        GrupoBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo de selección"));

        Modo1.setText("Simple");
        Modo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modo1ActionPerformed(evt);
            }
        });

        Modo2.setText("Intervalo Simple");
        Modo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modo2ActionPerformed(evt);
            }
        });

        Modo3.setText("Multiples Intervalos");
        Modo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GrupoBotonesLayout = new javax.swing.GroupLayout(GrupoBotones);
        GrupoBotones.setLayout(GrupoBotonesLayout);
        GrupoBotonesLayout.setHorizontalGroup(
            GrupoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modo1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modo2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modo3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        GrupoBotonesLayout.setVerticalGroup(
            GrupoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrupoBotonesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Modo1)
                .addGap(11, 11, 11)
                .addComponent(Modo2)
                .addGap(6, 6, 6)
                .addComponent(Modo3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Reset1.setText("Reset Selección");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });

        Lista1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista1);

        javax.swing.GroupLayout Lista1PaneLayout = new javax.swing.GroupLayout(Lista1Pane);
        Lista1Pane.setLayout(Lista1PaneLayout);
        Lista1PaneLayout.setHorizontalGroup(
            Lista1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lista1PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Lista1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lista1PaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Lista1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(GrupoBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Lista1PaneLayout.setVerticalGroup(
            Lista1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lista1PaneLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Reset1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GrupoBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lista2Pane.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista 2"));

        ResetLista2.setText("Reset Lista");
        ResetLista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetLista2ActionPerformed(evt);
            }
        });

        BorraLista2.setText("Borra Selección");
        BorraLista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorraLista2ActionPerformed(evt);
            }
        });

        Ordena.setText("Ordenar Lista");
        Ordena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenaActionPerformed(evt);
            }
        });

        Lista2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Lista2);

        javax.swing.GroupLayout Lista2PaneLayout = new javax.swing.GroupLayout(Lista2Pane);
        Lista2Pane.setLayout(Lista2PaneLayout);
        Lista2PaneLayout.setHorizontalGroup(
            Lista2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lista2PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Lista2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ResetLista2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorraLista2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(Ordena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Lista2PaneLayout.setVerticalGroup(
            Lista2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lista2PaneLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResetLista2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorraLista2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ordena)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Boton2.setText("A lista 2 -->");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Hecho por Italo Garleni");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lista1Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton2)
                .addGap(6, 6, 6)
                .addComponent(Lista2Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton2)
                        .addGap(0, 351, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lista2Pane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(PanelDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(Boton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(Lista1Pane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
        String dato = Dato.getText(); 
        if(dato==null || dato.isEmpty()) return; 
        Dato.setText(""); 
        int len = Lista1.getModel().getSize(); 
        if(len==0){
            String [] valores = new String[1]; 
            valores[0]=dato;
            Lista1.setListData(valores); 
        }
        else{ 
            Lista1.setSelectionInterval(0,len-1); 
            List valores = Lista1.getSelectedValuesList();
            valores.add(dato);
            Lista1.setListData(valores.toArray()); 
        }
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
        List seleccionados = Lista1.getSelectedValuesList();
        Lista2.setListData(seleccionados.toArray());
    }//GEN-LAST:event_Boton2ActionPerformed

    private void ResetLista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetLista2ActionPerformed
        // TODO add your handling code here:
        List seleccionados = Lista2.getSelectedValuesList();
        seleccionados.clear();
        Lista2.setListData(seleccionados.toArray());
    }//GEN-LAST:event_ResetLista2ActionPerformed

    private void BorraLista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorraLista2ActionPerformed
        // TODO add your handling code here:
        List seleccionados = Lista2.getSelectedValuesList();
        if(seleccionados.isEmpty()) return;
        int len = Lista2.getModel().getSize();
        Lista2.setSelectionInterval(0, len-1);
        List listatotal = Lista2.getSelectedValuesList();
        listatotal.removeAll(seleccionados);
        Lista2.setListData(listatotal.toArray());
    }//GEN-LAST:event_BorraLista2ActionPerformed

    private void OrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenaActionPerformed
        // TODO add your handling code here:
        int len = Lista2.getModel().getSize();
        Lista2.setSelectionInterval(0, len-1);
        List listatotal = Lista2.getSelectedValuesList();
        Collections.sort(listatotal);
        Lista2.setListData(listatotal.toArray());
    }//GEN-LAST:event_OrdenaActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        // TODO add your handling code here:
        try{
            Lista1.setSelectedIndices(null);
        } catch(NullPointerException e){
        }
    }//GEN-LAST:event_Reset1ActionPerformed

    private void Modo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modo3ActionPerformed
        // TODO add your handling code here:
        Lista1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_Modo3ActionPerformed

    private void Modo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modo2ActionPerformed
        // TODO add your handling code here:
        Lista1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_Modo2ActionPerformed

    private void Modo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modo1ActionPerformed
        // TODO add your handling code here:
        Lista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_Modo1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorraLista2;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JTextField Dato;
    private javax.swing.JPanel GrupoBotones;
    private javax.swing.JList Lista1;
    private javax.swing.JPanel Lista1Pane;
    private javax.swing.JList Lista2;
    private javax.swing.JPanel Lista2Pane;
    private javax.swing.JToggleButton Modo1;
    private javax.swing.JToggleButton Modo2;
    private javax.swing.JToggleButton Modo3;
    private javax.swing.JButton Ordena;
    private javax.swing.JPanel PanelDato;
    private javax.swing.JButton Reset1;
    private javax.swing.JButton ResetLista2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
