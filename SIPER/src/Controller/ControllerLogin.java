/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DaoLogin;
import Model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;

/**
 *
 * @author lucas
 */
public class ControllerLogin
{
    private final View.InterfaceLogin tela;
    //private final View.InterfacePedidos telaPedido;
    
    public ControllerLogin(View.InterfaceLogin tela)
    {
        this.tela = tela;
    }
    
    public void verificaCliente(String nome, String cpf)
    {
        boolean nomeInvalido = verificaNome(nome);
        boolean cpfInvalido = verificaCpf(cpf);

        if(nome.isEmpty()
                || cpfInvalido
                || nomeInvalido)
        {
            tela.exibeMensagem("Por favor, verifique as informações digitadas"
                    + " e tente novamente");
        }
        else
        {   
            if(cpf.isEmpty())
            {
                Cliente cliente = new Cliente(nome);
                
                DaoLogin daoLogin = new DaoLogin();
                
                daoLogin.adicionarSemCpf(cliente);
            }
            else
            {
                Cliente cliente = new Cliente(nome, cpf);
                
                DaoLogin daoLogin = new DaoLogin();
                
                daoLogin.adicionarComCpf(cliente);
            }
        }
    }
    
    public void recebeIdCliente(JLabel id)
    {
        DaoLogin daoLogin = new DaoLogin();
        ResultSet dados = daoLogin.retornarIdCliente();
        try
        {
            while(dados.next())
            {
                String str = dados.getString(1);
                id.setText(str);
            }
        }
        catch(SQLException error){
           throw new RuntimeException(error);

        }
    }
    
    private boolean verificaCpf(String cpf)
    {
        /*Verifica se o CPF é válido, ou seja, 
        todas suas casas estão preenchidas corretamente*/
        for(int i = 0; i < cpf.length(); i++)
        {
            for (int j = 0; j < cpf.length(); j++)
            {
                if(Character.isDigit(cpf.charAt(i))
                        && (cpf.charAt(j) == ' '))
                {
                   return true;
                }
            }
        }
        return false;
    }
    
    private boolean verificaNome(String nome)
    {
        // Verifica se o nome é válido ou seja, não possui valores númericos
        for(int i = 0; i < nome.length(); i++)
        {
            if(Character.isDigit(nome.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
}
