/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class Pedido
{
    private double valorTotal;
    private int fkCliente;
    
    public Pedido(double valorTotal, int fkCliente)
    {
        this.valorTotal = valorTotal;
        this.fkCliente = fkCliente;
    }

    public int getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(int fkCliente) {
        this.fkCliente = fkCliente;
    }
    
    public double getValorTotal() 
    {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) 
    {
        this.valorTotal = valorTotal;
    }
    
    
}
