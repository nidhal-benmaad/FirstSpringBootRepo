package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode

//@Data remplace @getter, setter tostring et equals

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String prenomE;

    private String nomE;

    @Enumerated (EnumType.STRING)
    private Domaine domaine;

    @ManyToOne
    private Departement de;

    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrats;

    @ManyToMany(mappedBy = "etudiants")
    List<Equipe> equipes;
}