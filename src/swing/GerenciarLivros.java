package swing;

import bean.Livro;
import infra.UtilTela;
import rn.LivroRN;
import com.towel.el.annotation.AnnotationResolver;
import com.towel.swing.table.ObjectTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oxossi-pc
 * @version 2.4
 */
public class GerenciarLivros extends javax.swing.JInternalFrame {

    List<Livro> lista = new ArrayList<>();
    TelaPrincipal telaPrincipal;
    
    /**
     * Creates new form GerenciarLivros
     */
    public GerenciarLivros(TelaPrincipal p_tela) {
        initComponents();
        populaTabela();
        telaPrincipal = p_tela;
    }
    
    public void populaTabela() {
      
        try {

            lista = new LivroRN().listaLivro();

            AnnotationResolver resolver2 = new AnnotationResolver(Livro.class);
            ObjectTableModel<Livro> tableModel2 = new ObjectTableModel<Livro>(resolver2, "id,titulo,autor,isbn,ano,descricao");
            tableModel2.setData(lista);
            tbGerenciarLivros.getTableHeader().setReorderingAllowed(false);
            tbGerenciarLivros.setModel(tableModel2);
            
        } catch (Exception e) {
            e.printStackTrace();
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
        tbGerenciarLivros = new javax.swing.JTable();

        setClosable(true);
        setTitle("Gerenciar Livros - Sistema Biblioteca ROS");
        setPreferredSize(new java.awt.Dimension(610, 513));

        tbGerenciarLivros.setModel(new javax.swing.table.DefaultTableModel(
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
        tbGerenciarLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGerenciarLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGerenciarLivros);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGerenciarLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGerenciarLivrosMouseClicked
        // Ao clicar em algum campo da tabale gerenciar livros é executado este método.
        
        if(evt.getClickCount() == 2){
            
            int index = tbGerenciarLivros.getSelectedRow();
            Livro livro = lista.get(index);
                       
//            CadastrarLivro cadastrar = new CadastrarLivro(livro);
//            cadastrar.setVisible(true);
//            telaPrincipal.add(cadastrar);
//            telaPrincipal.moveToFront(cadastrar);
//            try{
//            cadastrar.setSelected(true);
//            }catch(Exception e){}
            
            UtilTela.abreTela(telaPrincipal, new CadastrarLivro(livro,this));
        }
        
    }//GEN-LAST:event_tbGerenciarLivrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGerenciarLivros;
    // End of variables declaration//GEN-END:variables
}
