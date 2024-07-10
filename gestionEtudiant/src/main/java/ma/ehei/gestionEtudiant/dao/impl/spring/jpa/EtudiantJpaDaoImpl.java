package ma.ehei.gestionEtudiant.dao.impl.spring.jpa;

import ma.ehei.gestionEtudiant.dao.EtudiantDao;
import ma.ehei.gestionEtudiant.modeles.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EtudiantJpaDaoImpl implements EtudiantDao {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> recuperer() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant recupererParNomEtPrenom(String nom, String prenom) {
        return etudiantRepository.findByNomAndPrenom(nom, prenom);
    }

    @Override
    public void ajouter(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }
}
