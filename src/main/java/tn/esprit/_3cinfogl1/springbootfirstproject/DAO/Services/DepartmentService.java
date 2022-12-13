package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Departement;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories.DepartmentRepo;

import java.util.List;

public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentRepo dRepo;

    @Override
    public Departement addDepartement(Departement c) {
        return null;
    }

    @Override
    public Departement updateDepartement(Departement c) {
        return null;
    }

    @Override
    public void deleteDepartement(Departement c) {

    }

    @Override
    public void deleteDepartement(Long id) {

    }

    @Override
    public List<Departement> findAllDepartement(Long id) {
        return null;
    }
}
