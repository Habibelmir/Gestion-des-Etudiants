package ma.ehei.gestionEtudiant.dao.mappers;

import ma.ehei.gestionEtudiant.modeles.Etudiant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EtudiantMapper implements RowMapper<Etudiant> {

    @Override
    public Etudiant mapRow(ResultSet rs, int rowNum) throws SQLException {
        Etudiant e = new Etudiant();
        e.setId(rs.getLong("id"));
        e.setNom(rs.getString("nom"));
        e.setPrenom(rs.getString("prenom"));
        return e;
    }
}
