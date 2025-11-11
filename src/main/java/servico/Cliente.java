package servico;

import servico.ServicoEstoque;
import visao.FrmMenuPrincipal;
import java.rmi.Naming;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {
        try {
            String url = "rmi://localhost:1099/EstoqueService";

            System.out.println("Tentando conectar ao servidor RMI em: " + url);

            ServicoEstoque service = (ServicoEstoque) Naming.lookup(url);

            System.out.println("Conectado com sucesso ao servidor RMI.");

            java.awt.EventQueue.invokeLater(() -> {
                new FrmMenuPrincipal(service).setVisible(true);
            });

        } catch (Exception e) {
            System.err.println("Erro ao conectar com o servidor:");
            e.printStackTrace();

            JOptionPane.showMessageDialog(null,
                    "Nao foi possivel conectar ao servidor.\n"
                    + "Verifique se o servidor RMI esta ativo.\n\n"
                    + "Detalhes: " + e.getMessage(),
                    "Erro de Conexao",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
