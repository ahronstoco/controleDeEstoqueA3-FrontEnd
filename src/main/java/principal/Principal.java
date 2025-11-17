package principal;

import javax.swing.JOptionPane;
import servico.ConexaoRMI;
import servico.ServicoProduto;
import servico.ServicoCategoria;
import servico.ServicoMovimentacao;
import visao.FrmMenuPrincipal;

// Classe responsável por inicializar o cliente do sistema e estabelecer a conexão com o servidor RMI.
// Esta é a classe principal da camada de apresentação (front-end).
// Sua função é:
// Configurar o visual (Look and Feel) da interface gráfica;
// Realizar a conexão com os serviços remotos por meio de RMI;
// Instanciar e exibir o menu principal da aplicação;
// Exibir mensagens de erro caso a conexão com o back-end falhe.
// A classe utiliza a classe ConexaoRMI para recuperar as instâncias remotas dos serviços de
// Produto, Categoria e Movimentação, necessários para o funcionamento das telas.
public class Principal {

    // Método principal responsável por iniciar a aplicação cliente.
    public static void main(String[] args) {

        // Aplica o Look and Feel Nimbus, se disponível.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Nao foi possivel aplicar o visual Nimbus.");
        }

        // Obtém os serviços remotos.
        try {
            System.out.println("Conectando ao servidor RMI.");

            ServicoProduto servicoProduto = ConexaoRMI.produto();
            ServicoCategoria servicoCategoria = ConexaoRMI.categoria();
            ServicoMovimentacao servicoMovimentacao = ConexaoRMI.movimentacao();

            System.out.println("Conexao estabelecida.");

            // Abre a interface gráfica na Event Dispatch Thread.
            java.awt.EventQueue.invokeLater(() -> {
                FrmMenuPrincipal tela = new FrmMenuPrincipal(
                        servicoProduto,
                        servicoCategoria,
                        servicoMovimentacao
                );
                tela.setVisible(true);
            });

        } catch (Exception e) {
            System.err.println("Erro ao conectar ao servidor RMI:");
            e.printStackTrace();

            JOptionPane.showMessageDialog(null,
                    "Não foi possível conectar ao servidor RMI.\n" +
                    "Verifique se o BACKEND está rodando.\n\n" +
                    "Detalhes: " + e.getMessage(),
                    "Erro de Conexão",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}