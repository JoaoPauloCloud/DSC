package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.CNH;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.EstadoCivil;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Genero;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Statu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ extends Endereco_ {

    public static volatile SingularAttribute<Funcionario, String> setor;
    public static volatile SingularAttribute<Funcionario, String> rg;
    public static volatile SingularAttribute<Funcionario, EstadoCivil> estadocivil;
    public static volatile SingularAttribute<Funcionario, String> cpf;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Date> datacontratacao;
    public static volatile SingularAttribute<Funcionario, Statu> statu;
    public static volatile SingularAttribute<Funcionario, Genero> sexo;
    public static volatile SingularAttribute<Funcionario, CNH> cnh;
    public static volatile SingularAttribute<Funcionario, Date> data_nacimento;

}