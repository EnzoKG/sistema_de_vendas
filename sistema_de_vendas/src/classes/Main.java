package classes;

import forms.frmLogin;

/**
 *
 * @author enzog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dados dados = new Dados();
        frmLogin Login = new frmLogin(); 
        Login.setDados(dados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    
}
