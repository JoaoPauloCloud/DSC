/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_persistencia;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Funcionario;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.FuncionarioRepositorio;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class FuncionarioDAO extends DataAccessObject<Funcionario> implements FuncionarioRepositorio {

    public FuncionarioDAO() {
        super(Funcionario.class);
        
    }

    @Override
    public List<Funcionario> Buscar(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

}
