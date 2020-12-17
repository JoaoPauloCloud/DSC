package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Genero;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Estado;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.CNH;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.EstadoCivil;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Statu;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Paulo
 */
@Entity
@Table(name = "Funcionarios")
@DiscriminatorValue(value = "1")
public class Funcionario extends Endereco implements Serializable {

       
    @Column(nullable=false, length = 250)
    private String nome;
    
    @Column(nullable = false, length = 1)
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
    
         
    @Column(nullable = false, length = 250)
    private String setor;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date datacontratacao;
    
    @Enumerated(EnumType.STRING)
    private CNH cnh;

    public Funcionario() {
        this.nome = "";
        this.sexo = Genero.Masculino;
        this.statu = Statu.Ativo;
        this.cpf = "00000000000";
        this.rg = "00000000";
        this.estadocivil = EstadoCivil.Casado;
        this.data_nacimento = new Date();
        this.setor = "";
        this.datacontratacao = new Date();
        this.cnh = CNH.nenhuma;
    }

    

    public Funcionario(String email,String bairro,Estado estado,String rua,String cidade,int numero,String complemento,String cep,String nome,Genero sexo, Statu statu, String cpf, String rg, EstadoCivil estadocivil, Date data_nacimento, String setor, Date datacontratacao, CNH cnh) {
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
        
        //funcionario
        this.nome = nome;
        this.sexo = sexo;
        this.statu = statu;
        this.cpf = cpf;
        this.rg = rg;
        this.estadocivil = estadocivil;
        this.data_nacimento = data_nacimento;
        this.setor = setor;
        this.datacontratacao = datacontratacao;
        this.cnh = cnh;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Date getData_nacimento() {
        return data_nacimento;
    }

    public void setData_nacimento(Date data_nacimento) {
        this.data_nacimento = data_nacimento;
    }

   
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Date getDatacontratacao() {
        return datacontratacao;
    }

    public void setDatacontratacao(Date datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    public CNH getCnh() {
        return cnh;
    }

    public void setCnh(CNH cnh) {
        this.cnh = cnh;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.cpf);
        hash = 89 * hash + Objects.hashCode(this.rg);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        return true;
    }
        

    

    @Override
    public String toString() {
        return this.nome;
    }

    
}
