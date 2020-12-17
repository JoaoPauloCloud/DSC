/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_persistencia;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.ItemEntrada;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.ItemEntradaRepositorio;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class ItemEntradaDAO extends DataAccessObject<ItemEntrada> implements ItemEntradaRepositorio {

    public ItemEntradaDAO() {
        super(ItemEntrada.class);
    }

    
    
    @Override
    public List<ItemEntrada> Buscar(ItemEntrada obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
