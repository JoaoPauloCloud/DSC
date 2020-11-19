

package br.edu.ifnmg.sistemabadwolf.Interfece;

import br.edu.ifnmg.sistemabadwolf.DomainModel.Usuario;

/**
 *
 * @author João Paulo
 */
public interface UsuarioRepositorio extends Repositorio<Usuario> {
    public boolean autenticar(String login, String senha);
}
