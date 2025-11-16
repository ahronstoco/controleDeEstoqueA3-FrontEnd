package visao;

import javax.swing.JOptionPane;
import servico.ServicoProduto;
import servico.ServicoCategoria;
import servico.ServicoMovimentacao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    private ServicoProduto servicoProduto;
    private ServicoCategoria servicoCategoria;
    private ServicoMovimentacao servicoMovimentacao;

    public FrmMenuPrincipal(ServicoProduto servicoProduto,
            ServicoCategoria servicoCategoria,
            ServicoMovimentacao servicoMovimentacao) {
        initComponents();
        setLocationRelativeTo(null);

        this.servicoProduto = servicoProduto;
        this.servicoCategoria = servicoCategoria;
        this.servicoMovimentacao = servicoMovimentacao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCadastroCategoria = new javax.swing.JButton();
        JBCadastroProduto = new javax.swing.JButton();
        JBGerenciaEstoque = new javax.swing.JButton();
        JBRelatorio = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        JBCadastroCategoria.setBackground(new java.awt.Color(204, 204, 204));
        JBCadastroCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCadastroCategoria.setForeground(new java.awt.Color(51, 51, 51));
        JBCadastroCategoria.setText("Cadastrar Categoria");
        JBCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroCategoriaActionPerformed(evt);
            }
        });

        JBCadastroProduto.setBackground(new java.awt.Color(204, 204, 204));
        JBCadastroProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCadastroProduto.setForeground(new java.awt.Color(51, 51, 51));
        JBCadastroProduto.setText("Cadastrar Produto");
        JBCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroProdutoActionPerformed(evt);
            }
        });

        JBGerenciaEstoque.setBackground(new java.awt.Color(204, 204, 204));
        JBGerenciaEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBGerenciaEstoque.setForeground(new java.awt.Color(51, 51, 51));
        JBGerenciaEstoque.setText("Gerenciar Estoque");
        JBGerenciaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerenciaEstoqueActionPerformed(evt);
            }
        });

        JBRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        JBRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBRelatorio.setForeground(new java.awt.Color(51, 51, 51));
        JBRelatorio.setText("Relatórios");
        JBRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatorioActionPerformed(evt);
            }
        });

        JBSair.setBackground(new java.awt.Color(204, 204, 204));
        JBSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBSair.setForeground(new java.awt.Color(51, 51, 51));
        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CONTROLE DE ESTOQUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBCadastroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBGerenciaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBCadastroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBGerenciaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroCategoriaActionPerformed
        // TODO add your handling code here:
       new FrmCadastroCategoria(servicoCategoria).setVisible(true);
    }//GEN-LAST:event_JBCadastroCategoriaActionPerformed

    private void JBCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroProdutoActionPerformed
        // TODO add your handling code here:
       new FrmCadastroProduto(servicoProduto, servicoCategoria).setVisible(true);
    }//GEN-LAST:event_JBCadastroProdutoActionPerformed

    private void JBRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatorioActionPerformed
        // TODO add your handling code here:
       new FrmRelatorio(servicoMovimentacao, servicoProduto).setVisible(true);
    }//GEN-LAST:event_JBRelatorioActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void JBGerenciaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerenciaEstoqueActionPerformed
        // TODO add your handling code here:
      new FrmGerenciaEstoque(servicoMovimentacao, servicoProduto).setVisible(true);
    }//GEN-LAST:event_JBGerenciaEstoqueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastroCategoria;
    private javax.swing.JButton JBCadastroProduto;
    private javax.swing.JButton JBGerenciaEstoque;
    private javax.swing.JButton JBRelatorio;
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
