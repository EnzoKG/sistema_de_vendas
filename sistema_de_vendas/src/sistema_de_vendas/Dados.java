package sistema_de_vendas;

/**
 *
 * @author enzog
 */
public class Dados {
    public boolean validaUsuarios(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("123");
    }
}
