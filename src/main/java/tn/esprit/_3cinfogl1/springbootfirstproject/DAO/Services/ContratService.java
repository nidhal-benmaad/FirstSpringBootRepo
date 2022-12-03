package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories.ContratRepo;

import java.util.List;

@Service
public class ContratService implements IcontratService {
    @Autowired // @Inject
    private ContratRepo cRepo;

    @Override
    public Contrat addContrat(Contrat c) {
        return cRepo.save(c); // if id not exist or null in DB
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return cRepo.save(c); // if id  exist in DB
    }

    @Override
    public void deleteContrat(Contrat c) {
        cRepo.delete(c);
    }

    @Override
    public void deleteContrat(Long id) {
        cRepo.deleteById(id);
    }

    @Override
    public List<Contrat> findAllContrat(Long id) {
        return (List<Contrat>) cRepo.findAll();
    }

    @Override
    public Contrat findContratById(Long id) {
        return cRepo.findById(id).get();
    }
}
