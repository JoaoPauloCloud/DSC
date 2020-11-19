/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemabadwolf_console;

import br.edu.ifnmg.sistemabadwolf.Interfece.UsuarioRepositorio;
import br.edu.ifnmg.sistemabadwolf_persistencia.UsuarioDAO;

/**
 *
 * @author João Paulo
 */
public class Terminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testando a primeira vez o usuario
        
        UsuarioRepositorio rep = new UsuarioDAO();
        
        Usuario u = new Usuario();
        u.setLogin("joao");
        u.setSenha("kkkkkk");
        
        if(rep.Salvar(u)){
        System.out.println("Muito bem");
        }else{
        System.out.print("Tente outra vez");
        }
        
        /**/
        
        
        
        
    }
    
}
