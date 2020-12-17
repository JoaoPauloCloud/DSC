package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Produto;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(ItemSaida.class)
public class ItemSaida_ { 

    public static volatile SingularAttribute<ItemSaida, Produto> produto;
    public static volatile SingularAttribute<ItemSaida, Date> data;
    public static volatile SingularAttribute<ItemSaida, Usuario> usuario;
    public static volatile SingularAttribute<ItemSaida, Integer> unidade;
    public static volatile SingularAttribute<ItemSaida, Long> id;
    public static volatile SingularAttribute<ItemSaida, BigDecimal> Valor_venda;
    public static volatile SingularAttribute<ItemSaida, Integer> quantidade;

}