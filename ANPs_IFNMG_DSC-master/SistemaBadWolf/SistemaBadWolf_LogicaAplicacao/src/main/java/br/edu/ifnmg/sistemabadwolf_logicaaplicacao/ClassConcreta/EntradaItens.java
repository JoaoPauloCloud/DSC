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
@Table(name = "EntradaItens")
public class EntradaItens implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "itementrada_id", nullable = false)
    private ItemEntrada entrada_itens;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    
    private int quantidade;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal preco_unitario;

    public EntradaItens() {
        this.produto = null;
        this.preco_unitario = null;
        this.quantidade = 0;
        this.preco_unitario = new BigDecimal("0.00");
    }

    public EntradaItens(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco_unitario = produto.getPreco_unitario();
    }

    public ItemEntrada getEntrada_itens() {
        return entrada_itens;
    }

    public void setEntrada_itens(ItemEntrada entrada_itens) {
        this.entrada_itens = entrada_itens;
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
        hash = 61 * hash + Objects.hashCode(this.preco_unitario);
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
        final EntradaItens other = (EntradaItens) obj;
        if (!Objects.equals(this.preco_unitario, other.preco_unitario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntradaItens";
    }

    

    
    
    
    
   
}
