package ma.ehei.gestionEtudiant.modeles;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ln")
    private String nom;

    @Column(name = "fn")
    private String prenom;
    
    public Long getId() {
		return id;
	}
    public String getNom() {
		return nom;
	}
    public String getPrenom() {
		return prenom;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public void setNom(String nom) {
		this.nom = nom;
	}
    public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
