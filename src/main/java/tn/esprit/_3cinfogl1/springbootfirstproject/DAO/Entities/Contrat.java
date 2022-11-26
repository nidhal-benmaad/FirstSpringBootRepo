package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder // permet de construire le constructeur

@Table(name = "T_contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long idContrat;

    @Temporal(TemporalType.DATE)
    private Date    dateDebutC;
    @Temporal(TemporalType.DATE)
    private Date    dateFinC;

    @Enumerated (EnumType.STRING)
    private Specialite specialite;

    private boolean archive;
    private float montant;

    @Transient
    private float salaire;

    @ManyToOne
    Etudiant etudiant;








}