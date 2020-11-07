/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DaoLogin;
import Model.Cliente;

/**
 *
 * @author lucas
 */
public class ControllerLogin
{
    private final View.InterfaceLogin tela;
    
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
            
            tela.dispose();
            new View.InterfacePedidos().setVisible(true);
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
