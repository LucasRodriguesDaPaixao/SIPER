/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Carrinho;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriel Brune
 */
public class DaoCarrinho {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    public void adicionar(Carrinho carrinho ){

 
    String inserir = "insert into carrinho (nome,preço, FK_id_pedido,FK_Id_produto) values (?, ?, ?, ?)";
    try{
        PreparedStatement dados = conexao.prepareStatement(inserir);
        dados.setString(1, carrinho.getNome());
        dados.setString(2, carrinho.getPreço());
        dados.setString(3, carrinho.getPedido());
        dados.setString(4, carrinho.getProduto());
        dados.execute();
         dados.close();

        }catch(SQLException error){
         throw new RuntimeException(error);
        }

 
    }
    public ResultSet listar(){
        
        String sql = "Select * from carrinho";
        ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            dados = stmt.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
       }
    }
    
}    