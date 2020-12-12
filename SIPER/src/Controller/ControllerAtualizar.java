/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DaoAdministrador;
import Model.Produto;
import View.Alter_cad;

/**
 *
 * @author Lucas
 */
public class ControllerAtualizar {
     private final View.Alter_cad tela;
     private DAO.DaoAdministrador atualizar = new DaoAdministrador();

    public ControllerAtualizar(Alter_cad tela) {
        this.tela = tela;
    }
     
    
     public void atualizadados(Produto produto){
         atualizar.alterar(produto);
         
        
     }
}