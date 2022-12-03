package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories.DetailEquipeRepo;

public class DetailEquipeService implements IDetailEquipeService{
    @Autowired
    private DetailEquipeRepo deRepo;
}
