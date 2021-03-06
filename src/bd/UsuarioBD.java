/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;

/**
 *
 * @author Oxossi-pc
 */
public class UsuarioBD {

    static Logger log = Logger.getLogger(UsuarioBD.class);

    public void salvar(Usuario p_usuario) {
        Connection conn = null;
        try {

            log.info("Abrindo conexão com o banco");

            conn = ConexaoBD.getConexao();
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO usuario (matricula, nome, telefone, cpf, sexo, email, usuario, senha) VALUES (?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            // pstm.setInt(1, p_usuario.getId());
            pstm.setInt(1, p_usuario.getMatricula());
            pstm.setString(2, p_usuario.getNome());
            pstm.setString(3, p_usuario.getTelefone());
            pstm.setString(4, p_usuario.getCPF());
            pstm.setString(5, p_usuario.getSexo());
            pstm.setString(6, p_usuario.getEmail());
            pstm.setString(7, p_usuario.getUser());
            pstm.setString(8, p_usuario.getPass());

            log.info("Inserindo.. Usuário no banco de dados");
//            System.out.println(pstm);
            pstm.executeUpdate();
            
            Long id = ConexaoBD.getLastKey(pstm);
            p_usuario.setId(id == null ? null : id.intValue());
            
//            ResultSet rs = pstm.getGeneratedKeys();
//            
//            if (rs.next()){
//                Long id = rs.getLong(1);
//                p_usuario.setId(id.intValue());
//            }
        
            log.info("Usuário criado, seu ID = "+p_usuario.getId());
            
        } catch (Exception e) {
            log.error("Erro ao tentar inserir usuário");
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public void editar(Usuario p_usuario) {
                
        Connection conn = null;
        try {
            
            log.info("Abrindo conexão com o banco");
            
            conn = ConexaoBD.getConexao();
            PreparedStatement pstm = conn.prepareStatement(""
                    + "update usuario set "
                     + "matricula = ? ,"
                    + "nome = ? ,"
                    + "telefone = ? ,"
                    + "cpf = ? ,"
                    + "sexo = ? ,"
                    + "email = ? ,"
                    + "usuario = ? ,"
                    + "senha = ? "                     
                    + "where id = ?");
            
            pstm.setInt(1,p_usuario.getMatricula());
            pstm.setString(2,p_usuario.getNome());
            pstm.setString(3,p_usuario.getTelefone());          
            pstm.setString(4, p_usuario.getCPF());
            pstm.setString(5, p_usuario.getSexo());
            pstm.setString(6, p_usuario.getEmail());
            pstm.setString(7, p_usuario.getUser());
            pstm.setString(8, p_usuario.getPass());
            pstm.setInt(9, p_usuario.getId());
            
            
            log.info("Usuario editado com sucesso!");

            pstm.executeUpdate();

            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }
                
    }
   
    public List<Usuario> listaUsuario() {
       List<Usuario> lista = new ArrayList<>();

        Connection conn = null;
        try {
            
            log.info("Abrindo conexão com o banco");
            
            conn = ConexaoBD.getConexao();

            log.info("Executando a busca dos usuários..");
            
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                Usuario usuarios = new Usuario();
              
                usuarios.setId(rs.getInt("id"));
                usuarios.setMatricula(rs.getInt("matricula"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setTelefone(rs.getString("telefone"));
                usuarios.setCPF(rs.getString("cpf"));
                usuarios.setSexo(rs.getString("sexo"));
                usuarios.setEmail(rs.getString("email"));
                usuarios.setUser(rs.getString("usuario"));
                usuarios.setPass(rs.getString("senha"));

                lista.add(usuarios);

            }
 //           System.out.println(lista);
            log.info("Lista de usuários encontrada.");
            return lista;

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
    }

     public void excluir(Usuario p_usuario) {
        Connection conn = null;
        try {

            conn = ConexaoBD.getConexao();

            PreparedStatement pstm = conn.prepareStatement("DELETE FROM usuario WHERE id=?");
            pstm.setInt(1, p_usuario.getId());

            pstm.execute();
            log.info("Usuario deletado com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public Vector<Usuario> pesquisar(String text)throws SQLException {
        //Carregar combo passando um vetor de categoria
        Vector<Usuario> dados = new Vector<Usuario>();

        
        // definição do SQL com base nos dados informados para pesquisa
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT *  ");
        sql.append("FROM usuario  ");
        sql.append("WHERE ");
        sql.append("id = ? ");
        //sql.append("OR nome = ? ");
        //sql.append("OR matricula like ? ");
       //sql.append("OR email like ? ");
        
        Connection conn = null;
        try {

            conn = ConexaoBD.getConexao();
            
            PreparedStatement pstm = conn.prepareStatement(sql.toString());
            pstm.setString(1, text);
          //  pstm.setString(2, "%" + text + "%");
           // pstm.setString(3, "%" + text + "%");
          //  pstm.setString(4, "%" + text + "%");
            log.info(pstm);
            log.debug("Pesquisando: " + text);            
            
            ResultSet rs = pstm.executeQuery();
           
            while (rs.next()) {

                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setMatricula(rs.getInt("matricula"));                
                
                log.debug("Registro encontrado");
                
                dados.add(user);                
            }
            log.debug("Pesquisa executada com sucesso");
            return dados;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
    }

}
