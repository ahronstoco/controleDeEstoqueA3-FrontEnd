package principal;

import javax.swing.JOptionPane;
import servico.ConexaoRMI;
import servico.ServicoProduto;
import servico.ServicoCategoria;
import servico.ServicoMovimentacao;
import visao.FrmMenuPrincipal;

public class Principal {

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Não foi possível aplicar o visual Nimbus.");
        }

        try {
            System.out.println("Conectando ao servidor RMI...");

            ServicoProduto servicoProduto = ConexaoRMI.produto();
            ServicoCategoria servicoCategoria = ConexaoRMI.categoria();
            ServicoMovimentacao servicoMovimentacao = ConexaoRMI.movimentacao();

            System.out.println("Conexoo estabelecida.");

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