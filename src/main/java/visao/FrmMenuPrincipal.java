package visao;

import javax.swing.JOptionPane;
import servico.ServicoProduto;
import servico.ServicoCategoria;
import servico.ServicoMovimentacao;

// Tela principal do sistema, responsável por centralizar o acesso às demais funcionalidades da aplicação.
// A interface permite navegar para os módulos de:
// Cadastro de Categorias;
// Cadastro de Produtos;
// Gerenciamento de Estoque;
// Relatórios;
// Esta tela recebe as instâncias dos serviços remotos via RMI servico.ServicoProduto, servico.ServicoCategoria e
//servico.ServicoMovimentacao e as repassa para os demais frames quando o usuário acessa cada módulo, garantindo que toda a
//aplicação compartilhe a mesma conexão remota.
public class FrmMenuPrincipal extends javax.swing.JFrame {

    // Serviço remoto responsável por operações relacionadas a produtos, como cadastro, estoque e consultas.
    private ServicoProduto servicoProduto;
    // Serviço remoto responsável pela gestão das categorias.
    private ServicoCategoria servicoCategoria;
    // Serviço remoto responsável por registrar e consultar movimentações.
    private ServicoMovimentacao servicoMovimentacao;

    // Construtor do menu principal.
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
        JBCadastroCategoria.setText("Cadastro de Categorias");
        JBCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroCategoriaActionPerformed(evt);
            }
        });

        JBCadastroProduto.setBackground(new java.awt.Color(204, 204, 204));
        JBCadastroProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCadastroProduto.setForeground(new java.awt.Color(51, 51, 51));
        JBCadastroProduto.setText("Cadastro de Produtos");
        JBCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroProdutoActionPerformed(evt);
            }
        });

        JBGerenciaEstoque.setBackground(new java.awt.Color(204, 204, 204));
        JBGerenciaEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBGerenciaEstoque.setForeground(new java.awt.Color(51, 51, 51));
        JBGerenciaEstoque.setText("Gerenciamento de estoque");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBGerenciaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JBRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBCadastroCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
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
        // Abre a tela de cadastro de categorias.
        new FrmCadastroCategoria(servicoCategoria).setVisible(true);
    }//GEN-LAST:event_JBCadastroCategoriaActionPerformed

    private void JBCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroProdutoActionPerformed
        // Abre a tela de cadastro de produtos.
        new FrmCadastroProduto(servicoProduto, servicoCategoria).setVisible(true);
    }//GEN-LAST:event_JBCadastroProdutoActionPerformed

    private void JBRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatorioActionPerformed
        // Abre a tela de relatórios do sistema.
        new FrmRelatorio(servicoMovimentacao, servicoProduto).setVisible(true);
    }//GEN-LAST:event_JBRelatorioActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        // Encerra completamente a aplicação.
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void JBGerenciaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerenciaEstoqueActionPerformed
        // Abre a tela de gerenciamento de estoque.
        // Esta tela permite aplicar aumentos e reduções de preço, realizar entradas e saídas e consultar estoque detalhado.
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
