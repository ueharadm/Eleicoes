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
public class CriarEleicaoUserCand extends javax.swing.JFrame {

    /**
     * Creates new form CriarEleicaoUserCand
     */
    public CriarEleicaoUserCand() {
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

        buttonCadastroEleitor = new javax.swing.JButton();
        buttonCadastroCand = new javax.swing.JButton();
        labelText = new javax.swing.JLabel();
        textCand = new javax.swing.JTextField();
        textEleitor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonCadastroEleitor.setText("Eleitor");
        buttonCadastroEleitor.setEnabled(false);
        buttonCadastroEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroEleitorActionPerformed(evt);
            }
        });

        buttonCadastroCand.setText("Candidato");
        buttonCadastroCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroCandActionPerformed(evt);
            }
        });

        labelText.setText("Cadastre candidatos e eleitores nesta eleição:");

        textEleitor.setEnabled(false);

        jLabel1.setText("Digite o número de identificação do candidato:");

        jLabel2.setText("ou    (Digite o cpf do eleitor:) Função desabilitada temporariamente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textCand))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(textEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(labelText)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(buttonCadastroCand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastroEleitor)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastroCand)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCadastroEleitor)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastroCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroCandActionPerformed
        try{
            boolean confirm=false;
            if(textCand.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Preencha o campo de número de identificação do candidato");
            }else{
                for(int i=0 ; i<Eleicoes.gc.listCandidato.size() ; i++){
                    if(Eleicoes.gc.listCandidato.get(i).getNumId() == Integer.parseInt(textCand.getText())){
                        //Adiciona o numero do candidato digitado à lista de candidatos na última eleição criada
                        Eleicoes.geleicao.listEleicao.get(Eleicoes.geleicao.listEleicao.size()-1).addNumCandidato(Integer.parseInt(textCand.getText()));
                        JOptionPane.showMessageDialog(this, "Candidato adicionado com sucesso!\n"+Eleicoes.gc.listCandidato.get(i));
                        confirm = true;
                    }
                }
                if(confirm == false){
                    JOptionPane.showMessageDialog(this, "Número de identificação de candidato inexistente");
                }
                
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Digite somente números no campo de número de identificação.\nErro: "+e);
        }
        
    }//GEN-LAST:event_buttonCadastroCandActionPerformed

    private void buttonCadastroEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroEleitorActionPerformed
        boolean confirm=false;
        if(textEleitor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Preencha o campo de número de CPF do eleitor");
        }else{
            for(int i=0 ; i<Eleicoes.geleitor.listEleitor.size() ; i++){
                if(Eleicoes.geleitor.listEleitor.get(i).getCpf().equals(textEleitor.getText())){
                    //Adiciona cpf do eleitor digitado à lista de cpf's da última eleição cadastrada
                    Eleicoes.geleicao.listEleicao.get(Eleicoes.geleicao.listEleicao.size()-1).addCpfVotantes(textEleitor.getText());
                    JOptionPane.showMessageDialog(this, "Eleitor adicionado com sucesso!\n"+Eleicoes.geleitor.listEleitor.get(i));
                    confirm = true;
                }
            }
            if(confirm==false){
                JOptionPane.showMessageDialog(this, "CPF do eleitor não cadastrado");
            }
        }
    }//GEN-LAST:event_buttonCadastroEleitorActionPerformed

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
            java.util.logging.Logger.getLogger(CriarEleicaoUserCand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarEleicaoUserCand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarEleicaoUserCand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarEleicaoUserCand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarEleicaoUserCand().buttonCadastroEleitor.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastroCand;
    private javax.swing.JButton buttonCadastroEleitor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelText;
    private javax.swing.JTextField textCand;
    private javax.swing.JTextField textEleitor;
    // End of variables declaration//GEN-END:variables
}