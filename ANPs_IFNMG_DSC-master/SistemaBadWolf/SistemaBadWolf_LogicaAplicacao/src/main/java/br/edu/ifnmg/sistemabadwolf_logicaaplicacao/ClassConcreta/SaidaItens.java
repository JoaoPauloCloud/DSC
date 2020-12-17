/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name = "SaidaItens")
public class SaidaItens implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "itemsaida_id", nullable = false)
    private ItemSaida saida_itens;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    
    private int quantidade;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal preco_entrada;

    public SaidaItens() {
        this.produto = null;
        this.saida_itens = null;
        this.quantidade = 0;
        this.preco_entrada = new BigDecimal("0.00");
    }

    public SaidaItens(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco_entrada = produto.getPreco_unitario();
    }

    public ItemSaida getSaidaItens() {
        return saida_itens;
    }

    public void setSaidaItens(ItemSaida saida_itens) {
        this.saida_itens = saida_itens;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.saida_itens);
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
        final SaidaItens other = (SaidaItens) obj;
        if (!Objects.equals(this.saida_itens, other.saida_itens)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaidaItens";
    }

    

    
    
    
    
   
}
