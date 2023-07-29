package classes;

/**
 *
 * @author enzog
 */
public class Dados {
    
    private int MAX_USUARIOS = 50;
    
    private Usuarios user[] = new Usuarios[MAX_USUARIOS];
    
    private int idUsuario = 0;
    
    public Dados() {
        Usuarios usuario = new Usuarios("admin", "Enzo", "Kozoroski Giovanini", "123", "Administrador");
        user[idUsuario] = usuario;
        idUsuario++;
    }
    
    public int qtdUsers() {
        return idUsuario;
    }
    
    public Usuarios[] getUsuarios() {
        return user;
    }
    
    public boolean validaUsuarios(String usuario, String senha) {
        boolean x = false;
        for(int i = 0; i < idUsuario; i++) {
            if(user[i].getIdUsuario().equals(usuario) && user[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    public int linhaUsuario(String usuario) {
        for(int i = 0; i < idUsuario; i++) {
            if(user[i].getIdUsuario().equals(usuario)) {
                return i;
            }
        }
        return -1;
    }
    
    public String cadUsuario(Usuarios user) {
        if(idUsuario == MAX_USUARIOS) {
            return "Limite de usuários atingido!";
        }
        this.user[idUsuario] = user;
        idUsuario++;
        return "Cadastro REALIZADO com sucesso!";
    }

    public String editUsuario(Usuarios user, int posLinha) {
        this.user[posLinha].setNome(user.getNome());
        this.user[posLinha].setSobrenome(user.getSobrenome());
        this.user[posLinha].setSenha(user.getSenha());
        this.user[posLinha].setPerfil(user.getPerfil());
        return "Cadastro EDITADO com sucesso!";
    }
    
    public String delUsuario(int posLinha) {
        for(int i = posLinha; i < idUsuario; i++) {
            this.user[i] = user[i + 1];
        }
        idUsuario--;
        return "Cadastro DELETADO com sucesso!";
    }
}