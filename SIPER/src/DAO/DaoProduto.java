/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriel Brune
 */
public class DaoProduto {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    public ResultSet listar(String categoria){
        
        String sql = "Select * from produto where FK_categoria = (?)";
        ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, categoria);
            dados = stmt.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
       }
    }
     

public ResultSet imagem (String id){
    String sql = "Select * from imagem where  idimagem = (?)";
      ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, id);
            dados = stmt.executeQuery();
            return dados;
        }catch(SQLException error){
            throw new RuntimeException(error);
}
}




           
       
}


