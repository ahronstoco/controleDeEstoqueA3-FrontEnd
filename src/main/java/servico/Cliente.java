package servico;

import visao.FrmMenuPrincipal;
import java.rmi.Naming;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {
        try {
            
            String urlProduto = "rmi://localhost:1099/ProdutoService";
            String urlCategoria = "rmi://localhost:1099/CategoriaService";
            String urlMovimentacao = "rmi://localhost:1099/MovimentacaoService";

            System.out.println("Tentando conectar aos serviços RMI...");

            ServicoProduto servicoProduto = (ServicoProduto) Naming.lookup(urlProduto);
            ServicoCategoria servicoCategoria = (ServicoCategoria) Naming.lookup(urlCategoria);
            ServicoMovimentacao servicoMovimentacao = (ServicoMovimentacao) Naming.lookup(urlMovimentacao);

            System.out.println("Conexão com todos os serviços RMI estabelecida com sucesso.");

            java.awt.EventQueue.invokeLater(() -> {
                new FrmMenuPrincipal(servicoProduto, servicoCategoria, servicoMovimentacao).setVisible(true);
            });

        } catch (Exception e) {
            System.err.println("Erro ao conectar com o servidor RMI:");
            e.printStackTrace();

            JOptionPane.showMessageDialog(null,
                    "Não foi possível conectar aos serviços RMI.\n"
                    + "Verifique se o servidor está ativo.\n\n"
                    + "Detalhes: " + e.getMessage(),
                    "Erro de Conexão",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}