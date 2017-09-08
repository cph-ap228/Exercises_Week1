package facade;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Maksymilian
 */
public abstract class facade {
    protected EntityManager em;

    public facade(EntityManager em) {
        this.em = em;
    }

    protected void persist(Object entity) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(entity);
        em.flush();
        transaction.commit();
    }
}
