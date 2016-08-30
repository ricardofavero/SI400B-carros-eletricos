/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recargacarro;

/**
 *
 * @author Acer
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private String email;
    private Localizacao localizacao;
    
    
    
    Localizacao getLocalizacao(){
        Localizacao tmp = new Localizacao(1.0,1.0);
        return tmp;
    }
    int getDistanciaPosto(Posto p){
        return 0;
    }
    void cadastrar(Usuario u){}
    void alterarCadastro(Usuario u){}
    void recuperarSenha(Usuario u){}
}
