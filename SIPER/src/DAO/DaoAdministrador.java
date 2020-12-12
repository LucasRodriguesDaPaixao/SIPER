/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Produto;
import Model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Lucas
 */
public class DaoAdministrador {
    
  
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    
    public ResultSet listar(){
        
        
        String sql = "Select * from produto";
        ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            dados = stmt.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
       }
    }

    
   
        
    public void adicionar(Produto produto ){
        
        String inserir = "insert into produto (preco, nome, fk_categoria) values (?, ?, ?)";
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setDouble(1, produto.getPreco());
            dados.setString(2, produto.getNome());
            dados.setInt(3, produto.getFkCategoria());


            dados.execute();
             dados.close();

        }catch(SQLException error){
            throw new RuntimeException(error);
        }

 
    }
    public void excluirProduto(String nome){
        String sql = "delete from produto  where  nome = (?)";
        ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,nome );
            stmt.execute();
            stmt.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }

    }
     public void alterar(Produto produto){
        String sql = "UPDATE produto SET nome = ? , preco = ?, fk_categoria = ? where nome = (?)";
        
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getFkCategoria());
            stmt.setString(4, produto.getNome());
           
            
            
            stmt.execute();
            stmt.close();
        } catch(SQLException erro){
            throw new RuntimeException(erro);
    }
    }

}