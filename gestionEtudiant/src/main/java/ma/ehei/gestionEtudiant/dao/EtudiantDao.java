package ma.ehei.gestionEtudiant.dao;

import ma.ehei.gestionEtudiant.modeles.Etudiant;

import java.util.List;

public interface EtudiantDao {

    List<Etudiant> recuperer();

    Etudiant recupererParNomEtPrenom(String nom, String prenom);

    void ajouter(Etudiant etudiant);
}
