package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Produto;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(ItemEntrada.class)
public class ItemEntrada_ { 

    public static volatile SingularAttribute<ItemEntrada, Produto> produto;
    public static volatile SingularAttribute<ItemEntrada, Date> data;
    public static volatile SingularAttribute<ItemEntrada, Usuario> usuario;
    public static volatile SingularAttribute<ItemEntrada, Integer> unidade;
    public static volatile SingularAttribute<ItemEntrada, Long> id;
    public static volatile SingularAttribute<ItemEntrada, Integer> quantidade;
    public static volatile SingularAttribute<ItemEntrada, BigDecimal> Valor_entrada;

}