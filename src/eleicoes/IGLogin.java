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
public class IGLogin extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGrafica
     */
    public IGLogin() {
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

        labelUser = new javax.swing.JLabel();
        textBoxUser = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        buttonEntrar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        passwordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelUser.setText("Nome de Usuario:");

        labelSenha.setText("Senha:");

        buttonEntrar.setText("Entrar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonEntrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelUser)
                        .addComponent(labelSenha)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textBoxUser, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonLimpar))
                    .addComponent(passwordFieldSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(textBoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(passwordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEntrar)
                    .addComponent(buttonLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        boolean logged = false;
        for(int i=0 ; i<Eleicoes.geleitor.listEleitor.size() ; i++){
            if(textBoxUser.getText().equals(Eleicoes.geleitor.listEleitor.get(i).getNomeUser()) && passwordFieldSenha.getText().equals(Eleicoes.geleitor.listEleitor.get(i).getSenha())){
                logged = true;
                System.out.println("Loop: "+i);
                System.out.println(Eleicoes.geleitor.listEleitor.get(0).isAdmin()+"");
                
                if(Eleicoes.geleitor.listEleitor.get(i).isAdmin()){
                    IGAdministrador iga = new IGAdministrador();
                    iga.setVisible(true);
                    //Salva qual o Usuário atualmente logado na variável loggedUser
                    Eleicoes.loggedUser = Eleicoes.geleitor.consultarEleitor(textBoxUser.getText());
                    System.out.println(Eleicoes.loggedUser.getNomeUser());
                    System.out.println(Eleicoes.geleitor.consutaCpfPorUsuario(Eleicoes.loggedUser.getNomeUser()));
                }else{
                    IGUsuario igu = new IGUsuario();
                    igu.setVisible(true);
                    Eleicoes.loggedUser = Eleicoes.geleitor.consultarEleitor(textBoxUser.getText());
                    System.out.println(Eleicoes.geleitor.consultarEleitor(textBoxUser.getText()));
                    //System.out.println(Eleicoes.geleitor.consutaCpfPorUsuario(Eleicoes.loggedUser.getNomeUser()));
                }
            }
        }
        if(logged == false){
            JOptionPane.showMessageDialog(this, "Usuario ou senha incorretos");
            textBoxUser.setText("");
            passwordFieldSenha.setText("");
        }
        
        /*
            if(textBoxUser.getText().equals(Eleicoes.eleitor1.getNomeUser()) && passwordFieldSenha.getText().equals(Eleicoes.eleitor1.getSenha())){
                IGAdministrador iga = new IGAdministrador();
                iga.setVisible(true);
                //Salva qual o Usuário atualmente logado na variável loggedUser
                Eleicoes.loggedUser = Eleicoes.geleitor.consultarEleitor(textBoxUser.getText());
                System.out.println(Eleicoes.loggedUser.getNomeUser());
                System.out.println(Eleicoes.geleitor.consutaCpfPorUsuario(Eleicoes.loggedUser.getNomeUser()));
            }else if(textBoxUser.getText().equals(Eleicoes.user.getNomeUser()) && passwordFieldSenha.getText().equals(Eleicoes.user.getSenha())){
                IGUsuario igu = new IGUsuario();
                igu.setVisible(true);
                Eleicoes.loggedUser = Eleicoes.geleitor.consultarEleitor(textBoxUser.getText());
                System.out.println(Eleicoes.geleitor.consultarEleitor(textBoxUser.getText()));
                //System.out.println(Eleicoes.geleitor.consutaCpfPorUsuario(Eleicoes.loggedUser.getNomeUser()));
            }else{
                JOptionPane.showMessageDialog(this, "Usuario ou senha incorretos");
                textBoxUser.setText("");
                passwordFieldSenha.setText("");
            }*/
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textBoxUser.setText("");
        passwordFieldSenha.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(IGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPasswordField passwordFieldSenha;
    private javax.swing.JTextField textBoxUser;
    // End of variables declaration//GEN-END:variables
}