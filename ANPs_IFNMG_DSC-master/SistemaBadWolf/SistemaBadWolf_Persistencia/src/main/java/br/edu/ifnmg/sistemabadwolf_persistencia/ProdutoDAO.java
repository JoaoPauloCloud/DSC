/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemabadwolf_persistencia;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.ProdutoRepositorio;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Produto;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author João Paulo
 */
public class  ProdutoDAO
        extends DataAccessObject<Produto> 
        implements ProdutoRepositorio {

    public ProdutoDAO() {
        super(Produto.class);
    }

    @Override
    public List<Produto> Buscar(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
    
}