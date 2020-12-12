/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class DaoCozinheiro {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    public ResultSet listar()
    {
        
        String sql = "select cliente.nome, pedido_produto.pedidos, sum(pedido_produto.valorTotal), pedido.estatus "
                + "from pedido_produto "
                + "inner join pedido on pedido_produto.pedidos = pedido.idPedido "
                + "inner join cliente on pedido.FK_cliente = cliente.idCliente "
                + "group by pedidos "
                + "order by pedidos";
        
        ResultSet dados;
        
        try
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            dados = stmt.executeQuery();
            return dados;
            
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public ResultSet listarPedido(String pedido)
    {
        String sql = "SELECT produto.nome, COUNT(produto.nome) AS NumeroDePedidos "
                + "FROM pedido_produto INNER JOIN produto on pedido_produto.produtos = produto.idProduto "
                + "WHERE pedidos = (?) "
                + "GROUP BY produto.nome";
        
        ResultSet dados;
        
        try
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, pedido);
            dados = stmt.executeQuery();
            return dados;
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }  
    
    public void atualizaStatus(String estatus, int id)
    {
        String sql = "UPDATE pedido SET estatus = ? WHERE idPedido = ? ";
        
        try
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, estatus);
            stmt.setInt(2, id);
            
            stmt.execute();
            stmt.close();
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
