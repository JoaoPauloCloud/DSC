package br.edu.ifnmg.sistemabadwolf.DomainModel;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name="Produtos")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 250, nullable = false, unique = true)
    private String nome;
    
    @Column(precision = 8, scale = 2)
    //Preço de entrada
    private BigDecimal precoEntrada;
    
    @Column(precision = 8, scale = 2)
    //Preço de venda
    private BigDecimal precoVenda;
    
    @Column(nullable = false, table = "estoques")
    private int estoque;
    
    @Version
    private long version;    
    
    
    
        
    @ManyToOne
    private Usuario usuario;

    public Produto() {
        this.id = 0L;
        this.nome = "";
        this.precoEntrada = new BigDecimal("0.00");
        this.estoque = 0;
        this.version = 1;
    }

    public Produto(String nome, String precoEntrada,String precoVenda, int estoque) {
        this.id = 0L;
        this.nome = nome;
        //Preço de Entrada
        this.precoEntrada = new BigDecimal(precoEntrada);
        //Preço de Venda
        this.precoVenda = new BigDecimal(precoVenda);
        this.estoque = estoque;
        this.version = 1;
    }
    
    
        

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
