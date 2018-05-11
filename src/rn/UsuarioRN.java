package rn;

import bd.UsuarioBD;
import bean.Usuario;
import rnval.UsuarioRNVAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 *
 * @author Oxossi-pc
 */
public class UsuarioRN {
    
    UsuarioBD bd;
    
    public UsuarioRN() {
        bd  = new UsuarioBD();
    }
 
    public void salvar(Usuario p_usuario){
         //se o getId for igual a "null" Salva se não Edita
        if(p_usuario.getId() == null){
            bd.salvar(p_usuario);
        }else{
            bd.editar(p_usuario);
        }
        
    }

    public void editar(Usuario p_usuario){
        bd.editar(p_usuario);
    }
    
    public List<Usuario> listaUsuario(){
        return bd.listaUsuario();
    }
    
    public void excluir(Usuario p_usuario){
        bd.excluir(p_usuario);
    }

    public Vector<Usuario> pesquisar(String text) throws SQLException {
       return bd.pesquisar(text);
    }
}
