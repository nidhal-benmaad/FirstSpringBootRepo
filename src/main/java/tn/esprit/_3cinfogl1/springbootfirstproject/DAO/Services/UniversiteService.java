package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories.UniversiteRepo;

public class UniversiteService implements IUniversiteService {
    @Autowired
    private UniversiteRepo uRepo;
}
