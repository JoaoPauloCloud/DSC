package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, BigDecimal> preco_unitario;
    public static volatile SingularAttribute<Produto, Integer> estoque;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, BigDecimal> preco_entrada;
    public static volatile SingularAttribute<Produto, Long> id;

}