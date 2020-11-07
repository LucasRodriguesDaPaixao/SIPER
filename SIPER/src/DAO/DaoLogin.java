/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class DaoLogin {
    private Connection conexao = ConnectionFactory.getConnection();
    
    public void adicionarSemCpf(Cliente cliente)
    {
        String sql = "INSERT INTO cliente (nome) VALUES (?)";
        
        try
        {
           PreparedStatement stmt = conexao.prepareStatement(sql);
           stmt.setString(1, cliente.getNome());
           
           stmt.execute();
           stmt.close();

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void adicionarComCpf(Cliente cliente)
    {
        String sql = "INSERT INTO cliente (nome, cpf) VALUES (?, ?)";
        
        try
        {
           PreparedStatement stmt = conexao.prepareStatement(sql);
           stmt.setString(1, cliente.getNome());
           stmt.setString(2, cliente.getCpf());
           
           stmt.execute();
           stmt.close();

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
