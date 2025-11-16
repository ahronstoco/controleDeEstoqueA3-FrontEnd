package visao;

import modelo.Produto;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Categoria;
import servico.ServicoCategoria;
import servico.ServicoProduto;

public class FrmCadastroProduto extends javax.swing.JFrame {

    private final ServicoProduto servicoProduto;
    private final ServicoCategoria servicoCategoria;
    private JComboBox<Categoria> JCCategoria;

    public FrmCadastroProduto(ServicoProduto servicoProduto, ServicoCategoria servicoCategoria) {
        initComponents();
        setLocationRelativeTo(null);

        this.servicoProduto = servicoProduto;
        this.servicoCategoria = servicoCategoria;

        configurarCategoriaCombo();
        carregarCategorias();
        carregarProdutos();
    }

    private void configurarCategoriaCombo() {
        JCCategoria = new JComboBox<>();
        JCCategoria.setBounds(600, 57, 150, 20); // ajuste as coordenadas
        JCCategoria.setBackground(new Color(209, 209, 209));      // fundo escuro
        JCCategoria.setForeground(Color.BLACK);   // texto claro
        JCCategoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12)); // mesma fonte usada no JCMedida
        getContentPane().add(JCCategoria);
    }

    private void carregarCategorias() {
        try {
            JCCategoria.removeAllItems();

            for (Categoria cat : servicoCategoria.listarCategorias()) {
                JCCategoria.addItem(cat);
            }

        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar categorias (RMI): " + e.getMessage());
        }
    }

    private void carregarProdutos() {
        try {
            DefaultTableModel model = (DefaultTableModel) JTProduto.getModel();
            model.setRowCount(0);

            for (Produto p : servicoProduto.listarProdutos()) {
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

        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar produtos (RMI): " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        JTFQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTProduto = new javax.swing.JTable();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JTFQuantidadeMinima = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFQuantidadeMaxima = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JCMedida = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Categoria:");

        JTFNome.setBackground(new java.awt.Color(204, 204, 204));
        JTFNome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFNome.setForeground(new java.awt.Color(0, 0, 0));
        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        JTFPreco.setBackground(new java.awt.Color(204, 204, 204));
        JTFPreco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFPreco.setForeground(new java.awt.Color(0, 0, 0));

        JTFQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidade.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        JTProduto.setBackground(new java.awt.Color(204, 204, 204));
        JTProduto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTProduto.setForeground(new java.awt.Color(51, 51, 51));
        JTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Medida", "Preço", "Categoria", "Qntd. Mínima", "Qntd. Máxima"
            }
        ));
        JTProduto.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTProduto.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JTProduto);

        JBAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        JBAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAdicionar.setForeground(new java.awt.Color(51, 51, 51));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBRemover.setBackground(new java.awt.Color(204, 204, 204));
        JBRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBRemover.setForeground(new java.awt.Color(51, 51, 51));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Quantidade Minima:");

        JTFQuantidadeMinima.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidadeMinima.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeMinimaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Quantidade Máxima:");

        JTFQuantidadeMaxima.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidadeMaxima.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFQuantidadeMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeMaximaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Medida:");

        JCMedida.setBackground(new java.awt.Color(204, 204, 204));
        JCMedida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JCMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidade", "Kilogramas", "Gramas", "Litros", "Mililitros" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(JTFQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(JTFQuantidadeMaxima)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JTFQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(208, 208, 208)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JTFQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JTFQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JCMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFechar)
                    .addComponent(JBRemover)
                    .addComponent(JBAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        // TODO add your handling code here:
        int row = JTProduto.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para remover.");
            return;
        }

        int idProduto = (int) JTProduto.getValueAt(row, 0);

        try {
            servicoProduto.excluirProduto(idProduto);
            carregarProdutos();
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir produto (RMI): " + e.getMessage());
        }
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTFQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeMinimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeMinimaActionPerformed

    private void JTFQuantidadeMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeMaximaActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        // TODO add your handling code here:
         try {

            if (JTFNome.getText().trim().isEmpty()) {
                throw new Exception("O nome não pode estar vazio.");
            }

            Categoria categoria = (Categoria) JCCategoria.getSelectedItem();
            if (categoria == null) {
                throw new Exception("Selecione uma categoria.");
            }

            Produto produto = new Produto();
            produto.setNome(JTFNome.getText());
            produto.setUnidade(JCMedida.getSelectedItem().toString());
            produto.setCategoria(categoria);

            produto.setQuantidadeEstoque(Integer.parseInt(JTFQuantidade.getText()));
            produto.setQuantidadeMinima(Integer.parseInt(JTFQuantidadeMinima.getText()));
            produto.setQuantidadeMaxima(Integer.parseInt(JTFQuantidadeMaxima.getText()));
            produto.setPrecoUnitario(Double.parseDouble(JTFPreco.getText()));

            servicoProduto.salvarProduto(produto);

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso.");
            carregarProdutos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valores numéricos inválidos.");
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro no servidor: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto: " + e.getMessage());
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JComboBox<String> JCMedida;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFQuantidadeMaxima;
    private javax.swing.JTextField JTFQuantidadeMinima;
    private javax.swing.JTable JTProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
