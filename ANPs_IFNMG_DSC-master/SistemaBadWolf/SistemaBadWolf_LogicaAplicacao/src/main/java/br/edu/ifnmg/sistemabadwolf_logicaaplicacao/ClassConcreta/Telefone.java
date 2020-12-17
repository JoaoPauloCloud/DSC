/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.TelefoneTipo;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name="Telefones")
public class Telefone implements Serializable {

   @Id
   @ManyToOne
   @JoinColumn(name = "endereco_id", nullable = false)
   private Endereco endereco;
   
   @Enumerated(EnumType.STRING)
    private TelefoneTipo telefonetipo;

    public Telefone() {
      
        this.telefonetipo = TelefoneTipo.Residencial;  
        
    }
   
   
    public Telefone(Endereco endereco, TelefoneTipo telefones) {
       
        this.telefonetipo = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TelefoneTipo getTelefonetipo() {
        return telefonetipo;
    }

    public void setTelefonetipo(TelefoneTipo telefonetipo) {
        this.telefonetipo = telefonetipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.endereco);
        hash = 37 * hash + Objects.hashCode(this.telefonetipo);
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
        final Telefone other = (Telefone) obj;
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (this.telefonetipo != other.telefonetipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.telefonetipo.toString();
    }

     
    
    

    

}
