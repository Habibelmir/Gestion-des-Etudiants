package ma.ehei.gestionEtudiant.dao.impl.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import ma.ehei.gestionEtudiant.dao.EtudiantDao;
import ma.ehei.gestionEtudiant.modeles.Etudiant;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EtudiantHibernateDaoImpl implements EtudiantDao {

    /**
     * Le contexte de persistance est un environnement managé où les entités sont gérées par JPA.
     * Il garantit que les opérations sur les entités sont synchronisées avec la base de données sous-jacente.
     * Le contexte de persistance est responsable de la gestion du cycle de vie des entités, y compris la création, la lecture, la mise à jour et la suppression.
     */
    @PersistenceContext
    private EntityManager entityManager;

    public List<Etudiant> recuperer() {
        TypedQuery<Etudiant> query = entityManager.createQuery("FROM Etudiant", Etudiant.class);
        return query.getResultList();
    }


    public Etudiant recupererParNomEtPrenom(String nom, String prenom) {
        TypedQuery<Etudiant> query = entityManager.createQuery(
                "FROM Etudiant WHERE nom = :nom AND prenom = :prenom", Etudiant.class);
        query.setParameter("nom", nom);
        query.setParameter("prenom", prenom);
        return query.getSingleResult();
    }

    public void ajouter(Etudiant etudiant) {
        entityManager.persist(etudiant);
    }
}
