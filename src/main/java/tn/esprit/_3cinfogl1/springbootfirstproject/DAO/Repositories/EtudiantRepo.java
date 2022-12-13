package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Etudiant;

import java.util.List;

public interface EtudiantRepo extends CrudRepository<Etudiant, Long> {

    List<Etudiant> findByEquipesIdEquipe(long id);

    List<Etudiant> findByEquipesIdEquipeAndEquipesDeSalle(long id, int salle);

    @Query("select e from Etudiant e where e.nomE=:lastname and e.prenomE=:firstname")
    Etudiant jibliEtudiantByEsmouLa9abou(@Param(value = "lastname") String nom,
                                         @Param(value = "firstname") String prenom);//JPQL

    @Query(value = "select * from etudiant where nome=:?1 and prenome=:?2 ", nativeQuery = true)
    Etudiant jibliEtudiantByEsmouLa9abouSql(String nom,
                                            String prenom);//SQL
}
