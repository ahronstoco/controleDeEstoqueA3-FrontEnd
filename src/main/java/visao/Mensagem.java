package visao;

// Exceção personalizada utilizada para representar erros de validação e mensagens amigáveis
//ao usuário durante operações nos formulários da camada de visão.
// Esta classe permite que erros de regra de negócio ou preenchimento incorreto sejam lançados de
// forma clara no front-end, sem misturar exceções técnicas (SQL, RMI, etc.) com mensagens destinadas ao usuário final.
// A classe estende Exception, permitindo que seja capturada nos blocos <code>try/catch</code> das telas e exibida diretamente
//em caixas de diálogo via javax.swing.JOptionPane.
public class Mensagem extends Exception {

    // Cria uma nova exceção de mensagem personalizada.
    public Mensagem(String mensagem) {
        super(mensagem);
    }
}
