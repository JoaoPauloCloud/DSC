package br.edu.ifnmg.sistemabadwolf_persistencia;
import br.edu.ifnmg.sistemabadwolf.Interfece.Repositorio;
//import br.edu.ifnmg.sistemabadwolf.Interfece.repositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author João Paulo
 */
public abstract class DataAccessObject<T> implements Repositorio<T> {
    private EntityManager manager;
    private Class type;
    
    public DataAccessObject(Class type){
        var factory = Persistence.createEntityManagerFactory("UP");
        this.manager = factory.createEntityManager();
        this.type = type;
    }

    @Override
    public boolean Salvar(T obj) {
        EntityTransaction transacao = this.manager.getTransaction();
        try {
            transacao.begin();
            
            this.manager.persist(obj);
            
            transacao.commit();
            
            return true;
            
        } catch(Exception ex){
            transacao.rollback();
            System.out.println(ex);
            
            return false;
        }
        
    }

    @Override
    public boolean Apagar(T obj) {
        EntityTransaction transacao = this.manager.getTransaction();
        try {
            transacao.begin();
            
            this.manager.remove(obj);
            
            transacao.commit();
            
            return true;
            
        } catch(Exception ex){
            transacao.rollback();
            
            return false;
        }
    }

    @Override
    public T Abrir(Long id) {
        try {
            
            T obj = (T)this.manager.find(this.type, id);
            
            return obj;
            
        } catch(Exception ex){
            return null;
        }
    }

    public abstract List<T> Buscar(T obj);
    

}
