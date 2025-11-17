package visao;

import java.rmi.RemoteException;
import java.rmi.Naming;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Movimentacao;
import modelo.Produto;
import servico.ServicoProduto;
import servico.ServicoMovimentacao;

// Tela responsável pela exibição dos diferentes relatórios do sistema.
// Através desta interface, o usuário pode gerar relatórios dinâmicos, baseados nos dados do estoque e das movimentações.
// Os relatórios disponíveis incluem:
// Lista de preços: Exibe nome, preço, unidade e categoria.
// Balanço físico: Mostra quantidade em estoque, preço e total monetário de cada item.
// Produtos abaixo do mínimo: Lista itens que estão abaixo da quantidade mínima.
// Produtos acima do máximo: Lista itens que ultrapassam a quantidade máxima.
// Produtos por categoria: Exibe quantos itens existem em cada categoria.
// Relatório de movimentações: Mostra entradas, saídas, ajustes e alterações de preço.
// Esta tela utiliza os serviços remotos ServicoProduto e ServicoMovimentacao via RMI para carregar os dados e
//preencher a tabela de resultados de forma dinâmica.
public class FrmRelatorio extends javax.swing.JFrame {

    // Serviço remoto responsável por operações relacionadas a produtos, como consultas e relatórios de estoque.
    private final ServicoProduto servicoProduto;
    // Serviço remoto responsável pelo registro e consulta de movimentações.
    private final ServicoMovimentacao servicoMovimentacao;

