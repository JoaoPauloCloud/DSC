/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_persistencia;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Endereco;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.EnderecoRepositorio;
import java.util.List;


/**
 *
 * @author João Paulo
 */
public class EnderecoDAO
        extends DataAccessObject<Endereco>
        implements EnderecoRepositorio {

    public EnderecoDAO() {
        super(Endereco.class);
    }
/*
    @Override
    public List<Endereco> Buscar(Endereco obj) {
        
        String jpql = "select a from Pessoa a";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj.getNome().length() > 0){
            filtros += "a.nome like :nome"; 
            parametros.put("nome", obj.getNome()+"%");
        }
        
        if(obj.getTipo() != null){
            if(filtros.length() > 0)
                filtros += " and ";
            filtros += "a.tipo = :tipo"; 
            parametros.put("tipo", obj.getTipo());
        }
        
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        var query = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet()){
            query.setParameter(chave, parametros.get(chave));
        }
        
        return query.getResultList();
    }*/

    @Override
    public List<Endereco> Buscar(Endereco obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
