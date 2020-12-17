package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.ItemEntrada;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Produto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(EntradaItens.class)
public class EntradaItens_ { 

    public static volatile SingularAttribute<EntradaItens, ItemEntrada> entrada_itens;
    public static volatile SingularAttribute<EntradaItens, BigDecimal> preco_unitario;
    public static volatile SingularAttribute<EntradaItens, Produto> produto;
    public static volatile SingularAttribute<EntradaItens, Integer> quantidade;

}