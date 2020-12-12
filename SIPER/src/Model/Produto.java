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
public class Produto 
{
    private String nome;
    private double preco;
    private int fkCategoria;

    public Produto(String nome, double preco, int fkCategoria) {
        this.nome = nome;
        this.preco = preco;
        this.fkCategoria = fkCategoria;
    }
    
    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public int getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(int fkCategoria) {
        this.fkCategoria = fkCategoria;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    
}
