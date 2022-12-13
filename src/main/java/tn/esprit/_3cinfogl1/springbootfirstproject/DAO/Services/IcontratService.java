package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Contrat;

import java.util.List;

public interface IcontratService {
    Contrat addContrat(Contrat c);

    Contrat updateContrat(Contrat c);

    void deleteContrat(Contrat c);

    void deleteContratById(Long id);

    List<Contrat> findAllContrat(Long id);

    Contrat findContratById(Long id);

    List<Contrat> findContratByArchive(boolean arch);
}
