package br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta;

import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.ItemSaida;
import br.edu.ifnmg.sistemabadwolf_logicaaplicacao.ClassConcreta.Produto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-16T23:06:17")
@StaticMetamodel(SaidaItens.class)
public class SaidaItens_ { 

    public static volatile SingularAttribute<SaidaItens, Produto> produto;
    public static volatile SingularAttribute<SaidaItens, ItemSaida> saida_itens;
    public static volatile SingularAttribute<SaidaItens, BigDecimal> preco_entrada;
    public static volatile SingularAttribute<SaidaItens, Integer> quantidade;

}