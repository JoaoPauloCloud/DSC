package br.edu.ifnmg.sistemabadwolf.DomainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.Inteligencia;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name="Pessoas")
public class Pessoa implements Serializable { 

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable=false, length = 250)
    private String nome;
    
    @Column(nullable = false, length = 1)
    private String sexo;
    
    @Column(nullable = false)
    private Statu statu;
    
    @Column(nullable = false, length = 11)
    private String cpf;
    
    @Column(nullable = false, length = 8)
    private String rg;
    
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadocivil;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date data_nacimento;
    
    @Column(nullable = false, length = 250)
    private String email;
    
    /*    
    List<String> telefones;
    */
    
     //endereço
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
    @Column(nullable = false, length = 250)
    private String complemento;
    @Column(nullable = false, length = 7)
    private String cep;
       

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Statu getStatu() {
        return statu;
    }

    public void setStatu(Statu statu) {
        this.statu = statu;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nacimento() {
        return data_nacimento;
    }

    public void setData_nacimento(Date data_nacimento) {
        this.data_nacimento = data_nacimento;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
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
