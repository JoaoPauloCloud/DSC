/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.ClienteRepositorio;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.EnderecoRepositorio;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.FuncionarioRepositorio;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.ProdutoRepositorio;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Repositorios.Interface.UsuarioRepositorio;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author João Paulo
 */
public class RepositorioFTY {
    
    private static Properties propriedades = new Properties();
    
    private static UsuarioRepositorio usuario;
    private static ClienteRepositorio cliente;
    private static EnderecoRepositorio endereco;
    private static ProdutoRepositorio produto;
    //private static TransacaoRepositorio transacao;
    private static FuncionarioRepositorio funcionario;
    
    static {
        FileReader leitorArquivo = null;
        
        try {
            
            File arquivoPropriedades = new File("config.properties");
            leitorArquivo = new FileReader(arquivoPropriedades);    
            propriedades.load(leitorArquivo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                leitorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static Object getInstancia(String nomeclasse){
        try {
            Class classe = Class.forName(nomeclasse);
            Object instancia = classe.getDeclaredConstructor().newInstance();
            
            return instancia;
            
        } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static UsuarioRepositorio getUsuarioRepositorio() {
        if(usuario == null){
            String nomeclasse = propriedades.getProperty("UsuarioRepositorio");
            usuario = (UsuarioRepositorio) getInstancia(nomeclasse);
        }
        return usuario;
    }
    
    
    public static ClienteRepositorio getClienteRepositorio() {
        if(cliente == null){
            String nomeclasse = propriedades.getProperty("ClienteRepositorio");
            cliente = (ClienteRepositorio) getInstancia(nomeclasse);
        }
        return cliente;
    }
    
    
     public static EnderecoRepositorio getEnderecoRepositorio() {
        if(endereco == null){
            String nomeclasse = propriedades.getProperty("EnderecoRepositorio");
            endereco = (EnderecoRepositorio) getInstancia(nomeclasse);
        }
        return endereco;
    }
    
    public static FuncionarioRepositorio getFuncionarioRepositorio() {
        if(funcionario == null){
            String nomeclasse = propriedades.getProperty("FuncionarioRepositorio");
            funcionario = (FuncionarioRepositorio) getInstancia(nomeclasse);
        }
        return funcionario;
    }
    
    
    
}

