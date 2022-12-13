package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepo  extends CrudRepository<Contrat,Long> {

    // select * from contrat where archive= (valeur passé en parametre)
    List<Contrat> getByArchive(boolean archive);

    // select * from contrat where archive= (valeur passé en parametre)
    List<Contrat> getByArchiveAndDateDebutC(boolean archive, Date date);

    // select * from contrat where dateDebutC between tow dates
    List<Contrat> getByDateDebutCBetween(Date date1, Date date2);

}
