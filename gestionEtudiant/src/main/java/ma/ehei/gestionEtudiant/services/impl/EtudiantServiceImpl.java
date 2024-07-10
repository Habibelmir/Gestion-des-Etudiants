package ma.ehei.gestionEtudiant.services.impl;

import ma.ehei.gestionEtudiant.dao.EtudiantDao;
import ma.ehei.gestionEtudiant.modeles.Etudiant;
import ma.ehei.gestionEtudiant.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    private EtudiantDao etudiantJpaDaoImpl;

    @Override
    public List<Etudiant> recuperer() {
        return etudiantJpaDaoImpl.recuperer();
    }

    @Override
    public Etudiant ajouter(Etudiant etudiant) {
        etudiantJpaDaoImpl.ajouter(etudiant);
        System.out.println("bien ajouter" + etudiant.getNom()+" "+ etudiant.getPrenom());
        return etudiantJpaDaoImpl.recupererParNomEtPrenom(etudiant.getNom(), etudiant.getPrenom());
    }



}
