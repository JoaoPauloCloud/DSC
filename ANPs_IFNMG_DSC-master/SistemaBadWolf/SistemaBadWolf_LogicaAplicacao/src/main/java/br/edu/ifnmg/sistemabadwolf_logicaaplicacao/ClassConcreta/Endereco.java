/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Estado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name = "Enderecos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER, name = "tipo")
public class Endereco implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "endereco")
    private List<Telefone> telefone;

  //endereço
    @Column(nullable = false, length = 250)
    private String email;
    @Column(nullable = false, length = 250)
    private String bairro;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Column(nullable = false, length = 250)
    private String rua;
    @Column(nullable = false, length = 250)
    private String cidade;
    @Column(nullable = false)
    private int numero;
    @Column(length = 250)
    private String complemento;
    @Column(nullable = false, length = 8)
    private String cep;
    
    //private Pattern regex_cep = Pattern.compile("\\d{5}\\-?\\d{3}");

    public Endereco() {
        this.id = 0L;
        //Endereço
        this.email = "";
        this.bairro = "";
        this.cidade = "";
        this.complemento = "";
        this.estado = Estado.AC;
        this.numero = 0;
        this.rua = "";
        this.cep = "00000000";
        this.telefone = new ArrayList<>();
        
    }
/*
    public Endereco(String email, String bairro, Estado estado, String rua, String cidade, int numero, String complemento, String cep) {
        this.email = email;
        this.bairro = bairro;
        this.estado = estado;
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /*
    public String getCep() {
        return  cep.substring(0, 5)+"-"+
                cep.substring(5, 8);
        
    }
    

    public void setCep(String cep){
        Matcher m = regex_cep.matcher(cep);
        if(m.matches())
            this.cep = cep.replace("-", "");
        
    }*/

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
        //Criando telefones
    
    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
    
    public void addTelefone(Telefone telefone){
        telefone.setEndereco(this);
        if(! this.telefone.contains(telefone))
            this.telefone.add(telefone);
    }
    
    public void removeTelefone(Telefone telefone){
        if(this.telefone.contains(telefone))
            this.telefone.remove(telefone);
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.id.toString();
    }
    
    
    
      

}
