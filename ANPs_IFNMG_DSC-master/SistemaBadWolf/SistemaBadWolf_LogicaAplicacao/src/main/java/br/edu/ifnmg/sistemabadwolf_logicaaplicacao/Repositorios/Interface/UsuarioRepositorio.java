/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Usuario;

/**
 *
 * @author João Paulo
 */
public interface UsuarioRepositorio extends Repositorio<Usuario> {
    public boolean autenticar(String login, String senha);
}
