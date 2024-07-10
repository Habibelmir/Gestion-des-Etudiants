package ma.ehei.gestionEtudiant.dao.impl;

import ma.ehei.gestionEtudiant.dao.EtudiantDao;
import ma.ehei.gestionEtudiant.dao.mappers.EtudiantMapper;
import ma.ehei.gestionEtudiant.modeles.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EtudiantDaoImpl implements EtudiantDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Etudiant> recuperer() {
        return jdbcTemplate.query("SELECT * FROM student", new EtudiantMapper());
    }

    @Override
    public Etudiant recupererParNomEtPrenom(String nom, String prenom) {
        String sql = "SELECT * FROM student WHERE ln = ? AND prenom = fn";
        List<Etudiant> etudiants = jdbcTemplate.query(sql, new EtudiantMapper(), nom, prenom);
        return etudiants.isEmpty() ? null : etudiants.get(0);
    }

    @Override
    public void ajouter(Etudiant etudiant) {
        String sql = "INSERT INTO student  (ln, fn) VALUES (?, ?)";
        jdbcTemplate.update(sql, etudiant.getNom(), etudiant.getPrenom());
    }
}
