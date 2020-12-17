/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_persistencia;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Revendedor;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.RevendedorRepositorio;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class RevendedorDAO extends DataAccessObject<Revendedor> implements RevendedorRepositorio {

    public RevendedorDAO() {
        super(Revendedor.class);
    }

    @Override
    public List<Revendedor> Buscar(Revendedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
