/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DaoCozinheiro;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ControllerCozinheiro 
{
    private final View.InterfaceCozinheiro tela;
    private DAO.DaoCozinheiro pedidos = new DaoCozinheiro();
    private ResultSet dados = pedidos.listar();
    
    public ControllerCozinheiro(View.InterfaceCozinheiro tela)
    {
        this.tela = tela;
    }
    
    public void PreencheTabela(JTable tblPedidos)
    {
        DefaultTableModel modelo = (DefaultTableModel) tblPedidos.getModel();
        modelo.setNumRows(0);
        
        try{
            while(dados.next())
            {
                modelo.addRow(new Object[]
                {
                    dados.getString(1),
                    dados.getString(2),
                    dados.getString(3),
                    verificaStatus()
                });
            }

        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public void ListaPedidos(JTable tblItens, String pedido)
    {
        DefaultTableModel modelo = (DefaultTableModel) tblItens.getModel();
        modelo.setNumRows(0);
        
        ResultSet dados = pedidos.listarPedido(pedido);
        
        try{
            while(dados.next())
            {
                modelo.addRow(new Object[]
                {
                    dados.getString(1),
                    dados.getString(2)
                });
            }

        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public void AttStatus(int cboIndex, int id)
    {
        switch(cboIndex)
        {
            case 0:
                pedidos.atualizaStatus("A", id);
                break;
            case 1:
                pedidos.atualizaStatus("E", id);
                break;
        }
    }
    
    public void AttStatus(int id)
    {
        pedidos.atualizaStatus("I", id);
    }
    
    private String verificaStatus()
    {
        try
        {
            String status = dados.getString(4);
            switch(status)
            {
                // A para Ativo
                case "A":
                    return status = "Em espera";
                // I para Inativo
                case "I":
                    return status = "Finalizado";
                // E para Em andamento
                case "E":
                    return status = "Em andamento";
            }
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        return "Erro";
    }
}
