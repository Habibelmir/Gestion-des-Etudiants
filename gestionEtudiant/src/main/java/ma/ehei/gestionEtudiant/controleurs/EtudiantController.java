package ma.ehei.gestionEtudiant.controleurs;

import ma.ehei.gestionEtudiant.modeles.Etudiant;
import ma.ehei.gestionEtudiant.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> recupererTous(@RequestParam(value = "nom", required = false, defaultValue = "all") String nom) {
        return etudiantService.recuperer();
    }

    @PostMapping()
    public ResponseEntity<Etudiant> ajouter(@RequestBody Etudiant etudiant) {
        Etudiant etudiantAjoute = etudiantService.ajouter(etudiant);
        return new ResponseEntity<>(etudiantAjoute, HttpStatus.CREATED);
    }
}
