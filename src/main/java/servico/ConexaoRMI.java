package servico;

import java.rmi.Naming;

public class ConexaoRMI {

    private static final String HOST = "localhost";
    private static final int PORTA = 1099;

    private static String url(String nomeServico) {
        return String.format("rmi://%s:%d/%s", HOST, PORTA, nomeServico);
    }

    public static ServicoProduto produto() throws Exception {
        return (ServicoProduto) Naming.lookup(url("ProdutoService"));
    }

    public static ServicoCategoria categoria() throws Exception {
        return (ServicoCategoria) Naming.lookup(url("CategoriaService"));
    }

    public static ServicoMovimentacao movimentacao() throws Exception {
        return (ServicoMovimentacao) Naming.lookup(url("MovimentacaoService"));
    }
}
