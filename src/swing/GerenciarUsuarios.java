package swing;

import bean.Usuario;
import infra.UtilTela;
import rn.UsuarioRN;
import com.towel.el.annotation.AnnotationResolver;
import com.towel.swing.table.ObjectTableModel;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Oxossi-pc
 * @version 2.4
 */
public class GerenciarUsuarios extends javax.swing.JInternalFrame {
    
    List<Usuario> listaUsers = new ArrayList<>();
    TelaPrincipal telaPrincipal;
    static Logger log = Logger.getLogger(GerenciarUsuarios.class);
    
    /**
     * Creates new form GerenciarUsuarios
     */
    public GerenciarUsuarios(TelaPrincipal p_tela) {
        initComponents();
        populaTabela();
        telaPrincipal = p_tela;
    }

    public void populaTabela() {

        try {
            log.info("Iniciando o metodo populaTabela usuários");
            
            listaUsers = new UsuarioRN().listaUsuario();

            AnnotationResolver resolver = new AnnotationResolver(Usuario.class);
            ObjectTableModel<Usuario> tableModel = new ObjectTableModel<Usuario>(resolver, "id,matricula,nome,telefone");
            tableModel.setData(listaUsers);
            tbGerenciarUsuarios.getTableHeader().setReorderingAllowed(false);
            tbGerenciarUsuarios.setModel(tableModel);

        } catch (Exception e) {
            log.error("Erro ao listar os dados para popular a tabela usuários!" + e);
            System.err.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGerenciarUsuarios = new javax.swing.JTable();

        setClosable(true);
        setTitle("Gerenciar Usuários - Sistema Biblioteca");

        tbGerenciarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGerenciarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGerenciarUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGerenciarUsuarios);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGerenciarUsuariosMouseClicked
        // Ao clicar em algum campo da tabale gerenciar usuários é executado este método.
        
        if(evt.getClickCount() == 2){
            
            int index = tbGerenciarUsuarios.getSelectedRow();
            Usuario usuario = listaUsers.get(index);
            
//            CadastrarUsuario cadastrar = new CadastrarUsuario(usuario);
//            telaPrincipal.adicionaJIF(cadastrar);
//            cadastrar.setVisible(true);
            UtilTela.abreTela(telaPrincipal, new CadastrarUsuario(usuario,this));            
        }
        
    }//GEN-LAST:event_tbGerenciarUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGerenciarUsuarios;
    // End of variables declaration//GEN-END:variables

}
