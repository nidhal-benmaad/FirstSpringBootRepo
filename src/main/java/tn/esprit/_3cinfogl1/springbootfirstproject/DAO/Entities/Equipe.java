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
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String nomEquipe;

    @Enumerated (EnumType.STRING)
    private Niveau niveau;

    @OneToOne
    DetailsEquipe de;
    @ManyToMany
    List<Etudiant> etudiants;
}