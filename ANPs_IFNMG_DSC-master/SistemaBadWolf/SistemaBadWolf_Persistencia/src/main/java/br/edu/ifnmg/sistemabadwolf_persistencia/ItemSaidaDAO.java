/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_persistencia;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.ItemSaida;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.ItemSaidaRepositorio;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class ItemSaidaDAO extends DataAccessObject<ItemSaida> implements ItemSaidaRepositorio {

    public ItemSaidaDAO() {
        super(ItemSaida.class);
    }

    @Override
    public List<ItemSaida> Buscar(ItemSaida obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

}
