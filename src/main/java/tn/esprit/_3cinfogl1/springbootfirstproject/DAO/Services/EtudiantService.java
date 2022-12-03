package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories.EtudiantRepo;

public class EtudiantService implements IEtudiantService {
    @Autowired
    private EtudiantRepo etRepo;
}
