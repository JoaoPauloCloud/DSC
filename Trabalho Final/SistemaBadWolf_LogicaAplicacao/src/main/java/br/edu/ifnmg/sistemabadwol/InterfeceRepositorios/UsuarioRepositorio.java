

package br.edu.ifnmg.sistemabadwol.InterfeceRepositorios;

import br.edu.ifnmg.sistemabadwolf.DomainModel.Usuario;

/**
 *
 * @author João Paulo
 */
public interface UsuarioRepositorio extends Repositorio<Usuario>  {

    public boolean autenticar(String login, String senha);
     
}
