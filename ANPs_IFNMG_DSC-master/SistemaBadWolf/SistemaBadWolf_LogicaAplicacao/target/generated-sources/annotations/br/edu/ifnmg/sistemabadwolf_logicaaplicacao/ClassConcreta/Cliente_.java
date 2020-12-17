package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.EstadoCivil;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Genero;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.Enumeração.Statu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Endereco_ {

    public static volatile SingularAttribute<Cliente, String> rg;
    public static volatile SingularAttribute<Cliente, EstadoCivil> estadocivil;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Statu> statu;
    public static volatile SingularAttribute<Cliente, Genero> sexo;
    public static volatile SingularAttribute<Cliente, Date> data_nacimento;

}