/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemabadwolf_terminal;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Usuario;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.UsuarioRepositorio;
import br.edu.ifnmg.sistemabadwolf_persistencia.UsuarioDAO;



/**
 *
 * @author João Paulo
 */


public class Terminal {
    
    
public static void Teste() {
    UsuarioRepositorio repo = new UsuarioDAO();
    repo.Salvar(new Usuario("Joao","@"));
    //repo.Salvar(new Usuario("Carlos","_IFNMG"));
    
    //clt.Salvar(new Cliente( "joaopaulolyz@gmail.com" ,,));
    //ClienteRepositorio clt = new ClienteDAO();               
    //clt.Salvar(new Cliente());        
    //clt.Salvar(new Cliente("joaopaulolyz@gmail.com","maquina quebrada",Estado.MG,"Começo de criação","januaria",33,"zona rural","12345678","ao",Genero.Masculino,Statu.Ativo,"32177722215","12345678",EstadoCivil.ANC));
     
   // FuncionarioRepositorio funci = new FuncionarioDAO();
   // funci.Salvar(new Funcionario());    
       
    }
        
    
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //Não a vitória sem esforço e dedicação 
        
        Teste();
        
       }
}