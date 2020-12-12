/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Pedido;
import Model.Produto;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author lucas
 */
public class DaoPedidos {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    /*public ResultSet listar()
    {
        
        String sql = "select produto.nome, produto.preco "
                + "from produto "
                + "inner join pedido_produto on produto.idProduto = pedido_produto.produtos "
                + "inner join pedido on pedido_produto.pedidos = pedido.idPedido ";
        ResultSet dados;
        
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            dados = stmt.executeQuery();
            return dados;
            
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }*/
    
    public ResultSet listar(String categoria)
    {
        String sql = "Select * from produto where FK_categoria = (?)";
        ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, categoria);
            dados = stmt.executeQuery();
            return dados;
            
        }
        catch(SQLException error)
        {
            throw new RuntimeException(error);
        }
    }
    
    public void adicionarPedido(int idCliente)
    {
        String inserirPedido = "call Insere_Pedido(?)";
        
        try
        {
            CallableStatement dados = conexao.prepareCall(inserirPedido);
            dados.setInt(1, idCliente);
            dados.execute();
            
            dados.close();

        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public void adicionarPedidoProduto(int idProduto, Produto produto, int idPedido)
    {
        String inserirPedidoProduto = "call Insere_PedidoProduto(?, ?, ?)";
        
        try
        {
            CallableStatement dados = conexao.prepareCall(inserirPedidoProduto);
            dados.setInt(1, idProduto);
            dados.setDouble(2, produto.getPreco());
            dados.setInt(3, idPedido);
            
            dados.execute();
            dados.close();
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public ResultSet receberIdProduto(String nome)
    {
        String sql = "call GetIdProduto(?)";
        try
        {
            CallableStatement cb = conexao.prepareCall(sql);

            cb.setString(1, nome);
            
            ResultSet dados = cb.executeQuery();
            return dados;

        } 
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public int receberIdPedido()
    {
        String sql = "call GetIdPedido(?)";
        try
        {
            CallableStatement cb = conexao.prepareCall(sql);
            
            cb.registerOutParameter(1, Types.INTEGER);
            
            cb.execute();
            
            int idPedido = cb.getInt(1);
            return idPedido;
        } 
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }
}