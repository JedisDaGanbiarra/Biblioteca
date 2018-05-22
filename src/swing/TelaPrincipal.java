package swing;

import bean.Emprestimo;
import bean.Livro;
import infra.UtilTela;
import rn.EmprestimoRN;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Oxossi-pc
 * @version 2.4
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemMenuImprimir = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itemMenuCadastrarUsuario = new javax.swing.JMenuItem();
        itemMenuGerenciarUsuarios = new javax.swing.JMenuItem();
        menuLivros = new javax.swing.JMenu();
        itemMenuCadastrarLivros = new javax.swing.JMenuItem();
        itemMenuCadastrarCategoria = new javax.swing.JMenuItem();
        itemMenuGerenciarLivros = new javax.swing.JMenuItem();
        menuEmprestimo = new javax.swing.JMenu();
        itemMenuNovoEmprestimo = new javax.swing.JMenuItem();
        itemMenuDevolucaoEmprestimo = new javax.swing.JMenuItem();
        itemMenuEmprestimos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemMenuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Biblioteca");

        desktopPanePrincipal.setBackground(new java.awt.Color(204, 204, 204));
        desktopPanePrincipal.setForeground(new java.awt.Color(204, 204, 204));
        desktopPanePrincipal.setEnabled(false);
        desktopPanePrincipal.setFocusCycleRoot(false);
        desktopPanePrincipal.setFocusable(false);
        desktopPanePrincipal.setOpaque(false);
        desktopPanePrincipal.setPreferredSize(new java.awt.Dimension(760, 550));
        desktopPanePrincipal.setRequestFocusEnabled(false);
        desktopPanePrincipal.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(desktopPanePrincipal, java.awt.BorderLayout.CENTER);

        jMenuBarPrincipal.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jMenuBarPrincipalHierarchyChanged(evt);
            }
        });
        jMenuBarPrincipal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuBarPrincipalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuBarPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jMenuBarPrincipalFocusLost(evt);
            }
        });

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        itemMenuImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        itemMenuImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/printer.png"))); // NOI18N
        itemMenuImprimir.setText("Imprimir");
        itemMenuImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuImprimirActionPerformed(evt);
            }
        });
        menuArquivo.add(itemMenuImprimir);

        itemMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        itemMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/door_in.png"))); // NOI18N
        itemMenuSair.setText("Sair");
        itemMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuSairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuSairMouseExited(evt);
            }
        });
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemMenuSair);

        jMenuBarPrincipal.add(menuArquivo);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_suit.png"))); // NOI18N
        menuUsuarios.setText("Gerenciar Usuários");

        itemMenuCadastrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        itemMenuCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_add.png"))); // NOI18N
        itemMenuCadastrarUsuario.setText("Cadastrar Usuário");
        itemMenuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemMenuCadastrarUsuario);

        itemMenuGerenciarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        itemMenuGerenciarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_suit.png"))); // NOI18N
        itemMenuGerenciarUsuarios.setText("Gerenciar Usuários");
        itemMenuGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuGerenciarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemMenuGerenciarUsuarios);

        jMenuBarPrincipal.add(menuUsuarios);

        menuLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        menuLivros.setText("Gerenciars Livros");

        itemMenuCadastrarLivros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        itemMenuCadastrarLivros.setText("Cadastrar Livro");
        itemMenuCadastrarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarLivrosActionPerformed(evt);
            }
        });
        menuLivros.add(itemMenuCadastrarLivros);

        itemMenuCadastrarCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        itemMenuCadastrarCategoria.setText("Cadastrar Categoria");
        itemMenuCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarCategoriaActionPerformed(evt);
            }
        });
        menuLivros.add(itemMenuCadastrarCategoria);

        itemMenuGerenciarLivros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        itemMenuGerenciarLivros.setText("Gerenciar Livros");
        itemMenuGerenciarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuGerenciarLivrosActionPerformed(evt);
            }
        });
        menuLivros.add(itemMenuGerenciarLivros);

        jMenuBarPrincipal.add(menuLivros);

        menuEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_up.png"))); // NOI18N
        menuEmprestimo.setText("Empréstimos");

        itemMenuNovoEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        itemMenuNovoEmprestimo.setText("Novo Empréstimo");
        itemMenuNovoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuNovoEmprestimoActionPerformed(evt);
            }
        });
        menuEmprestimo.add(itemMenuNovoEmprestimo);

        itemMenuDevolucaoEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        itemMenuDevolucaoEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_refresh.png"))); // NOI18N
        itemMenuDevolucaoEmprestimo.setText("Devolução ");
        itemMenuDevolucaoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuDevolucaoEmprestimoActionPerformed(evt);
            }
        });
        menuEmprestimo.add(itemMenuDevolucaoEmprestimo);

        itemMenuEmprestimos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        itemMenuEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_up.png"))); // NOI18N
        itemMenuEmprestimos.setText("Empréstimos");
        itemMenuEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuEmprestimosActionPerformed(evt);
            }
        });
        menuEmprestimo.add(itemMenuEmprestimos);

        jMenuBarPrincipal.add(menuEmprestimo);

        menuAjuda.setText("Ajuda");

        itemMenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        itemMenuSobre.setText("Sobre");
        itemMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemMenuSobre);

        jMenuBarPrincipal.add(menuAjuda);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/door_in.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(menuSair);

        setJMenuBar(jMenuBarPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        //Ao clicar no botão, dispara o evento de sair da aplicação.           
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void itemMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuSairMouseClicked

    }//GEN-LAST:event_itemMenuSairMouseClicked

    private void itemMenuSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuSairMouseExited

    }//GEN-LAST:event_itemMenuSairMouseExited

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        // Usuário clica em YES para finalizar a aplicação:
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Sair - Sistema Biblioteca", WIDTH, 3) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void itemMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSobreActionPerformed
        // TODO add your handling code here:
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_itemMenuSobreActionPerformed

    private void itemMenuCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        CadastrarUsuario cadastrar = new CadastrarUsuario();
        desktopPanePrincipal.add(cadastrar);
        cadastrar.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastrarUsuarioActionPerformed

    private void itemMenuCadastrarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarLivrosActionPerformed
        // TODO add your handling code here:

        UtilTela.abreTela(this, new CadastrarLivro());
    }//GEN-LAST:event_itemMenuCadastrarLivrosActionPerformed

    public void adicionaJIF(JInternalFrame jif) {
        desktopPanePrincipal.add(jif);
    }


    private void itemMenuGerenciarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuGerenciarLivrosActionPerformed

        UtilTela.abreTela(this, new GerenciarLivros(this));
    }//GEN-LAST:event_itemMenuGerenciarLivrosActionPerformed

    private void itemMenuCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarCategoriaActionPerformed
        // TODO add your handling code here:
        CadastrarCategoria cat = new CadastrarCategoria();
        cat.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastrarCategoriaActionPerformed

    private void itemMenuGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuGerenciarUsuariosActionPerformed
        // TODO add your handling code here:

