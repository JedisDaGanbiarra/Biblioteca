package rn;

import bd.EmprestimoBD;
import bean.Emprestimo;
import bean.Livro;
import bean.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oxossi-pc
 */
public class EmprestimoRN {

    EmprestimoBD bd;

    public EmprestimoRN() {
        bd = new EmprestimoBD();

    }

    public void salvar(Emprestimo p_emprestimo) {
        bd.salvar(p_emprestimo);
    }

    public void devolucao(Emprestimo p_emprestimo) {
        bd.devolucao(p_emprestimo);
    }

    public List<Emprestimo> listaEmprestimoDoUsuario(Usuario p_usuario) {
        return bd.listaEmprestimoDoUsuario(p_usuario);
    }

    public void excluir(Usuario p_usuario) {
        bd.excluir(p_usuario);
    }
    
    public List<Emprestimo> listaEmprestimos(){
        return bd.listaEmprestimos();
    }
    
//    public void emprestar(int p_val1, int p_val2){
//        bd.emprestar(p_val1, p_val2);
//    }
    
}
