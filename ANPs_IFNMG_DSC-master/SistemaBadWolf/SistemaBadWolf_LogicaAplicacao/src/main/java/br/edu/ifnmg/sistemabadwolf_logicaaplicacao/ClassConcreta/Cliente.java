package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Estado;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Statu;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Genero;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.EstadoCivil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.Inteligencia;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name="Clientes")
@DiscriminatorValue(value = "0")
public class Cliente extends Endereco implements Serializable { 

    @Column(nullable=false, length = 250)
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private Genero sexo;
    
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
    
    
    
    /*    
    List<String> telefones;
    */
    
    //private Pattern regex_cpf = Pattern.compile("\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}");

    public Cliente() {
        super();
        this.nome = "";
        this.cpf = "00000000000";               
        this.statu = Statu.Ativo;
        this.estadocivil = EstadoCivil.Casado;
        this.rg = "00000000";
        this.sexo = Genero.Masculino;
        this.data_nacimento = new Date();
        
    }  
    

    public Cliente(String email,String bairro,Estado estado,String rua,String cidade,int numero,String complemento,String cep,List<String> telefone,String nome, Genero sexo, Statu statu, String cpf, String rg, EstadoCivil estadocivil) /*throws ErroValidacaoException */{
        super();
        //Endereco
        this.setEmail(email);
        this.setBairro(bairro);
        this.setEstado(Estado.MG);
        this.setRua(rua);
        this.setCidade(cidade);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCep(cep);
        this.setTelefone(new ArrayList<>());
        
        //Cliente
        this.nome = nome;
        this.sexo = sexo;
        this.statu = statu;
        this.cpf = cpf;
        this.rg = rg;
        this.estadocivil = estadocivil;
        
        
    }
    /*
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ErroValidacaoException {
        if(nome.length() < 3)
            throw new ErroValidacaoException("O campo nome deve ter no mínimo 3 caracteres!");
        this.nome = nome;
    }*/


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    
    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }

    
    public Statu getStatu() {
        return statu;
    }

    public void setStatu(Statu statu) {
        this.statu = statu;
    }
/*
    public String getCpf() {
        return  cpf.substring(0, 3)+"."+
                cpf.substring(3, 6)+"."+
                cpf.substring(6, 9)+"-"+
                cpf.substring(9, 11);
    }

    public void setCpf(String cpf) {
        Matcher m = regex_cpf.matcher(cpf);
        if(m.matches())
            this.cpf = cpf.replace(".", "").replace("-", "");
        
    }
*/

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
    


    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cpf);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    

}
