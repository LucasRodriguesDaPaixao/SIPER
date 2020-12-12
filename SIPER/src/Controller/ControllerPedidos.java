/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ControllerPedidos {
    private final View.InterfacePedidos tela;
    private DAO.DaoPedidos Pedidos = new DAO.DaoPedidos();
    
    public ControllerPedidos(View.InterfacePedidos tela)
    {
        this.tela = tela;
    }
    
    //Carrega tabela de carrinho do cliente
    /*public void carregarLista(JTable tabela){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        ResultSet dados = Pedidos.listar();
        
        try{
             while(dados.next()){
                 modelo.addRow(new Object[]{
                    dados.getString(5),
                    dados.getString(4)
                 });
             }
         }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }*/
    //Carrega tabelas do menu
    public void carregarLista(JTable tabela, String categoria){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        
        ResultSet menu = Pedidos.listar(categoria);
        
        try{
            
            while(menu.next())
            {
                modelo.addRow(new Object[]{
                    menu.getString(1),
                    menu.getString(2),
                    menu.getString(3),
                    menu.getString(4)
                });
            }

        }
        catch(SQLException error){
           throw new RuntimeException(error);

        }
    }
    
    public void inserirPedido(int idCliente)
    {
        Pedidos.adicionarPedido(idCliente);
    }
    
    public int getIdPedido()
    {
        int idPedido = Pedidos.receberIdPedido();
        return idPedido;
    } 
    
    public void inserirPedidoProduto(Produto produto, int idProduto, int idPedido)
    {
        ResultSet rs = Pedidos.receberIdProduto(produto.getNome());
        
        try
        {
            while(rs.next())
            {
                Pedidos.adicionarPedidoProduto(idProduto, produto, idPedido);
            }
        }
        
        catch(SQLException error)
        {
           throw new RuntimeException(error);

        }
    }
    
}