    // Construtor da tela de relatórios.
    public FrmRelatorio(ServicoMovimentacao servicoMovimentacao, ServicoProduto servicoProduto) {
        initComponents();
        setLocationRelativeTo(null);
        this.servicoProduto = servicoProduto;
        this.servicoMovimentacao = servicoMovimentacao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFechar = new javax.swing.JButton();
        JBLista = new javax.swing.JButton();
        JBFalta = new javax.swing.JButton();
        JBBalanco = new javax.swing.JButton();
        JBExcesso = new javax.swing.JButton();
        JBCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTRelatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JBMovimentacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JBLista.setBackground(new java.awt.Color(204, 204, 204));
        JBLista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBLista.setForeground(new java.awt.Color(51, 51, 51));
        JBLista.setText("Lista de preços");
        JBLista.setToolTipText("");
        JBLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListaActionPerformed(evt);
            }
        });

        JBFalta.setBackground(new java.awt.Color(204, 204, 204));
        JBFalta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFalta.setForeground(new java.awt.Color(51, 51, 51));
        JBFalta.setText("Falta de produtos");
        JBFalta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFaltaActionPerformed(evt);
            }
        });

        JBBalanco.setBackground(new java.awt.Color(204, 204, 204));
        JBBalanco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBBalanco.setForeground(new java.awt.Color(51, 51, 51));
        JBBalanco.setText("Balanço físico");
        JBBalanco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBBalanco.setMaximumSize(new java.awt.Dimension(97, 24));
        JBBalanco.setMinimumSize(new java.awt.Dimension(97, 24));
        JBBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBalancoActionPerformed(evt);
            }
        });

        JBExcesso.setBackground(new java.awt.Color(204, 204, 204));
        JBExcesso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBExcesso.setForeground(new java.awt.Color(51, 51, 51));
        JBExcesso.setText("Excesso de produtos");
        JBExcesso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBExcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcessoActionPerformed(evt);
            }
        });

        JBCategoria.setBackground(new java.awt.Color(204, 204, 204));
        JBCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCategoria.setForeground(new java.awt.Color(51, 51, 51));
        JBCategoria.setText("Produtos por categoria");
        JBCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCategoriaActionPerformed(evt);
            }
        });

        JTRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        JTRelatorio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTRelatorio.setForeground(new java.awt.Color(51, 51, 51));
        JTRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTRelatorio.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTRelatorio.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JTRelatorio);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatórios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        JBMovimentacoes.setBackground(new java.awt.Color(204, 204, 204));
        JBMovimentacoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBMovimentacoes.setForeground(new java.awt.Color(51, 51, 51));
        JBMovimentacoes.setText("Movimentações");
        JBMovimentacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBMovimentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMovimentacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JBMovimentacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBBalanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(JBFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(JBCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBExcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBLista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBExcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // Fecha a tela atual.
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListaActionPerformed
        // Gera o relatório de lista de preços.
        gerarListaPrecos();
    }//GEN-LAST:event_JBListaActionPerformed

    private void JBBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBalancoActionPerformed
        // Gera o relatório de balanço físico.
        gerarBalanco();
    }//GEN-LAST:event_JBBalancoActionPerformed

    private void JBExcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcessoActionPerformed
        // Gera o relatório de produtos acima do máximo.
        gerarExcessoProdutos();
    }//GEN-LAST:event_JBExcessoActionPerformed

    private void JBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCategoriaActionPerformed
        // Gera o relatório de produtos por categoria.
        gerarPorCategoria();
    }//GEN-LAST:event_JBCategoriaActionPerformed

    private void JBFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFaltaActionPerformed
        // Gera o relatório de produtos abaixo do mínimo.
        gerarFaltaProdutos();
    }//GEN-LAST:event_JBFaltaActionPerformed

    private void JBMovimentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMovimentacoesActionPerformed
        // Gera o relatório de movimentações (entradas, saídas, ajustes).
        gerarMovimentacoes();
    }//GEN-LAST:event_JBMovimentacoesActionPerformed

    // Gera a lista de preços contendo nome, preço unitário, unidade e categoria.
    private void gerarListaPrecos() {
        try {
            List<Produto> lista = servicoProduto.listarProdutos();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Preço", "Unidade", "Categoria"}, 0
            );

            for (Produto p : lista) {
                model.addRow(new Object[]{
                    p.getNome(),
                    p.getPrecoUnitario(),
                    p.getUnidade(),
                    p.getCategoria().getNome()
                });
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro na lista de preços: " + e.getMessage());
        }
    }

    // Gera o balanço físico, mostrando quantidade, preço e total por item.
    // Também calcula e exibe o valor total do estoque.
    private void gerarBalanco() {
        try {
            List<Produto> lista = servicoProduto.listarProdutos();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Preço Unitário", "Quantidade", "Total"}, 0
            );

            double totalGeral = 0;

            for (Produto p : lista) {
                double total = p.getQuantidadeEstoque() * p.getPrecoUnitario();
                totalGeral += total;

                model.addRow(new Object[]{
                    p.getNome(),
                    p.getPrecoUnitario(),
                    p.getQuantidadeEstoque(),
                    String.format(Locale.US, "%.2f", total)
                });
            }

            JTRelatorio.setModel(model);
            JOptionPane.showMessageDialog(this,
                    "Valor total em estoque: R$ " + String.format(Locale.US, "%.2f", totalGeral));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no balanço físico: " + e.getMessage());
        }
    }

    // Gera o relatório de produtos abaixo da quantidade mínima.
    private void gerarFaltaProdutos() {
        try {
            List<Produto> lista = servicoProduto.listarProdutosAbaixoDoMinimo();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Qtd. Mínima", "Qtd. Atual"}, 0
            );

            for (Produto p : lista) {
                model.addRow(new Object[]{
                    p.getNome(),
                    p.getQuantidadeMinima(),
                    p.getQuantidadeEstoque()
                });
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no relatório de falta: " + e.getMessage());
        }
    }

    // Gera o relatório de produtos acima da quantidade máxima.
    private void gerarExcessoProdutos() {
        try {
            List<Produto> lista = servicoProduto.listarProdutosAcimaDoMaximo();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Qtd. Máxima", "Qtd. Atual"}, 0
            );

            for (Produto p : lista) {
                model.addRow(new Object[]{
                    p.getNome(),
                    p.getQuantidadeMaxima(),
                    p.getQuantidadeEstoque()
                });
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no relatório de excesso: " + e.getMessage());
        }
    }

    // Gera relatório de contagem de produtos por categoria.
    private void gerarPorCategoria() {
        try {
            List<String[]> lista = servicoProduto.listarProdutosPorCategoria();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Categoria", "Total de Produtos"}, 0
            );

            for (String[] linha : lista) {
                model.addRow(linha);
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no relatório por categoria: " + e.getMessage());
        }
    }

    // Gera o relatório completo de movimentações de estoque.
    // Exibe entradas, saídas, ajustes e alterações de preço.
    private void gerarMovimentacoes() {
        try {
            String[] colunas = {
                "ID Mov.", "ID Produto", "Tipo", "Quantidade", "Data", "Observação"
            };

            DefaultTableModel model = new DefaultTableModel(colunas, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            JTRelatorio.setModel(model);

            List<Movimentacao> lista = servicoMovimentacao.listarTodasMovimentacoes();

            for (Movimentacao mov : lista) {
                model.addRow(new Object[]{
                    mov.getIdMovimentacao(),
                    mov.getIdProduto(),
                    mov.getTipo(),
                    mov.getQuantidade(),
                    mov.getData(),
                    mov.getObservacao()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao gerar relatório de movimentações: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBalanco;
    private javax.swing.JButton JBCategoria;
    private javax.swing.JButton JBExcesso;
    private javax.swing.JButton JBFalta;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBLista;
    private javax.swing.JButton JBMovimentacoes;
    private javax.swing.JTable JTRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
