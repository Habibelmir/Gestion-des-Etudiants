package ma.ehei.gestionEtudiant.dao.impl.spring.jpa;

import ma.ehei.gestionEtudiant.modeles.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {


    Etudiant findByNomAndPrenom(String nom, String prenom);
}