//        GerenciarUsuarios gerenciar = new GerenciarUsuarios(this);
//        desktopPanePrincipal.add(gerenciar);
//        gerenciar.setVisible(true);
        UtilTela.abreTela(this, new GerenciarUsuarios(this));
    }//GEN-LAST:event_itemMenuGerenciarUsuariosActionPerformed

    private void itemMenuEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuEmprestimosActionPerformed
        // TODO add your handling code here:
        UtilTela.abreTela(this, new Emprestimos(this));
    }//GEN-LAST:event_itemMenuEmprestimosActionPerformed

    private void itemMenuNovoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNovoEmprestimoActionPerformed
        // TODO add your handling code here:
        UtilTela.abreTela(this, new NovoEmprestimo(this));
    }//GEN-LAST:event_itemMenuNovoEmprestimoActionPerformed

    private void itemMenuDevolucaoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuDevolucaoEmprestimoActionPerformed
        // TODO add your handling code here:
        UtilTela.abreTela(this, new Devolucao(this));
    }//GEN-LAST:event_itemMenuDevolucaoEmprestimoActionPerformed

    private void itemMenuImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuImprimirActionPerformed
        // TODO add your handling code here:

        try {
            EmprestimoRN empRN = new EmprestimoRN();
            List<Emprestimo> listaEmprestimo = empRN.listaEmprestimos();

            StringBuilder saidaCSV = new StringBuilder();
            // cabeçalho
            saidaCSV.append("CODIGO;USUARIO;LIVRO;DATA_EMPRESTIMO;DATA_DEVOLUCAO;DEVOLVIDO").append("\r\n");

            // conteúdo do relatório
            for (Emprestimo emp : listaEmprestimo) {
                saidaCSV.append(emp.getId()).append(";");
                saidaCSV.append(emp.getUsuario().getNome()).append(";");
                saidaCSV.append(emp.getLivro().getTitulo()).append(";");
                saidaCSV.append(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(emp.getDtEmprestimo())).append(";");
                saidaCSV.append(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(emp.getDtDevolucao())).append(";");
                saidaCSV.append(emp.getIndDevolvido()).append(";");

                saidaCSV.append("\r\n");
            }
            FileUtils.writeStringToFile(new File("Relatorio_de_Emprestimos.csv"), saidaCSV.toString());

            JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_itemMenuImprimirActionPerformed

    private void jMenuBarPrincipalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuBarPrincipalAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBarPrincipalAncestorAdded

    private void jMenuBarPrincipalHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jMenuBarPrincipalHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBarPrincipalHierarchyChanged

    private void jMenuBarPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuBarPrincipalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBarPrincipalFocusLost

    public void moveToFront(JInternalFrame jif) {
        desktopPanePrincipal.moveToFront(jif);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                new TelaPrincipal().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanePrincipal;
    private javax.swing.JMenuItem itemMenuCadastrarCategoria;
    private javax.swing.JMenuItem itemMenuCadastrarLivros;
    private javax.swing.JMenuItem itemMenuCadastrarUsuario;
    private javax.swing.JMenuItem itemMenuDevolucaoEmprestimo;
    private javax.swing.JMenuItem itemMenuEmprestimos;
    private javax.swing.JMenuItem itemMenuGerenciarLivros;
    private javax.swing.JMenuItem itemMenuGerenciarUsuarios;
    private javax.swing.JMenuItem itemMenuImprimir;
    private javax.swing.JMenuItem itemMenuNovoEmprestimo;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEmprestimo;
    private javax.swing.JMenu menuLivros;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
