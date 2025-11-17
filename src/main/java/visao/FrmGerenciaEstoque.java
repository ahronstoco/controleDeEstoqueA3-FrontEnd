package visao;

import javax.swing.JOptionPane;
import java.rmi.RemoteException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Movimentacao;
import modelo.Produto;
import servico.ServicoMovimentacao;
import servico.ServicoProduto;

// Tela de gerenciamento de estoque do sistema.
// Permite ao usuário visualizar produtos cadastrados, aplicar aumento ou redução
//de preços, realizar operações de entrada e saída de estoque, pesquisar produtos e registrar movimentações.
// A comunicação com o back-end ocorre via RMI através dos serviços servico.ServicoProduto e servico.ServicoMovimentacao.
public class FrmGerenciaEstoque extends javax.swing.JFrame {

    // Serviço remoto responsável pela manipulação de produtos (estoque, preço, listagem, exclusões e consultas).
    private final ServicoProduto servicoProduto;
    // Serviço remoto responsável pelo registro e listagem de movimentações.
    private final ServicoMovimentacao servicoMovimentacao;

    // Construtor da tela de gerenciamento de estoque.
    public FrmGerenciaEstoque(ServicoMovimentacao servicoMovimentacao, ServicoProduto servicoProduto) {
        initComponents();
        setLocationRelativeTo(null);
        this.servicoProduto = servicoProduto;
        this.servicoMovimentacao = servicoMovimentacao;
        carregarProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JCOperacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JBAlterarQuantidade = new javax.swing.JButton();
        JBAplicarAumento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTFAumentoPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFReducaoPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        JBAplicarReducao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Estoque");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JTEstoque.setBackground(new java.awt.Color(204, 204, 204));
        JTEstoque.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTEstoque.setForeground(new java.awt.Color(51, 51, 51));
        JTEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Medida", "Preço", "Categoria", "Qntd. Mínima", "Qntd. Máxima"
            }
        ));
        JTEstoque.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTEstoque.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JTEstoque);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Quantidade: ");

        JTFQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidade.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFQuantidade.setForeground(new java.awt.Color(51, 51, 51));
        JTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Operação:");

        JCOperacao.setBackground(new java.awt.Color(204, 204, 204));
        JCOperacao.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JCOperacao.setForeground(new java.awt.Color(51, 51, 51));
        JCOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída" }));
        JCOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCOperacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Aumento Percentual:");

        JBAlterarQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        JBAlterarQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAlterarQuantidade.setForeground(new java.awt.Color(51, 51, 51));
        JBAlterarQuantidade.setText("Alterar Quantidade");
        JBAlterarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarQuantidadeActionPerformed(evt);
            }
        });

        JBAplicarAumento.setBackground(new java.awt.Color(204, 204, 204));
        JBAplicarAumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAplicarAumento.setForeground(new java.awt.Color(51, 51, 51));
        JBAplicarAumento.setText("Aplicar Aumento de Preço");
        JBAplicarAumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarAumentoActionPerformed(evt);
            }
        });

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerência de Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        JTFAumentoPreco.setBackground(new java.awt.Color(204, 204, 204));
        JTFAumentoPreco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFAumentoPreco.setForeground(new java.awt.Color(51, 51, 51));
        JTFAumentoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAumentoPrecoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Redução Percentual:");

        JTFReducaoPreco.setBackground(new java.awt.Color(204, 204, 204));
        JTFReducaoPreco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFReducaoPreco.setForeground(new java.awt.Color(51, 51, 51));
        JTFReducaoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFReducaoPrecoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Encontrar Produto:");

        JTFPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        JTFPesquisar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        JTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPesquisarActionPerformed(evt);
            }
        });

        JBPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        JBPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JBAplicarReducao.setBackground(new java.awt.Color(204, 204, 204));
        JBAplicarReducao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAplicarReducao.setForeground(new java.awt.Color(51, 51, 51));
        JBAplicarReducao.setText("Aplicar Redução de Preço");
        JBAplicarReducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarReducaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFQuantidade))
                            .addComponent(JBAlterarQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTFAumentoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBAplicarAumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JTFReducaoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBAplicarReducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JCOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFReducaoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFAumentoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlterarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAplicarReducao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAplicarAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(JBFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // Fecha a tela atual.
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBAplicarAumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarAumentoActionPerformed
        // Aplica aumento de preço ao produto selecionado.
        // O aumento é calculado como percentual positivo. Internamente, utiliza o
        //método do back-end aplicarDesconto, enviando um valor negativo para representar aumento.
        // Após a operação, uma movimentação de tipo entrada é registrada para controle histórico.
        int selectedRow = JTEstoque.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto.");
            return;
        }

        try {
            int idProduto = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 0).toString());
            double percentual = Double.parseDouble(JTFAumentoPreco.getText()) / 100.0;

            servicoProduto.aplicarDesconto(idProduto, -percentual);

            registrarMov(idProduto, "entrada", 0,
                    "AUMENTO DE: +" + (percentual * 100) + "%");

            JOptionPane.showMessageDialog(this, "Preço aumentado.");
            carregarProdutos();
            JTFAumentoPreco.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao aplicar aumento: " + e.getMessage());
        }
    }//GEN-LAST:event_JBAplicarAumentoActionPerformed

    private void JTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeActionPerformed
        // Evento padrão do campo de quantidade.
    }//GEN-LAST:event_JTFQuantidadeActionPerformed

    private void JCOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCOperacaoActionPerformed
        // Evento padrão da combo de operação (Entrada/Saída).
    }//GEN-LAST:event_JCOperacaoActionPerformed

    private void JTFAumentoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAumentoPrecoActionPerformed
        // Evento padrão do campo de aumento de preço.
    }//GEN-LAST:event_JTFAumentoPrecoActionPerformed

    private void JTFReducaoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFReducaoPrecoActionPerformed
        // Evento padrão do campo de redução de preço.
    }//GEN-LAST:event_JTFReducaoPrecoActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        // Realiza busca de produto com base no texto digitado.
        // Caso seja número, busca por ID; caso contrário, busca por nome.
        String texto = JTFPesquisar.getText().trim();

        if (texto.matches("\\d+")) {
            buscarPorId(Integer.parseInt(texto));
        } else {
            buscarPorNome(texto);
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JBAplicarReducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarReducaoActionPerformed
        // Aplica redução de preço ao produto selecionado.
        int selectedRow = JTEstoque.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto.");
            return;
        }

        try {
            int idProduto = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 0).toString());
            double percentual = Double.parseDouble(JTFReducaoPreco.getText()) / 100.0;

            servicoProduto.aplicarDesconto(idProduto, percentual);

            registrarMov(idProduto, "saida", 0,
                    "REDUÇÃO DE: -" + (percentual * 100) + "%");

            JOptionPane.showMessageDialog(this, "Desconto aplicado.");
            carregarProdutos();
            JTFReducaoPreco.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao aplicar desconto: " + e.getMessage());
        }
    }//GEN-LAST:event_JBAplicarReducaoActionPerformed

    private void JBAlterarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarQuantidadeActionPerformed
        // Realiza entrada ou saída de estoque para o produto selecionado,
        //atualizando sua quantidade e registrando movimentação correspondente.
        // Também exibe alertas caso o estoque resultante esteja abaixo da mínima ou acima da máxima configurada.
        int selectedRow = JTEstoque.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto.");
            return;
        }

        try {
            int idProduto = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 0).toString());
            int quantidadeAtual = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 2).toString());
            int quantidade = Integer.parseInt(JTFQuantidade.getText());
            String operacao = JCOperacao.getSelectedItem().toString();

            int novaQuantidade = operacao.equals("Entrada")
                    ? quantidadeAtual + quantidade
                    : quantidadeAtual - quantidade;

            if (novaQuantidade < 0) {
                JOptionPane.showMessageDialog(this, "A quantidade final não pode ser negativa.");
                return;
            }

            servicoProduto.atualizarEstoque(idProduto, novaQuantidade);

            registrarMov(idProduto,
                    operacao.equals("Entrada") ? "entrada" : "saida",
                    quantidade,
                    "MOV. DE ESTOQUE");

            JOptionPane.showMessageDialog(this, "Estoque atualizado.");
            carregarProdutos();

            Produto produto = servicoProduto.buscarProdutoPorId(idProduto);

            if (produto.getQuantidadeEstoque() < produto.getQuantidadeMinima()) {
                JOptionPane.showMessageDialog(this,
                        "Estoque abaixo da quantidade mínima!\n"
                        + "Em estoque: " + produto.getQuantidadeEstoque()
                        + "\nMínima: " + produto.getQuantidadeMinima(),
                        "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
            }

            if (produto.getQuantidadeEstoque() > produto.getQuantidadeMaxima()) {
                JOptionPane.showMessageDialog(this,
                        "Estoque acima da quantidade máxima!\n"
                        + "Em estoque: " + produto.getQuantidadeEstoque()
                        + "\nMáxima: " + produto.getQuantidadeMaxima(),
                        "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
            }

            JTFQuantidade.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_JBAlterarQuantidadeActionPerformed

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // Ação do campo de pesquisa: executa a busca imediatamente.
        JBPesquisar.doClick();
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    //  Carrega todos os produtos via serviço remoto e popula a tabela de estoque.
    private void carregarProdutos() {
        try {
            DefaultTableModel model = (DefaultTableModel) JTEstoque.getModel();
            model.setRowCount(0);

            List<Produto> lista = servicoProduto.listarProdutos();

            for (Produto p : lista) {
                model.addRow(new Object[]{
                    p.getIdProduto(),
                    p.getNome(),
                    p.getQuantidadeEstoque(),
                    p.getUnidade(),
                    p.getPrecoUnitario(),
                    p.getCategoria(),
                    p.getQuantidadeMinima(),
                    p.getQuantidadeMaxima()
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar produtos: " + e.getMessage());
        }
    }

    // Busca um produto pelo ID informado e atualiza a tabela exibindo apenas o resultado encontrado.
    private void buscarPorId(int idProduto) {
        try {
            Produto p = servicoProduto.buscarProdutoPorId(idProduto);
            DefaultTableModel model = (DefaultTableModel) JTEstoque.getModel();
            model.setRowCount(0);

            if (p != null) {
                model.addRow(new Object[]{
                    p.getIdProduto(),
                    p.getNome(),
                    p.getQuantidadeEstoque(),
                    p.getUnidade(),
                    p.getPrecoUnitario(),
                    p.getCategoria(),
                    p.getQuantidadeMinima(),
                    p.getQuantidadeMaxima()
                });
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar produto: " + e.getMessage());
        }
    }

    // Busca produtos cujo nome contenha o texto informado.
    private void buscarPorNome(String nome) {
        try {
            List<Produto> lista = servicoProduto.buscarProdutoPorNome(nome);
            DefaultTableModel model = (DefaultTableModel) JTEstoque.getModel();
            model.setRowCount(0);

            for (Produto p : lista) {
                model.addRow(new Object[]{
                    p.getIdProduto(),
                    p.getNome(),
                    p.getQuantidadeEstoque(),
                    p.getUnidade(),
                    p.getPrecoUnitario(),
                    p.getCategoria(),
                    p.getQuantidadeMinima(),
                    p.getQuantidadeMaxima()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar produtos: " + e.getMessage());
        }
    }

    // Registra uma movimentação de estoque ou de preço no back-end.
    private void registrarMov(int idProduto, String tipo, int quantidade, String obs) {
        try {
            servicoMovimentacao.registrarMovimentacao(
                    idProduto,
                    tipo,
                    quantidade,
                    obs
            );
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Erro ao registrar movimentação: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterarQuantidade;
    private javax.swing.JButton JBAplicarAumento;
    private javax.swing.JButton JBAplicarReducao;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JComboBox<String> JCOperacao;
    private javax.swing.JTable JTEstoque;
    private javax.swing.JTextField JTFAumentoPreco;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFReducaoPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
