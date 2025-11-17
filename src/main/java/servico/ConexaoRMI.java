package servico;

import java.rmi.Naming;

// Classe responsável por realizar a conexão com os serviços remotos via RMI.
// A ConexaoRMI centraliza a lógica de construção das URLs RMI e recuperação das instâncias remotas registradas no servidor.
// Cada método retorna o stub correspondente ao serviço desejado, permitindo ao frontend invocar métodos remotos do backend.
// Os serviços acessados são:
// ServicoProduto com operações relacionadas a produtos;
// ServicoCategoria com operações de gerenciamento de categorias;
// ServicoMovimentacao com registro e consulta de movimentações de estoque.
// A classe utiliza o Naming.lookup(String) para buscar o objeto remoto registrado no RMI Registry.
// Caso o serviço não esteja disponível ou ocorra qualquer falha de rede, uma exceção será lançada ao chamador.
public class ConexaoRMI {

    // Endereço do host onde o servidor RMI está sendo executado.
    private static final String HOST = "localhost";
    // Porta utilizada pelo RMI Registry.
    private static final int PORTA = 1099;

    // Constrói e retorna a URL completa de acesso ao serviço remoto.
    private static String url(String nomeServico) {
        return String.format("rmi://%s:%d/%s", HOST, PORTA, nomeServico);
    }

    // Recupera a instância remota do serviço de produtos.
    public static ServicoProduto produto() throws Exception {
        return (ServicoProduto) Naming.lookup(url("ProdutoService"));
    }

    // Recupera a instância remota do serviço de categorias.
    public static ServicoCategoria categoria() throws Exception {
        return (ServicoCategoria) Naming.lookup(url("CategoriaService"));
    }

    // Recupera a instância remota do serviço de movimentações.
    public static ServicoMovimentacao movimentacao() throws Exception {
        return (ServicoMovimentacao) Naming.lookup(url("MovimentacaoService"));
    }
}
