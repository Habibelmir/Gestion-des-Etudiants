package ma.ehei.gestionEtudiant.services;

import ma.ehei.gestionEtudiant.modeles.Etudiant;

import java.util.List;

public interface EtudiantService {

    List<Etudiant> recuperer();

    Etudiant ajouter(Etudiant etudiant);
}
