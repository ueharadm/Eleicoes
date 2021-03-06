/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class IGAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public IGAdministrador() {
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

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuEleicoes = new javax.swing.JMenu();
        menuCriarEleicao = new javax.swing.JMenuItem();
        menuResultadoEleicao = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCriarCandidato = new javax.swing.JMenuItem();
        menuCriarEleitor = new javax.swing.JMenuItem();
        menuVerCandidatos = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariana\\Documents\\NetBeansProjects\\Eleicoes\\Sem título.jpg")); // NOI18N

        menuEleicoes.setText("Eleições");

        menuCriarEleicao.setText("Criar eleição");
        menuCriarEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCriarEleicaoActionPerformed(evt);
            }
        });
        menuEleicoes.add(menuCriarEleicao);

        menuResultadoEleicao.setText("Resultados");
        menuResultadoEleicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuResultadoEleicaoMouseClicked(evt);
            }
        });
        menuResultadoEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResultadoEleicaoActionPerformed(evt);
            }
        });
        menuEleicoes.add(menuResultadoEleicao);

        jMenuBar1.add(menuEleicoes);

        jMenu2.setText("Cadastro");

        menuCriarCandidato.setText("Candidato");
        menuCriarCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCriarCandidatoMouseClicked(evt);
            }
        });
        menuCriarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCriarCandidatoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCriarCandidato);

        menuCriarEleitor.setText("Eleitor");
        menuCriarEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCriarEleitorActionPerformed(evt);
            }
        });
        jMenu2.add(menuCriarEleitor);

        jMenuBar1.add(jMenu2);

        menuVerCandidatos.setText("Ver Candidatos");
        menuVerCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVerCandidatosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVerCandidatos);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCriarEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCriarEleicaoActionPerformed
        CriarEleicao ce = new CriarEleicao();
        ce.setVisible(true);
    }//GEN-LAST:event_menuCriarEleicaoActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuSobreMouseClicked

    private void menuCriarCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCriarCandidatoMouseClicked
        CadastroCandidato cc = new CadastroCandidato();
        cc.setVisible(true);
    }//GEN-LAST:event_menuCriarCandidatoMouseClicked

    private void menuCriarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCriarCandidatoActionPerformed
        CadastroCandidato cc = new CadastroCandidato();
        cc.setVisible(true);
    }//GEN-LAST:event_menuCriarCandidatoActionPerformed

    private void menuCriarEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCriarEleitorActionPerformed
        CadastroEleitor ce = new CadastroEleitor();
        ce.setVisible(true);
    }//GEN-LAST:event_menuCriarEleitorActionPerformed

    private void menuVerCandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVerCandidatosMouseClicked
        SelecionaEleicaoCand se = new SelecionaEleicaoCand();
        se.setVisible(true);
    }//GEN-LAST:event_menuVerCandidatosMouseClicked

    private void menuResultadoEleicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuResultadoEleicaoMouseClicked
        
    }//GEN-LAST:event_menuResultadoEleicaoMouseClicked

    private void menuResultadoEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResultadoEleicaoActionPerformed
        SelecionaEleicaoResultado ser = new SelecionaEleicaoResultado();
        ser.setVisible(true);
    }//GEN-LAST:event_menuResultadoEleicaoActionPerformed

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
            java.util.logging.Logger.getLogger(IGAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCriarCandidato;
    private javax.swing.JMenuItem menuCriarEleicao;
    private javax.swing.JMenuItem menuCriarEleitor;
    private javax.swing.JMenu menuEleicoes;
    private javax.swing.JMenuItem menuResultadoEleicao;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVerCandidatos;
    // End of variables declaration//GEN-END:variables
}
